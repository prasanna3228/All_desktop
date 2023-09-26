const nm = require("nodemailer");
const express = require("express");
const sqlite3 = require("sqlite3").verbose();

const app = express();
const port = 5500;

app.use(express.json());
app.use(express.urlencoded({ extended: false }));

const db = new sqlite3.Database("my_database.db", (err) => {
  if (err) {
    console.error(err.message);
  } else {
    console.log("Connected to SQLite3 database");
  }
});

db.run(`
  CREATE TABLE IF NOT EXISTS users (
    id INTEGER PRIMARY KEY,
    name TEXT NOT NULL,
    email TEXT NOT NULL
  )
`);

let name = "";
let email = "";

app.get("/", (req, res) => {
  res.sendFile(__dirname + "/index1.html");
});

app.post("/form", async (req, res) => {
  // Make the route handler async
  name = req.body.name;
  email = req.body.email;
  console.log(email);
  console.log(name);

  const sql = `INSERT INTO users (name, email) VALUES (?, ?)`;
  db.run(sql, [name, email], (err) => {
    if (err) {
      console.log(err);
      res.status(500).send("Error inserting form data into the database.");
    } else {
      console.log("Form data inserted successfully");

      // After the data is inserted, send the email
      sendEmail()
        .then(() => {
          res.redirect("/");
        })
        .catch((error) => {
          console.error("Email sending error:", error);
          res.redirect("/");
        });
    }
  });
});

app.listen(port, () => {
  console.log(`Server running on http://localhost:${port}`);
});

async function sendEmail() {
  const transporter = nm.createTransport({
    service: "gmail",
    auth: {
      user: "kumar950204@gmail.com",
      pass: "wtezhecsnxiconrb",
    },
  });

  const options = {
    from: "kumar950204@gmail.com",
    to: email, // Use the 'email' variable declared above
    subject: "Testing node emails",
    text: name, // Use the 'name' variable declared above
  };

  try {
    const info = await transporter.sendMail(options);
    console.log(`Email sent: ${info.response}`);
  } catch (error) {
    console.log("Email sending error:", error);
    throw error;
  }
}

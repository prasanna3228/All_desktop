// Import the required modules.
const express = require("express");
const sqlite3 = require("sqlite3").verbose(); // Note: Use 'verbose' to get more information during debugging.

// Create an Express app.
const app = express();
const port = 5500;

// Middleware to parse incoming JSON data and URL-encoded data.
app.use(express.json());
app.use(express.urlencoded({ extended: false }));

// Create a database connection object.
const db = new sqlite3.Database("my_database.db", (err) => {
  if (err) {
    console.error(err.message);
  } else {
    console.log("Connected to SQLite3 database");
  }
});

// Create the 'users' table in the database if it doesn't exist.
db.run(`
  CREATE TABLE IF NOT EXISTS users (
    id INTEGER PRIMARY KEY,
    name TEXT NOT NULL,
    email TEXT NOT NULL
  )
`);

// Create a route to serve the index.html file.
app.get("/", (req, res) => {
  res.sendFile(__dirname + "/index1.html");
});

// Create a route to handle the POST request from the form.
app.post("/form", (req, res) => {
  // Get the form data from the request.
  const name = req.body.name;
  const email = req.body.email;

  // Insert the form data into the database.
  const sql = `INSERT INTO users (name, email) VALUES (?, ?)`;
  db.run(sql, [name, email], (err) => {
    if (err) {
      console.log(err);
      res.status(500).send("Error inserting form data into the database.");
    } else {
      console.log("Form data inserted successfully");

      res.redirect("/");
    }
  });
});

// Start the Express server.
app.listen(port, () => {
  console.log(`Server running on http://localhost:${port}`);
});

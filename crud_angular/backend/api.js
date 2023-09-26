const express = require("express");
const { open } = require("sqlite");
const sqlite3 = require("sqlite3");
const bodyParser = require("body-parser");
const path = require("path");
const { request } = require("http");
const cors = require("cors");

const dbPath = path.join(__dirname, "db.db");
let db = null;

const app = express();

app.use(bodyParser.json()); //important

const initialDatabase = async () => {
  try {
    db = await open({
      filename: dbPath,
      driver: sqlite3.Database,
    });
    app.listen(3004, () => {
      console.log("server started at port 3004");
    });
  } catch (e) {
    console.log(`db server : ${e.message}`);
  }
};
initialDatabase();

app.get("/test", (req, res) => {
  res.send("get method success ");
});

app.get("/mobiles", async (req, res) => {
  const getMobileData = `
    select * from mobiles
    `;
  const mobilesArray = await db.all(getMobileData);
  res.setHeader("Access-Control-Allow-Origin", "*");
  res.send(mobilesArray);
});

app.post("/mobiles", async (req, res) => {
  const { id, name, price, ram, storage } = req.body;

  const createUserQuery = `
      insert into mobiles(id,name,price,ram,storage)
      values(
          '${id}',
          '${name}',
          '${price}',
          '${ram}',
          '${storage}' )`;
  try {
    const result = await db.run(createUserQuery);
    res
      .status(201)
      .json({ message: "User created successfully", lastID: result.lastID });
  } catch (error) {
    console.error(error);
    res.status(500).json({ error: "Internal server error" });
  }
});

app.put("/mobiles", (req, res) => {
  res.send("mobiles updated");
});

app.delete("/mobiles/:id", async (req, res) => {
  const { id } = req.params;
  const deleteMobile = `DELETE FROM mobiles WHERE Id=${id}`;
  res.setHeader("Access-Control-Allow-Origin", "*");
  await db.run(deleteMobile);

  res.send("mobiles data deleted");
});

const express = require("express");

const app = express();

let users = [
  {
    id: 1,
    name: "leanne graham",
  },
  {
    id: 1,
    name: "prasanna",
  },
];

app.get("/users", (req, res) => {
  res.setHeader("Access-Control-Allow-Origin", "http://127.0.0.1:5500");
  res.send(users);
});

app.listen(4000, () => {
  console.log("server working 4000");
});

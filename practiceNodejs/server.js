const http = require("http");
const chnk = require("loadsh");
// require("dotenv").config();
const PORT = process.env.PORT || 5001;

const server = http.createServer((rqe, res) => {
  res.statusCode = 200;
  res.setHeader("Content-Type", "application/json");
  res.write(JSON.stringify({ message: "Hello prasanna  to Nodejs course" }));
  res.end();
});

server.listen(PORT, () => {
  console.log(`server started on port :${PORT}`);
});

let a = [1, 2, 3, 4];
b = chnk.chunk(a, 2);

console.log(b);

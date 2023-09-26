console.log("start operation");

function sleep() {
  console.log("operation is runnig");
  setTimeout(() => {
    console.log("set interval function");
  }, 2000);
}
sleep();

console.log("last task");

import defaultExport from "module-name";
import * as name from "module-name";
import { export1 } from "module-name";

const btn = document.getElementById("btn");
let count = 0;
var promise = import("module-name");
var something = "hello_world";

/*
    multi-line comment
*/
function render() {
  btn.innerText = `Count: ${count}`;
  console.log("pressed");
}

btn.addEventListener("click", () => {
  // Count from 1 to 10.
  if (count < 10) {
    count += 1;
    render();
  }
});

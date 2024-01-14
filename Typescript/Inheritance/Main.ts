import { Shape } from "./Shape";
import { Circle } from "./Circle";

// If Shape is an abstract class, we can not create a Shape instance
// let myShape = new Shape(10, 20);
// console.log(myShape.getInfo())
let myCircle = new Circle(5, 5, 5);
console.log(myCircle.getInfo())

// Shape and its sub class
let theShapes: Shape[] = [];

// theShapes.push(myShape);
theShapes.push(myCircle);

for(let theShape of theShapes){
    console.log(theShape.getInfo());
    console.log("Area = " + theShape.calculateArea())
}
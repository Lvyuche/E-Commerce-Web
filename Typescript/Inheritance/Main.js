"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const Circle_1 = require("./Circle");
// If Shape is an abstract class, we can not create a Shape instance
// let myShape = new Shape(10, 20);
// console.log(myShape.getInfo())
let myCircle = new Circle_1.Circle(5, 5, 5);
console.log(myCircle.getInfo());
// Shape and its sub class
let theShapes = [];
// theShapes.push(myShape);
theShapes.push(myCircle);
for (let theShape of theShapes) {
    console.log(theShape.getInfo());
    console.log("Area = " + theShape.calculateArea());
}

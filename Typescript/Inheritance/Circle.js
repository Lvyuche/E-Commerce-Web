"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Circle = void 0;
const Shape_1 = require("./Shape");
class Circle extends Shape_1.Shape {
    constructor(subX, subY, _r) {
        super(subX, subY);
        this._r = _r;
    }
    // override the getInfo method
    getInfo() {
        return super.getInfo() + ' radius = ${this._r}';
    }
    calculateArea() {
        return Math.PI * Math.pow(this._r, 2);
    }
}
exports.Circle = Circle;

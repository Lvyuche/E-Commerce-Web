import { Shape } from "./Shape";

export class Circle extends Shape{

    constructor( subX: number, subY: number, private _r: number){
        super(subX, subY)
    }


    // override the getInfo method
    getInfo(): string {
        return super.getInfo() + ' radius = ${this._r}';
    }

    calculateArea(): number {
        return Math.PI * Math.pow(this._r, 2);
    }
}
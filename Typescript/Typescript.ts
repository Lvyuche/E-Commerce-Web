class Customer {

    // private _firstName: string;
    // private _lastName: string;

    // constructor(fisrt: string, last: string){
    //     this._firstName = fisrt;
    //     this._lastName = last;
    // }

    constructor(private _firstName: string, private _lastName: string){
        
    }

    public get firstName(): string {
        return this._firstName;
    }
    public set firstName(value: string) {
        this._firstName = value;
    }

    public get lastName(): string {
        return this._lastName;
    }
    public set lastName(value: string) {
        this._lastName = value;
    }

}

let customer = new Customer("Yuxuan", "Lyu"); 

console.log(customer.firstName);
/* -----4 ways to declare a variable------- */

let myName : string = 'Guru';

console.log(myName, typeof myName);

let language = 'Typescript';

console.log(language, typeof language);

let num : number;

console.log(num, typeof num);

let address;

address = 'Madhubani';
address = 847228;

console.log(address, typeof address);

let calAge = function() : void {     // If we dont return anything then we have to give annotation type is void to function.
    console.log("Age is 23");
}
calAge();

/* -------Class, object and inheritance------- */

class Person {

    constructor(public name : string, public age : number) {
        // If we use access specifier within paranthisis in constructor then need not to use (this.name=name).
    }
}
let person1 = new Person("Rahul", 25);
console.log(person1);

class Student extends Person {          // Inheritence

    constructor(name : string, age : number, public rollNo : number) {
        super(name, age);       // Give access specifier only to those parameter which is not in super class.
    }
}
let student1 = new Student("John", 23, 100);
console.log(student1);
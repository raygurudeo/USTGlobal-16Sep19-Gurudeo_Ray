/* -----4 ways to declare a variable------- */
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var myName = 'Guru';
console.log(myName, typeof myName);
var language = 'Typescript';
console.log(language, typeof language);
var num;
console.log(num, typeof num);
var address;
address = 'Madhubani';
address = 847228;
console.log(address, typeof address);
var calAge = function () {
    console.log("Age is 23");
};
calAge();
/* -------Class, object and inheritance------- */
var Person = /** @class */ (function () {
    function Person(name, age) {
        this.name = name;
        this.age = age;
        // If we use access specifier within paranthisis in constructor then need not to use (this.name=name).
    }
    return Person;
}());
var person1 = new Person("Rahul", 25);
console.log(person1);
var Student = /** @class */ (function (_super) {
    __extends(Student, _super);
    function Student(name, age, rollNo) {
        var _this = _super.call(this, name, age) || this;
        _this.rollNo = rollNo;
        return _this;
    }
    return Student;
}(Person));
var student1 = new Student("John", 23, 100);
console.log(student1);

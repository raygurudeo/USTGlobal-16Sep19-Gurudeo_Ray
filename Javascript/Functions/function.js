// Named Function
function add(num1, num2){
    console.log(`Sum = ${num1+num2}`);
}
add(10,20);

// Function Expression(Anonymous).

var sub = function(num1, num2){
    return num1 - num2;
}
var res = sub(20, 10);
console.log(`Sub = ${res}`);

console.log('========');
//console.log('Hello')   seicolon is here mandatory before self invoke fun like ().()
(function(num1, num2){
    console.log(num1 * num2);
})(10,20)

// ======

var div = (num1, num2) => {
    console.log(num1/num2);
}
div(10,2);

var div1 = num1 => {
    console.log('value = ',num1);
}
//-----Or

var div2 = num1 => console.log(num1);
var value = add(10,20);

//-------

greeting('chandan');
function greeting(msg){
    console.log(msg);
}

greet('Rahul');
var greet = function(msg){
    console.log(msg);
}

greets('Sonu');
var greets = (msg) => {
    console.log(msg);
}
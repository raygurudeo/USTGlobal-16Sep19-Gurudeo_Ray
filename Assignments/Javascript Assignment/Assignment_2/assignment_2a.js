// -------Factorial----------->

function fact(num) {   // named method
    if(num === 0) {
        return 1;
    }
    else {
        return num * fact(num - 1);
    }
}
console.log(`Factorial = ${fact(5)}`);

var fact1 = function(num){    // Anonymous method
    if(num === 0) {
        return 1;
    }
    else {
        return num * fact(num - 1);
    }
}
console.log(`Factorial = ${fact1(5)}`);          

(function(num){                         // Self invoked method
    if(num === 0) {
        return 1;
    }
    else {
        return num * fact(num - 1);
    }
})(6);

var fact2 = (num) => {              // Arrow function
    if(num === 0) {
        return 1;
    }
    else {
        return num * fact(num - 1);
    }
}
console.log(`Factorial = ${fact2(5)}`);
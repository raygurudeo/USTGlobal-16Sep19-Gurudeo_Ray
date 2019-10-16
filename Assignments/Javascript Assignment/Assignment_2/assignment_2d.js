//  -------Sum of element of an array----------->

function sumOfElementOfArray(arr) {                 // Named function
    var sum = 0;
    for (var i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    return sum;
}
var arr = [1, 2, 3];
console.log(`sum = ${sumOfElementOfArray(arr)}`);

var sumOfElementOfArray2 = function(arr) {          // Anonymous function
    var sum = 0;
    for (var i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    return sum;
}
console.log(`sum = ${sumOfElementOfArray2([1,2,5])}`);

(function(arr){                                     //   Self Invoked function
    var sum = 0;
    for (var i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    console.log(`Sum = ${sum}`);
})(new Array(1,2,3));

var sumOfElementOfArray3 = (arr) => {               // Arrow function
    var sum = 0;
    for (var i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    return sum;
}
console.log(`sum = ${sumOfElementOfArray2([1,2,5])}`);
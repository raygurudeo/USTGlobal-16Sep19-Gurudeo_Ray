//-------Number is prime or not------>

function isPrime1(num) {                     // Named function
    var count=0;
    for(var i = 2; i <= num/2; i++) {
        if(num % i === 0) {
            count++;
        }
    }
    return (count <= 0) ? 'a prime' : 'not a prime';
}
console.log(`It's ${isPrime1(3)}`);

var isPrime2 = function(num) {                      // Anonymous function
    var count=0;
    for(var i = 2; i <= num/2; i++) {
        if(num % i === 0) {
            count++;
        }
    }
    return (count <= 0) ? 'a prime' : 'not a prime';
}
console.log(`It's ${isPrime2(3)}`);

(function(num){                                     // Self invoked function
    var count=0;
    for(var i = 2; i <= num/2; i++) {
        if(num % i === 0) {
            count++;
        }
    }
    return (count <= 0) ? console.log('Its a prime number.') : console.log('Its not a prime number.');
})(3);

var isPrime3 = (num) => {                       //Arrow function
    var count=0;
    for(var i = 2; i <= num/2; i++) {
        if(num % i === 0) {
            count++;
        }
    }
    return (count <= 0) ? 'a prime' : 'not a prime';
}
console.log(`It's ${isPrime3(3)}`);


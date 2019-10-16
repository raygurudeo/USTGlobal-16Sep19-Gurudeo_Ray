//-------Circumfrence of a circle------------>


function circumFrenceOfCircle1(radius) {         // Named function
    return 2*3.14*radius;
}
console.log(`Circumfrence of circle is = ${circumFrenceOfCircle1(5)}`);

var circumFrenceOfCircle2 = function(radius) {      // Anonymous function
    return 2*3.14*radius;
}
console.log(`Circumfrence of circle is = ${circumFrenceOfCircle2(5)}`);

(function(radius){                                                              // Self invoked function
    console.log(`Circumfrence of circle is = ${circumFrenceOfCircle2(5)}`);
})(5);

var circumFrenceOfCircle3 = (radius) => {
    return 2*3.14*radius;
}
console.log(`Circumfrence of circle is = ${circumFrenceOfCircle3(5)}`);     // Arrow function

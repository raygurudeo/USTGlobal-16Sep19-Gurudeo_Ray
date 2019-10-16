// ---------fibonacci series------------>

function fibonacci1(num1, num2, len) {        // Named method
    console.log(num1);
    console.log(num2);
    var temp=0;
    for(var i = 0; i < len-2; i++){
        temp = num1 + num2;
        num1 = num2;
        num2 = temp;
        console.log(temp);
    }
}
fibonacci1(0, 1, 7);

var fibonacci2 = function(num1, num2, len) {    //Anonymus method
    console.log(num1);
    console.log(num2);
    var temp=0;
    for(var i = 0; i < len-2; i++){
        temp = num1 + num2;
        num1 = num2;
        num2 = temp;
        console.log(temp);
    }
}
fibonacci2(0, 1, 7);

(function(num1, num2, len){                     // Self invoked method
    console.log(num1);
    console.log(num2);
    var temp=0;
    for(var i = 0; i < len-2; i++){
        temp = num1 + num2;
        num1 = num2;
        num2 = temp;
        console.log(temp);
    }
})(0, 1, 7);

var fibonacci3 = (num1, num2, len) => {         // Arrow function
    console.log(num1);
    console.log(num2);
    var temp=0;
    for(var i = 0; i < len-2; i++){
        temp = num1 + num2;
        num1 = num2;
        num2 = temp;
        console.log(temp);
    }
}
fibonacci3(0, 1, 7);
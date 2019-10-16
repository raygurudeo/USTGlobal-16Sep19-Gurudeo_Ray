function first(){
    setTimeout( function()  {
        console.log('First fun executed');
    },1000)
}
function second(){
    console.log('Second fun executed');
}
first();
second();
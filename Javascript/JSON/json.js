const person = {
    name : 'Sundra',
    age : 100,
    color : 'White',
    address :{
        city : 'Bengaluru',
        state : 'Karnataka',
        pincode : 560076
    },
    hobbies : ['Coding', 'Bird watching', 'Singing']
}

console.log(`Javascript object = ${person}`);
const jsonObject = JSON.stringify(person);          // Converting js obj to json obj
console.log(`JSON object = ${jsonObject}`);

const jsObject = JSON.parse(jsonObject);            // Converting js to json obj
console.log(`Javascript object = ${jsObject}`);

/* -----local sorage, why do we use?----- */

localStorage.setItem('email','gdray1996@gmail.com');
let email = localStorage.getItem('email');
console.log('Email : ',email);
localStorage.clear();


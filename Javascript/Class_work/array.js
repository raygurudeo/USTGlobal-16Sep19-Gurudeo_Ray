const hobbies = ['sleeping', 'cricket', 'eating', 'coding'];
console.log(typeof hobbies);
console.log(Array.isArray(hobbies)); // true
console.log(hobbies.includes('cricket', 100)); // false, searching will start from 100th index so will return false.
console.log(hobbies.push('guitar', 'football')); // new length 7
console.log(hobbies.pop()); // return removed element
console.log(hobbies.unshift('singing', 'cooking')); // add elements to oth index return new length
console.log(hobbies.shift()); // return removed element

const hobbies1 = ['sleeping', 'cricket', 'guitar', 'singing'];

console.log(hobbies1.splice(1, 2, 'movies', 'music'));
console.log(hobbies1);

console.log(hobbies1.slice(0, 2));
//console.log(hobbies1);

const hobbies2 = ['sleeping', 'cricket', 'guitar', 'singing'];
console.log(hobbies2.indexOf('guitar', 1));  // return index of guitar if not will return -1
console.log(hobbies2);

console.log(hobbies2.join('-')); // return string with seperator -.

/* ----------map() function------- */

const numbers = [100, 200, 300, 400];
const numbers1 = numbers.map(function(value, index) {
    let newValue = value + 50;
    return newValue;
})
 console.log(numbers1);

 const numbers2 = numbers.map(value => value + 50);
 console.log(numbers2);

 /* ----filter()---------- */

 const numbers3 = numbers.filter(function(value, index){    // filter will create a new array and will push all valure based on the condition
     return value > 200;
 })
 console.log(numbers3);

 const numbers4 = numbers.filter(value => value > 200);  // using fat arrow function.
 console.log(numbers4);

 const items = [{
     name : 'Ear ring',
     id : 1,
     price : 5000
 },
{
    name : 'Kajal',
    id : 2,
    price : 1000
},
{
    name : 'Trimmer',
    id : 3,
    price : 3000
},
{
    name : 'Beardo',
    id : 4,
    price : 170
}]
const items1 = items.map(function(value, index) {
    value.price = value.price + 1000;
    return value;
})
console.log(items1);



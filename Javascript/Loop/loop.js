var brands = ['Kingfisher', 'Aqua', 'Bisleri', 'Kinley'];
console.log('For of loop');
for(var element of brands) {
    console.log(`Brand = ${element}`);
}
console.log('===============');

//------For in loop---->

for(var index in brands) {
    console.log(`Brand = ${brands[index]}`);
}

console.log('================');

var person = {
    name : 'Rahul',
    age : 23,
    color : 'White'
}
for(var key in person) {
    console.log(`value = ${person[key]}`);
}

console.log('===============');

/* ------forEach() it's a method of array not a function.-------- */

brands.forEach(function(value, index) {
    console.log(`Movie = ${value}`);
})

console.log('================');

/* --------- */

var items = [{
    item : 'Bangles',
    id : 1,
    price : 100
},
{
    item : 'Eyeliner',
    id : 2,
    price : 250
},
{
    item : 'Watch',
    id : 3,
    price : 5000
},
{
    item : 'Bike',
    id : 4,
    price : 1000000
}]

items.forEach(function(value, index) {
    /* console.log(`Item = ${value}`);
    console.log(`Index of item = ${index}`); */
    console.log(value);
})
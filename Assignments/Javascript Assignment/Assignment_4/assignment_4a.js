/* ----map() and filter() function------- */

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
   return value.price + 1000;
})
console.log(items1);

const items2 = items.filter(value => value.price > 1000);
console.log(items2);

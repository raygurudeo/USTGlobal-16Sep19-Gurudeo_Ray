/* ----------Array all methods--------- */

/* -------isArray()------- */

console.log(Array.isArray([]));
console.log(Array.isArray([1]));
console.log(Array.isArray(new Array()));
console.log(Array.isArray(new Array('a', 'b', 'c', 'd')));
console.log(Array.isArray(new Array(3)));
console.log(Array.isArray());
console.log(Array.isArray({}));
console.log(Array.isArray(null));
console.log(Array.isArray(undefined));
console.log(Array.isArray(17));
console.log(Array.isArray('Array'));

/* -------forEach()--------- */

var array1 = ['a', 'b', 'c'];

array1.forEach(function(element) {
  console.log(element);
});

const arraySparse = [1,3,,7];
let numCallbackRuns = 0;

arraySparse.forEach(function(element){
  console.log(element);
  numCallbackRuns++;
});

console.log("numCallbackRuns: ", numCallbackRuns);

const item = ['item1', 'item2', 'item3'];
const copy = [];

// before
for (let i=0; i<item.length; i++) {
  copy.push(items[i]);
}

// after
items.forEach(function(item){
  copy.push(item);
});

var words = ['one', 'two', 'three', 'four'];
words.forEach(function(word) {
  console.log(word);
  if (word === 'two') {
    words.shift();
  }
});

/* ---------includes()------- */

var arr = [1,2,3];
console.log(arr.includes(2));     // true
console.log(arr.includes(4));     // false
console.log(arr.includes(3, 3));  // false
console.log(arr.includes(3, -1)); // true
console.log([1, 2, NaN].includes(NaN)); // true

var arr = ['a', 'b', 'c'];

console.log(arr.includes('c', 3));   // false
console.log(arr.includes('c', 100)); // false

/* ------join()---------- */

var elements = ['Fire', 'Air', 'Water'];

console.log(elements.join());

console.log(elements.join(''));

console.log(elements.join('-'));

console.log(elements.join('*'));

console.log(elements.join('+'));

console.log(elements.join('_'));

/* -------pop()-------- */

var plants = ['broccoli', 'cauliflower', 'cabbage', 'kale', 'tomato'];

console.log(plants.pop());

console.log(plants);

plants.pop();

console.log(plants);

var myFish = ['angel', 'clown', 'mandarin', 'sturgeon'];

var popped = myFish.pop();

console.log(myFish); // ['angel', 'clown', 'mandarin' ] 

console.log(popped); // 'sturgeon'

/* --------push()------------ */

const animals = ['pigs', 'goats', 'sheep'];

const count = animals.push('cows');
console.log(count);
// expected output: 4
console.log(animals);
// expected output: Array ["pigs", "goats", "sheep", "cows"]

animals.push('chickens', 'cats', 'dogs');
console.log(animals);
// expected output: Array ["pigs", "goats", "sheep", "cows", "chickens", "cats", "dogs"]

var sports = ['soccer', 'baseball'];
var total = sports.push('football', 'swimming');

console.log(sports); // ['soccer', 'baseball', 'football', 'swimming']
console.log(total);  // 4

/* -------map()-------- */

var array1 = [1, 4, 9, 16];

const map1 = array1.map(x => x * 2);

console.log(map1);

var numbers = [1, 4, 9];
var roots = numbers.map(function(num) {
return Math.sqrt(num)
});

var kvArray = [{key: 1, value: 10}, 
   {key: 2, value: 20}, 
   {key: 3, value: 30}];

var reformattedArray = kvArray.map(obj =>{ 
var rObj = {};
rObj[obj.key] = obj.value;
return rObj;
});

/* -------filter()-------- */

function isBigEnough(value) {
   return value >= 10;
 }
 
 var filtered = [12, 5, 8, 130, 44].filter(isBigEnough);
 // filtered is [12, 130, 44]

 var fruits = ['apple', 'banana', 'grapes', 'mango', 'orange'];

/**
 * Filter array items based on search criteria (query)
 */
function filterItems(arr, query) {
  return arr.filter(function(el) {
      return el.toLowerCase().indexOf(query.toLowerCase()) !== -1;
  })
}

console.log(filterItems(fruits, 'ap')); // ['apple', 'grapes']
console.log(filterItems(fruits, 'an')); // ['banana', 'mango', 'orange']

/* -------all string methods ------*/

/* ----to Upper and toLowerCase-------- */


let quote1 = 'You give respect you take respect';
console.log(quote1.toUpperCase());

let quote2 = 'Guitar';
console.log(quote2.toUpperCase());

let quote3 = 'Bike';
console.log(quote3.toUpperCase());

let quote4 = 'Qspider';
console.log(quote4.toUpperCase());

let quote5 = 'Laptop';
console.log(quote5.toUpperCase());

let quote6 = 'Bengaluru';
console.log(quote6.toUpperCase());

let quote7 = 'Ust Global';
console.log(quote7.toUpperCase());

let quote8 = 'Javascript';
console.log(quote8.toUpperCase());

let quote9 = 'Honesty is the best policy';
console.log(quote9.toLowerCase());

let quote10 = 'Guitar';
console.log(quote10.toLowerCase());

let quote11 = 'Bike';
console.log(quote11.toLowerCase());

let quote12 = 'Qspider';
console.log(quote12.toLowerCase());

let quote13 = 'Laptop';
console.log(quote13.toLowerCase());

let quote14 = 'Bengaluru';
console.log(quote14.toLowerCase());

let quote15 = 'Ust Global';
console.log(quote15.toLowerCase());

let quote16 = 'Javascript';
console.log(quote16.toLowerCase());

/* -----index of------ */

let str = 'Blue Whale';
console.log(str.indexOf('Blue'));     // returns  0
console.log(str.indexOf('Blute'));    // returns -1
console.log(str.indexOf('Whale', 0)); // returns  5
console.log(str.indexOf('Whale', 5)); // returns  5
console.log(str.indexOf('Whale', 7)); // returns -1
console.log(str.indexOf(''));         // returns  0
console.log(str.indexOf('', 9));      // returns  9
console.log(str.indexOf('', 10));     // returns 10
console.log(str.indexOf('', 11));     // returns 10

/* -----charAt()----- */

var anyString = 'Brave new world';
console.log("The character at index 0   is '" + anyString.charAt()   + "'"); 
// No index was provided, used 0 as default

console.log("The character at index 0   is '" + anyString.charAt(0)   + "'");
console.log("The character at index 1   is '" + anyString.charAt(1)   + "'");
console.log("The character at index 2   is '" + anyString.charAt(2)   + "'");
console.log("The character at index 3   is '" + anyString.charAt(3)   + "'");
console.log("The character at index 4   is '" + anyString.charAt(4)   + "'");
console.log("The character at index 999 is '" + anyString.charAt(999) + "'");

/* -------includes()---------- */

const str1 = 'To be, or not to be, that is the question.';

console.log(str1.includes('To be'));       // true
console.log(str1.includes('question'));    // true
console.log(str1.includes('nonexistent')); // false
console.log(str1.includes('To be', 1));    // false
console.log(str1.includes('TO BE'));       // false
console.log(str1.includes(''))             // true

/* --------slice------------- */

var str2 = 'The quick brown fox jumps over the lazy dog.';

console.log(str2.slice(31));

console.log(str2.slice(4, 19));

console.log(str2.slice(-4));

console.log(str2.slice(-9, -5));

console.log(str2.slice(-4));

console.log(str2.slice(-9, -5));

/* --------split()--------- */

var str3 = 'The quick brown fox jumps over the lazy dog.';

var words = str3.split(' ');
console.log(words[3]);

var chars = str3.split('');
console.log(chars[8]);

var strCopy = str3.split();
console.log(strCopy);

var words1 = str3.split(' ');
console.log(words1[3]);

var chars1 = str3.split('');
console.log(chars1[8]);

var strCopy1 = str3.split();
console.log(strCopy1);

/* ------subStr()------- */

var aString = 'Mozilla';

console.log(aString.substr(0, 1));   // 'M'
console.log(aString.substr(1, 0));   // ''
console.log(aString.substr(-1, 1));  // 'a'
console.log(aString.substr(1, -1));  // ''
console.log(aString.substr(-3));     // 'lla'
console.log(aString.substr(1));      // 'ozilla'
console.log(aString.substr(-20, 2)); // 'Mo'
console.log(aString.substr(20, 2));  // ''

/* -----trim()-------- */

var greeting = '   Hello world!   ';

console.log(greeting);

console.log(greeting.trim());
console.log('====================');

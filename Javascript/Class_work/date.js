var todayDate = new Date();
console.log(`Today Date : ${todayDate}`);
console.log(`Month : ${todayDate.getMonth()}`);
console.log(`Year : ${todayDate.getFullYear()}`);
console.log(`Day : ${todayDate.getDay()}`);

console.log('========');

var constMilli = new Date(0);
console.log(`Date : ${constMilli}`);
var constString = new Date('Nov 10');
console.log(`Date String Constructor : ${constString}`);
var constYear = new Date(2017, 10);
console.log(`Date year constructor: ${constYear}`);


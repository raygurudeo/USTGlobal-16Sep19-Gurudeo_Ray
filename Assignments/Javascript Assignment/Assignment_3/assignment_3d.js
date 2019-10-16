/*----Object-----*/

var car = {
    brand : 'BMW',
    price : 5000000
}
for(var carDetails in car) {
    console.log(car[carDetails]);
}

var country = {
    name : 'India',
    continent : 'Asia',
    population : 1300000000
}
for(var countryDetails in country) {
    console.log(country[countryDetails]);
}
console.log('===============');

/* -------For each loop----- */

var instruments = ['Guitar','Piano','Flute'];
instruments.forEach(function(value, index){
    console.log(value);
})

var fighterJet = ['Rafal','Tejas','Sukhoi'];
fighterJet.forEach(function(value, index){
    console.log(value);
})

var metroCities = ['Bengaluru','Delhi','Mumbai'];
metroCities.forEach(function(value, index){
    console.log(value);
})

var programmingLanguage = ['Java','Python','C++'];
programmingLanguage.forEach(function(value, index){
    console.log(value);
})

var streams = ['CSE','Civil','ECE'];
streams.forEach(function(value, index){
    console.log(value);
})


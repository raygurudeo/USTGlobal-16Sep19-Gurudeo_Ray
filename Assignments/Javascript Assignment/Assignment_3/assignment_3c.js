/* --------For in loop example-------- */

var fighterJet = ['Rafal','Tejas','Sukhoi'];
console.log(fighterJet);
for(var jetName in fighterJet){
    console.log(fighterJet[jetName]);
}

var streams = ['CSE','Civil','ECE'];
console.log(streams);
for(streamName in streams){
    console.log(streams[streamName]);
}

var metroCities = ['Bengaluru','Delhi','Mumbai'];
console.log(metroCities);
for(cityName in metroCities){
    console.log(metroCities[cityName]);
}

var programmingLanguage = ['Java','Python','C++'];
console.log(programmingLanguage);
for(langName in programmingLanguage){
    console.log(programmingLanguage[langName]);
}

var instruments = ['Guitar','Piano','Flute'];
console.log(instruments);
for(instrumentName in instruments){
    console.log(instruments[instrumentName]);
}
console.log('===================');
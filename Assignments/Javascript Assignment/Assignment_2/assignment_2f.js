var todayDate = new Date();             // getDay()
var day = todayDate.getDay();
switch(day) {
    case 0:
        console.log('Sunday');
        break;
    case 1:
            console.log('Monday');
            break;
    case 2:
        console.log('Tuesday');
        break;
    case 3:
        console.log('Wednesday');
        break;
    case 4:
        console.log('Thursday');
            break;
    case 5:
        console.log('Friday');
        break;
    case 6:
        console.log('Saturday');
            
}

//----------getMonth();--------->

var month = todayDate.getMonth();
switch(month) {
    case  0:
        console.log('January');
        break;
    case  1:
        console.log('February');
        break;
    case  2:
        console.log('March');
        break;
    case  3:
        console.log('April');
        break;
    case  4:
        console.log('May');
        break;
    case  5:
        console.log('June');
        break;
    case  6:
        console.log('July');
        break;
    case  7:
        console.log('August');
        break;
    case  8:
        console.log('September');
        break;
    case  9:
        console.log('October');
        break;
    case  10:
        console.log('November');
        break;
    case  11:
        console.log('December');
        break;
}

//-------Math.random() 10 to 1000.

var min = 10;
var max = 1000;
console.log(Math.random() *  (max - min) + min);
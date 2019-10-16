/* -----Promises-------- */

new Promise(function(resolve, reject) {
    if(30 > 20) {
        resolve(['Succcess']);
    }
    else {
        reject('Failed');
    }
}).then(function(msg) {
    console.log('Success message: ',msg);
}).catch(function(err) {
    console.log('Failed message: ',err);
});

/* -----Employees promise----- */

let employees = new Promise(function(resolve, reject) {
        if(30 > 20) {
            resolve([{
                name: 'Billgates',
                age: 67
            },
            {
                name: 'Mark Zu.',
                age: 30
            }]);
        }
        else {
            reject('Failed');
        }
    })
    employees.then(function(data) {
        console.log('Employees data: ',data);
    }).catch(function(error) {
        console.log('Faliure message:',error);
    })

/* --------Closures-----To make variable and function private------ */

function outerFunction(counter) {

    function innerFunction() {
        let count;
        count = counter + 10;
        return count;
    }
    return innerFunction;
}

let innerFunc = outerFunction(10);
let count = innerFunc();
console.log('Counter value = ',count);
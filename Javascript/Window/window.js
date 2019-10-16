console.log('window object',window);
console.log('this keyword',this);
console.log(this === window);
// window.alert('Welcome to js class');
// alert('welcome');
// let confirmDelete = confirm('Are you sure you want to delete');
// console.log(confirmDelete);

// let userName = prompt('What is your name', 'Guldu'); // guldu is default value.
// console.log(userName);

const person = {
    firstName : 'Alia',
    age : 26,
    lastName : 'Kapoor',
    getName : function() {
        return this.firstName + ' ' + this.lastName;
    }
}
let fullName = person.getName();
console.log(fullName);




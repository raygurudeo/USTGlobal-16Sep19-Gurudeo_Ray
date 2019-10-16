let element = document.getElementById('demo');
let containt = element.textContent;
console.log(containt);
element.textContent = 'Good evening';
console.log(element);
console.log('==============');

 /* ----creatElement()------ */

 let button = document.createElement('button');
 console.log(button);
 button.textContent = 'Submit';
 console.log(button.textContent);
 console.log('==============');

/* ----buttonChild()-------- */

document.body.appendChild(button);

let ulElement = document.createElement('ul');
let li1Element = document.createElement('li');
let li2Element = document.createElement('li');
let li3Element = document.createElement('li');

li1Element.textContent = 'JAVA';
li2Element.textContent = 'SQL';
li3Element.textContent = 'JAVASCRIPT';

ulElement.appendChild(li1Element);
ulElement.appendChild(li2Element);
ulElement.appendChild(li3Element);
document.body.appendChild(ulElement);

// style

element.style.color = 'red';    //h1 tag color
element.style.fontSize = '50px';

/* -------EventHandling----- */

function showMessage() {        // onclick()
    alert('Hi hello');
}
function changeColor() {                                    // onmouseover()
    document.getElementById('mouse').style.color = 'red';
}
function removeColor() {                                        // onmouseout()
    document.getElementById('mouse').style.color = 'black';
}
function printHello() {                                         // onkeyup()
    let value = document.getElementById('username').value;
    document.getElementById('showUserName').textContent ='hello'
}

let name = 'Rakesh';
let age = 21;
let phone = 8982787234;
console.log(`Name is ${name} Age is ${age} Phone no. is ${phone}.`)


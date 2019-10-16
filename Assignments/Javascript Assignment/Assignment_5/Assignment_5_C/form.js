/* -----Id Selectors-------- */

let userNameField = document.getElementById('userName');
let passwordField = document.getElementById('password-field');
let togglePassword = document.getElementById('toggle-pwd');
let checkBox = document.getElementById('check-box');
let submitBtn = document.getElementById('submit-btn');
let val = document.getElementById('userName').value;

/* -------Password attribute toggler----------- */
checkBox.addEventListener('click', function() {
    if(passwordField.getAttribute('type') === 'password') {
        passwordField.setAttribute('type','text');
    }  
    else {
        passwordField.setAttribute('type','password');
    }
});
togglePassword.addEventListener('click', function() {
    if(passwordField.getAttribute('type') === 'password') {
        passwordField.setAttribute('type','text');
        togglePassword.style.color = 'white';
    }  
    else {
        passwordField.setAttribute('type','password');
        togglePassword.style.color = 'green';
    }
});

/* ---------- Minimum character length--------- */
 userNameField.addEventListener('keyup', function() {
    passwordField.addEventListener('keyup', function(){
        if(userNameField.value.length > 5 && passwordField.value.length > 5) {
            submitBtn.style.backgroundColor='green';
            submitBtn.style.color='white';
            submitBtn.disabled=false;
        }
    })
 });
 passwordField.addEventListener('keyup', function() {
    userNameField.addEventListener('keyup', function(){
        if(userNameField.value.length > 5 && passwordField.value.length > 5) {
            submitBtn.style.backgroundColor='green';
            submitBtn.style.color='white';
            submitBtn.disabled=false;
        }
    })
 });
 userNameField.addEventListener('keydown', function() {
    passwordField.addEventListener('keydown', function(){
        if(userNameField.value.length <= 5 || passwordField.value.length <= 5) {
            submitBtn.style.backgroundColor='transparent';
            submitBtn.style.color='green';
            submitBtn.disabled=true;
        }
    })
 });
 passwordField.addEventListener('keydown', function() {
    userNameField.addEventListener('keydown', function(){
        if(userNameField.value.length <= 5 || passwordField.value.length <= 5) {
            submitBtn.style.backgroundColor='transparent';
            submitBtn.style.color='green';
            submitBtn.disabled=true;
        }
    })
 });

 /* ------Message rendering---------- */
let usernameLabel = document.getElementById('username-label');
userNameField.addEventListener('keyup', function(){
    if(userNameField.value.length <= 5) {
        usernameLabel.textContent='Character must be more than 5.';
    }
    else{
        usernameLabel.textContent='';
    }
});
userNameField.addEventListener('keydown', function(){
    if(userNameField.value.length <= 5) {
        usernameLabel.textContent='Character must be more than 5.';
    }
    else {
        usernameLabel.textContent='';
    }
});

let passwordLabel = document.getElementById('password-label');
passwordField.addEventListener('keyup', function(){
    if(passwordField.value.length <= 5) {
        passwordLabel.textContent='Character must be more than 5.';
    }
    else{
        passwordLabel.textContent='';
    }
});
passwordField.addEventListener('keydown', function(){
    if(passwordField.value.length <= 5) {
        passwordLabel.textContent='Character must be more than 5.';
    }
    else {
        passwordLabel.textContent='';
    }
});



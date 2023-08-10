// login.js

// Sample user data stored in localStorage (replace with your actual implementation)
let users = JSON.parse(localStorage.getItem('users')) || [];

function login() {
  const username = document.getElementById('username').value;
  const password = document.getElementById('password').value;

  const user = users.find(u => u.username === username && u.password === password);

  if (user) {
      displayLoginSuccess(); // Display success message
  } else {
      displayLoginError();
  }
}

function displayLoginSuccess() {
  const loginMessage = document.getElementById('login-message');
  loginMessage.textContent = 'Login successful!';
  loginMessage.classList.remove('error');
  loginMessage.classList.add('success');
}

function displayLoginError() {
  const loginMessage = document.getElementById('login-message');
  loginMessage.textContent = 'Invalid credentials. Please try again.';
  loginMessage.classList.remove('success');
  loginMessage.classList.add('error');
}
function register() {
  const regUsername = document.getElementById('reg-username').value;
  const regPassword = document.getElementById('reg-password').value;

  const existingUser = users.find(u => u.username === regUsername);
  if (existingUser) {
      displayRegisterError('Username already exists.');
  } else {
      const newUser = { username: regUsername, password: regPassword };
      users.push(newUser);

      localStorage.setItem('users', JSON.stringify(users));
      displayRegisterSuccess();
  }
}

function showRegisterForm() {
  document.getElementById('login-form').style.display = 'none';
  document.getElementById('register-form').style.display = 'block';
  document.getElementById('login-message').textContent = '';
}

function showLoginForm() {
  document.getElementById('register-form').style.display = 'none';
  document.getElementById('login-form').style.display = 'block';
  document.getElementById('login-message').textContent = '';
}
function displayLoginSuccess() {
  const loginMessage = document.getElementById('login-message');
  loginMessage.textContent = 'Login successful!';
  loginMessage.classList.remove('error');
  loginMessage.classList.add('success');
}

function displayLoginError() {
  const loginMessage = document.getElementById('login-message');
  loginMessage.textContent = 'Invalid credentials. Please try again.';
  loginMessage.classList.remove('success');
  loginMessage.classList.add('error');
}
function displayRegisterSuccess() {
  const registerMessage = document.getElementById('register-message');
  registerMessage.textContent = 'Registration successful! You can now log in.';
  registerMessage.classList.remove('error');
  registerMessage.classList.add('success');
}
function displayRegisterError(message) {
  const registerMessage = document.getElementById('register-message');
  registerMessage.textContent = message;
  registerMessage.classList.remove('success');
  registerMessage.classList.add('error');
}
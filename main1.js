// Import functions from calculator.js
import { add, sub, mul } from './calculator1.js';

// Get DOM elements
const num1Input = document.getElementById('num1');
const num2Input = document.getElementById('num2');
const resultDisplay = document.getElementById('result');

const addBtn = document.getElementById('addBtn');
const subBtn = document.getElementById('subBtn');
const mulBtn = document.getElementById('mulBtn');

// Helper to get numbers from inputs
function getNumbers() {
    const a = parseFloat(num1Input.value);
    const b = parseFloat(num2Input.value);
    return { a, b };
}

// Helper to show result
function showResult(value) {
    resultDisplay.innerText = 'Result: ' + value;
}

// Button click handlers
addBtn.addEventListener('click', function() {
    const { a, b } = getNumbers();
    if (isNaN(a) || isNaN(b)) {
        resultDisplay.innerText = 'Please enter valid numbers';
        return;
    }
    showResult(add(a, b));
});

subBtn.addEventListener('click', function() {
    const { a, b } = getNumbers();
    if (isNaN(a) || isNaN(b)) {
        resultDisplay.innerText = 'Please enter valid numbers';
        return;
    }
    showResult(sub(a, b));
});

mulBtn.addEventListener('click', function() {
    const { a, b } = getNumbers();
    if (isNaN(a) || isNaN(b)) {
        resultDisplay.innerText = 'Please enter valid numbers';
        return;
    }
    showResult(mul(a, b));
});
"use strict";

// getting elements from html by id
const button = document.getElementById("calculate-percent");
const dealersNames = document.getElementById("dealers-names");
const dealerName = document.getElementById("dealers-name");
const dealerButton = document.getElementById("dealer-button");
const todaysDate = document.getElementById("current-date");
const submitButton = document.getElementById("submit-button");
const submitForm = document.getElementById("submit-form");

// TODO: make this function auto fill the dealer name in the proper field
dealerButton.addEventListener("click", (e) => {
    e.preventDefault();
    dealerName.value = dealersNames.value;
});

// setting up and getting today's date
const today = new Date();
const date = `${today.getMonth() + 1}/${today.getDate()}/${today.getFullYear()}`;
todaysDate.value = date;

// function to calculate 12%
const calculator = (input) => {
    return parseInt(input) * .88;
};

// adding the event listener to calculate the 12% on button click
button.addEventListener("click", (e) => {
    e.preventDefault();
    let totalTokes = document.getElementById("totalTokes").value;
    let dealerTakeHomeTotal = document.getElementById("dealerTakeHomeTotal");
    let twelvePercent = document.getElementById("twelvePercent");
    dealerTakeHomeTotal.value = Math.floor(calculator(totalTokes));
    twelvePercent.value = totalTokes - Math.floor(calculator(totalTokes));
});

// submitButton.addEventListener("click", () => {
//     setTimeout(submitForm.reset(), 200);
// });


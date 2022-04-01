"use strict";

// getting the button id
const button = document.getElementById("calculate-percent");
const dealersNames = document.getElementById("dealers-names");
const dealerName = document.getElementById("dealers-name");
const dealerButton = document.getElementById("dealer-button");

dealerButton.addEventListener("click", (e) => {
    e.preventDefault();
    dealerName.value = dealersNames.value;
})

// setting up and getting today's date
const todaysDate = document.getElementById("current-date");
const today = new Date();
const date = `${today.getMonth() + 1}/${today.getDate()}/${today.getFullYear()}`;
todaysDate.value = date;

// function to calculate 12%
const calculator = (input) => {
    return parseInt(input) * .88;
}

// adding the event listener to calculate the 12% on button click
button.addEventListener("click", (e) => {
    e.preventDefault();
    const totalTokes = document.getElementById("totalTokes").value;
    const dealerTakeHomeTotal = document.getElementById("dealerTakeHomeTotal");
    const twelvePercent = document.getElementById("twelvePercent");
    dealerTakeHomeTotal.value = Math.floor(calculator(totalTokes));
    twelvePercent.value = totalTokes - Math.floor(calculator(totalTokes));
});


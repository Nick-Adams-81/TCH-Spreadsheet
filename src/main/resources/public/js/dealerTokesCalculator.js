"use strict";


const button = document.getElementById("calculate-percent");

const calculator = (input) => {
    return parseInt(input) * .88;
}

button.addEventListener("click", (e) => {
    e.preventDefault();
    const totalTokes = document.getElementById("totalTokes").value;
    const dealerTakeHomeTotal = document.getElementById("dealerTakeHomeTotal");
    const twelvePercent = document.getElementById("twelvePercent");
    dealerTakeHomeTotal.value = Math.floor(calculator(totalTokes));
    twelvePercent.value = totalTokes - Math.floor(calculator(totalTokes));

})


"use strict";



let submitButton = document.getElementById("submitButton");
let computedTotal = document.getElementById("computedTotal");
const totals = (input, multiplier) => {
    return input * multiplier;
}


submitButton.addEventListener("click", (e) => {
    e.preventDefault();
    let loseOnes = document.getElementById("loseOnes").value;
    let strappedOnes = document.getElementById("strappedOnes").value;

    const loseOnesTotal = totals(loseOnes, 1);
    const strappedOnesTotal = totals(strappedOnes, 100);
    computedTotal.innerHTML = loseOnesTotal + strappedOnesTotal;
})



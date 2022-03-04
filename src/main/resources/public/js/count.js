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

    alert(totals(loseOnes, 2));
    computedTotal.innerHTML = loseOnes;
})



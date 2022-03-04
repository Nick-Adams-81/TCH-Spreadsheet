"use strict";



let submitButton = document.getElementById("submitButton");
let computedTotal = document.getElementById("computedTotal");
const totals = (input, multiplier) => {
    return input * multiplier;
}

const grandTotal = (a, b, c) => {
    return a + b + c;
}


submitButton.addEventListener("click", (e) => {
    e.preventDefault();
    let loseOnes = document.getElementById("loseOnes").value;
    let strappedOnes = document.getElementById("strappedOnes").value;
    let loseTwos = document.getElementById("loseTwos").value;
    let userTotals = document.getElementById("computedTotal");
    console.log(loseTwos);

    const loseOnesTotal = totals(parseInt(loseOnes), 1);
    const strappedOnesTotal = totals(parseInt(strappedOnes), 100);
    const loseTwosTotal = totals(parseInt(loseTwos), 2);
    const computedTotal = grandTotal(loseOnesTotal, strappedOnesTotal,loseTwosTotal);


    userTotals.innerHTML = ("$" + computedTotal);

});



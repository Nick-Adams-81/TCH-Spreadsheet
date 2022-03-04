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
    let strappedTwos = document.getElementById("strappedTwos").value;
    let loseFives = document.getElementById("loseFives").value;
    let strappedFives = document.getElementById("strappedFives").value;
    let loseTens = document.getElementById("loseTens").value;
    let strappedTens = document.getElementById("strappedTens").value;
    let loseTwenties = document.getElementById("loseTwenties");
    let strappedTwenties = document.getElementById("strappedTwenties").value;
    let loseHundreds = document.getElementById("loseHundreds").value;
    let strappedHundreds = document.getElementById("strappedHundreds").value;
    let userTotals = document.getElementById("computedTotal");
    console.log(loseTwos);

    const loseOnesTotal = totals(parseInt(loseOnes), 1);
    const strappedOnesTotal = totals(parseInt(strappedOnes), 100);
    const loseTwosTotal = totals(parseInt(loseTwos), 2);
    const strappedTwosTotal = totals(parseInt(strappedTwos), 200);
    const loseFivesTotal = totals(parseInt(loseFives), 5);
    const strappedFivesTotal = totals(parseInt(strappedFives), 500);
    const computedTotal = grandTotal(loseOnesTotal, strappedOnesTotal, loseTwosTotal);

    userTotals.innerHTML = ("$" + computedTotal);

});



"use strict";



let submitButton = document.getElementById("submitButton");
let computedTotal = document.getElementById("computedTotal");
const totals = (input, multiplier) => {
    return input * multiplier;
}

const grandTotal = (a, b, c, d, e, f, g, h, i, j, k, l, m, n) => {
    return a + b + c + d + e + f + g + h + i + j + k + l + m + n;
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
    let loseTwenties = document.getElementById("loseTwenties").value;
    let strappedTwenties = document.getElementById("strappedTwenties").value;
    let loseFifties = document.getElementById("loseFifties").value;
    let strappedFifties = document.getElementById("strappedFifties").value;
    let loseHundreds = document.getElementById("loseHundreds").value;
    let strappedHundreds = document.getElementById("strappedHundreds").value;
    let userTotals = document.getElementById("computedTotal");


    // totals of user cash inputs
    const loseOnesTotal = totals(parseInt(loseOnes), 1);
    const strappedOnesTotal = totals(parseInt(strappedOnes), 100);
    const loseTwosTotal = totals(parseInt(loseTwos), 2);
    const strappedTwosTotal = totals(parseInt(strappedTwos), 200);
    const loseFivesTotal = totals(parseInt(loseFives), 5);
    const strappedFivesTotal = totals(parseInt(strappedFives), 500);
    const loseTensTotal = totals(parseInt(loseTens), 10);
    const strappedTensTotal = totals(parseInt(strappedTens), 1000);
    const loseTwentiesTotal = totals(parseInt(loseTwenties), 20);
    const strappedTwentiesTotal = totals(parseInt(strappedTwenties), 2000);
    const loseFiftiesTotal = totals(parseInt(loseFifties), 50);
    const strappedFiftiesTotal = totals(parseInt(strappedFifties), 5000)
    const loseHundredsTotal = totals(parseInt(loseHundreds), 100);
    const strappedHundredsTotal = totals(parseInt(strappedHundreds), 10000);

    // compute grand total of cash
    const computedTotal = grandTotal(loseOnesTotal, strappedOnesTotal, loseTwosTotal, strappedTwosTotal, loseFivesTotal, strappedFivesTotal,
        loseTensTotal, strappedTensTotal, loseTwentiesTotal, strappedTwentiesTotal, loseFiftiesTotal, strappedFiftiesTotal, loseHundredsTotal, strappedHundredsTotal);

    userTotals.innerHTML = ("$" + computedTotal);

});



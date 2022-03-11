"use strict";

// global id's
let submitButton = document.getElementById("submitButton");
let userTotals = document.getElementById("computedTotal");
let bankTotal = document.getElementById("bankTotal");

// function to return totals of racked and strapped chips and money
const totals = (input, multiplier) => {
    return parseInt(input) * multiplier;
}

const boxTotals = (a, b, c, d, e, f, g, h, i, j, k, l, m, n) => {
    return a + b + c + d + e + f + g + h + i + j + k + l + m + n;
}


// setting bank total manually, later will be set dynamically
const bankGrandTotal = 18988;
bankTotal.value = bankGrandTotal;

submitButton.addEventListener("click", (e) => {
    e.preventDefault();


    // getting inputted cash value from users
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

    // getting inputted chip values from users
    let loseOnesChips = document.getElementById("loseOnesChips").value;
    let rackedOnesChips = document.getElementById("rackedOnesChips").value;
    let loseFivesChips = document.getElementById("loseFivesChips").value;
    let rackedFivesChips = document.getElementById("rackedFivesChips").value;
    let loseTwentyFiveChips = document.getElementById("loseTwentyFives").value;
    let rackedTwentyFiveChips = document.getElementById("rackedTwentyFives").value;
    let loseHundredsChips = document.getElementById("loseHundreds").value;
    let rackedHundredChips = document.getElementById("rackedHundredsChips").value;
    let loseFiveHundreds = document.getElementById("loseFiveHundreds").value;
    let rackedFiveHundreds = document.getElementById("rackedFiveHundreds").value;
    let loseThousands = document.getElementById("loseThousands").value;
    let rackedThousands = document.getElementById("rackedThousands").value;
    let fiveThousands = document.getElementById("fiveThousands").value;
    let rackedFiveThousands = document.getElementById("rackedFiveThousands").value;


    // totals of user cash inputs
    const loseOnesTotal = totals(loseOnes, 1);
    const strappedOnesTotal = totals(strappedOnes, 100);
    const loseTwosTotal = totals(loseTwos, 2);
    const strappedTwosTotal = totals(strappedTwos, 200);
    const loseFivesTotal = totals(loseFives, 5);
    const strappedFivesTotal = totals(strappedFives, 500);
    const loseTensTotal = totals(loseTens, 10);
    const strappedTensTotal = totals(strappedTens, 1000);
    const loseTwentiesTotal = totals(loseTwenties, 20);
    const strappedTwentiesTotal = totals(strappedTwenties, 2000);
    const loseFiftiesTotal = totals(loseFifties, 50);
    const strappedFiftiesTotal = totals(strappedFifties, 5000);
    const loseHundredsTotal = totals(loseHundreds, 0);
    const strappedHundredsTotal = totals(strappedHundreds, 10000);

    // totals of user chip inputs
    const loseOnesChipsTotal = totals(loseOnesChips, 1);
    const rackedOnesChipsTotal = totals(rackedOnesChips, 100);
    const loseFivesChipsTotal = totals(loseFivesChips, 5);
    const rackedFivesChipsTotal = totals(rackedFivesChips, 500);
    const loseTwentyFiveChipsTotal = totals(loseTwentyFiveChips, 25);
    const rackedTwentyFiveChipsTotal = totals(rackedTwentyFiveChips, 2500);
    const loseHundredChipTotal = totals(loseHundredsChips, 100);
    const rackedHundredChipTotal = totals(rackedHundredChips, 10000);
    const loseFiveHundredChipTotal = totals(loseFiveHundreds, 500);
    const rackedFiveHundredsTotal = totals(rackedFiveHundreds, 50000);
    const loseThousandsTotal = totals(loseThousands, 1000);
    const rackedThousandsTotal = totals(rackedThousands, 100000);
    const fiveThousandTotal = totals(fiveThousands, 5000);
    const rackedFiveThousandsTotal = totals(rackedFiveThousands, 500000);



    // compute grand total of cash
    const computedCashTotal = boxTotals(loseOnesTotal, strappedOnesTotal, loseTwosTotal, strappedTwosTotal, loseFivesTotal, strappedFivesTotal,
        loseTensTotal, strappedTensTotal, loseTwentiesTotal, strappedTwentiesTotal, loseFiftiesTotal, strappedFiftiesTotal, loseHundredsTotal,
        strappedHundredsTotal);

    // compute grand total of chips
    const computedChipTotal = boxTotals(loseOnesChipsTotal, rackedOnesChipsTotal, loseFivesChipsTotal, rackedFivesChipsTotal, loseTwentyFiveChipsTotal,
        rackedTwentyFiveChipsTotal, loseHundredChipTotal, rackedHundredChipTotal, loseFiveHundredChipTotal, rackedFiveHundredsTotal, loseThousandsTotal, rackedThousandsTotal,
        fiveThousandTotal, rackedFiveThousandsTotal);

    // adding both chips and cash totals together
    const grandTotal = computedCashTotal + computedChipTotal;

    // setting html to grand total of chips and cash
    if(grandTotal === bankGrandTotal) {
        userTotals.value = grandTotal;
        userTotals.style.color = "green";
    } else if(grandTotal < bankGrandTotal) {
        userTotals.value = grandTotal;
        userTotals.style.color = "red";
    } else {
        userTotals.value = grandTotal;
        userTotals.style.color = "#FFC000";
    }


});



"use strict";

// getting buttons from dom by id //
const startShiftButton = document.getElementById("startShiftButton");
const pauseShiftButton = document.getElementById("pauseShiftButton");
const endShiftButton = document.getElementById("endShiftButton");
const loginTime = document.getElementById("loginTime");
const logoutTime = document.getElementById("logoutTime");
const setDate = document.getElementById("date");

// setting up a new date variable //
const today = new Date();

// getting the current date //
const date = `${today.getMonth() + 1}/${today.getDate()}/${today.getFullYear()}`;
console.log(date);

// getting the current time //

// getting current military(24-hour clock) time in hours
const timeHours = today.getHours();

// getting current minutes
const timeMinutes = today.getMinutes();

//function to convert military time to standard time
const standardTime = (hours) => {
    if(hours > 12) return hours - 12;
    else return hours;
}

// function to add a 0 if minutes is less than 10
const minutes = (mins) => {
    if(mins < 10) return "0" + mins;
    else return mins;
}

// converting 0 hundred hours to 12 midnight
const midnightConversion = (hours) => {
    if(hours === 0) return hours + 12;
    else return hours;
 }

 // creating variables to hold date and time
let timeAm = `${standardTime(timeHours)}:${minutes(timeMinutes)} am`;
let timePm = `${standardTime(timeHours)}:${minutes(timeMinutes)} pm`;
let midnight = `${midnightConversion(timeHours)}:${minutes(timeMinutes)} am`;
let noon = `${timeHours} : ${minutes(timeMinutes)} pm`;


// adding click events to button elements //
startShiftButton.addEventListener("click", () => {
    if(timeHours > 12) loginTime.value = timePm;
    else if(timeHours === 0)  loginTime.value = midnight;
    else if(timeHours === 12) loginTime.value = noon;
    else loginTime.value = `${date} at: ${timeAm}`;
    setDate.value = date;
});

pauseShiftButton.addEventListener("click", () => {
    if(timeHours >= 12) console.log(timePm);
    else if(timeHours === 0) console.log(midnight);
    else console.log(timeAm);
});

endShiftButton.addEventListener("click", () => {
    if(timeHours > 12) logoutTime.value = timePm;
    else if(timeHours === 0)  logoutTime.value = midnight;
    else if(timeHours === 12) logoutTime.value = noon;
    else logoutTime.value = timeAm;
});
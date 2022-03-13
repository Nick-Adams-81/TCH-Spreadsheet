"use strict";

const startShiftButton = document.getElementById("startShiftButton");
const pauseShiftButton = document.getElementById("pauseShiftButton");
const endShiftButton = document.getElementById("endShiftButton");

// setting up a new date variable //
const today = new Date();

// getting the current date //
const date = (today.getMonth() + 1) + "/" + today.getDate() + "/" + today.getFullYear();

//function to convert military time to standard time
const standardTime = (hours) => {
    if(hours > 12) return hours - 12;
     else return hours;
}

// getting the current time //

// getting current military time in hours
const timeHours = today.getHours();

// getting current minutes in hours
const timeMinutes = today.getMinutes();

// function to add a 0 if minutes is less than 10
const minutes = (mins) => {
    if(mins < 10) return "0" + mins;
    else return mins;
}


startShiftButton.addEventListener("click", () => {
    if(timeHours > 12) console.log(date + " at: " + standardTime(timeHours) + ":" + minutes(timeMinutes) + " pm");
    else console.log(date + " at: " + timeHours + ":" + minutes(timeMinutes) + " am");
});

pauseShiftButton.addEventListener("click", () => {
    if(timeHours > 12) console.log(date + " at: " + standardTime(timeHours) + ":" + minutes(timeMinutes) + " pm");
    else console.log(date + " at: " + timeHours + ":" + minutes(timeMinutes) + " am");
});

endShiftButton.addEventListener("click", () => {
    if(timeHours > 12) console.log(date + " at: " + standardTime(timeHours) + ":" + minutes(timeMinutes) + " pm");
    else console.log(date + " at: " + timeHours + ":" + minutes(timeMinutes) + " am");
})
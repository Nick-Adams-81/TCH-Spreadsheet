"use strict";

const startShiftButton = document.getElementById("startShiftButton");
const pauseShiftButton = document.getElementById("pauseShiftButton");
const endShiftButton = document.getElementById("endShiftButton");


const today = new Date();
const date =  (today.getMonth() + 1) + "/" + today.getDate() + "/" + today.getFullYear();




startShiftButton.addEventListener("click", () => {
    console.log(date)
});

pauseShiftButton.addEventListener("click", () => {
    console.log("test pause shift click event")
});

endShiftButton.addEventListener("click", () => {
    console.log("test end shift click event")
})
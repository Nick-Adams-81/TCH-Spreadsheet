"use strict";

const checkBox = document.getElementById("flexCheckDefault");

const validate = () => {
    return checkBox.checked ? checkBox.value = true : checkBox.value = false;
}

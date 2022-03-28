"use strict";

const checkBox = document.getElementById("flexCheckDefault");

const validate = () => {
    return checkBox.checked ? checkBox.value = 1 : checkBox.value = 0;
}

"use strict";

const checkBox = document.getElementById("flexCheckDefault");

const validate = () => {
    if (checkBox.checked) checkBox.value = true;
    else checkBox.value = false;
}

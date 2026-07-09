
window.onload = function () {
    const savedName = localStorage.getItem("username");

    if (savedName) {
        document.getElementById("display").innerHTML =
            "Welcome, " + savedName;
    }
};


function saveName() {
    const name = document.getElementById("name").value;

    localStorage.setItem("username", name);

    document.getElementById("display").innerHTML =
        "Welcome, " + name;
}


let counter = sessionStorage.getItem("counter");

if (counter == null) {
    counter = 0;
}

document.getElementById("count").innerHTML = counter;

function increaseCounter() {
    counter++;

    sessionStorage.setItem("counter", counter);

    document.getElementById("count").innerHTML = counter;
}


function setCookie(name, value, days) {
    const date = new Date();
    date.setTime(date.getTime() + days * 24 * 60 * 60 * 1000);

    document.cookie =
        name + "=" + value +
        ";expires=" + date.toUTCString() +
        ";path=/";
}


function getCookie(name) {
    const cookies = document.cookie.split(";");

    for (let cookie of cookies) {
        cookie = cookie.trim();

        if (cookie.startsWith(name + "=")) {
            return cookie.substring(name.length + 1);
        }
    }

    return "";
}

// Apply theme
function setTheme(theme) {
    document.body.className = theme;

    setCookie("theme", theme, 7);
}

// Load theme on page refresh
window.onload = function () {
    const savedTheme = getCookie("theme");

    if (savedTheme) {
        document.body.className = savedTheme;
    }
};
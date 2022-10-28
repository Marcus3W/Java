/**
 * AJAX Section is used to look for data and parse it to the function displayRoutesDetails if
 * there is valid data. If not, return error.
 * @author Module Lead, implemented and updated by Marc Wheeler
 */
(function () {
window.onload = getRoutesDetails;
let xhr = false;
function getRoutesDetails() {
    if (window.XMLHttpRequest) {
        xhr = new XMLHttpRequest();
    } else {
        if (window.ActiveXObject) {
            xhr = newActiveXObject("Microsoft.XMLHTTP");
        }
    }
    if(xhr) {
        xhr.open("GET", "data/routes.json", true);
        xhr.send();
        xhr.onreadystatechange = displayRoutesDetails;
    } else {
        document.getElementById("statusmessage").innerHTML = "Error with obtaining data";
    }
}

/**
 * Function to obtain data from JSON file data saved in data folder and display data
 * @author Marc Wheeler
 */
function displayRoutesDetails() {
    if (xhr.readyState === 4) {
        if (xhr.status === 200) {
            const data = JSON.parse(xhr.responseText);
            let dataText = "";
            let mapText = "";
            const url = $(location).attr("search");
            const params = new URLSearchParams(url);
            const routeID = parseFloat(params.get("id"));

            for (let i in data.routes) {
                if (data.routes[i].id === routeID) {
                    dataText +=
                        "<div class='container mt-2 mb-0'>" +
                        "<div class='card text-center'>" +
                        "<div class='card-body'>" +
                        "<div class='card-title display-6 text-dark'>Tour Name: <span class='lead-bold text-primary-darker'>" +
                        "<h4>" + data.routes[i].name + "</h4></span></div>" +
                        "<hr>" +
                        "<div class='card-header d-none d-lg-block'>" + "<img src='./img/route-placeholder-image.png' class='rounded mx-auto d-block' alt='Image of Route'>" + "</div>" +
                        "<hr>" +
                        "<div class='card-title display-6 text-dark'>Day: <span class='lead-bold text-primary-darker'>" + data.routes[i].day + "</span></div>" +
                        "<hr>" +
                        `<div class='card-title display-6 text-dark'>Start Time: <span class='lead-bold text-primary-darker'> ${data.routes[i].time} </span></div>` +
                        "<hr>" +
                        `<div class='card-title display-6 text-dark'>Start Point: <span class='lead-bold text-primary-darker'> ${data.routes[i].startLat} / ${data.routes[i].startLng} </span></div>` +
                        "<hr>" +
                        `<div class='card-title display-6 text-dark'>End Point: <span class='lead-bold text-primary-darker'> ${data.routes[i].endLat} / ${data.routes[i].endLng} </span></div>` +
                        "<hr>" +
                        `<div class='card-title display-6 text-dark'>Highlights: <p class='small text-primary-darker pt-2 '> ${data.routes[i].highlights} </p></div>`;
                }
            }
            document.getElementById("insertTable").innerHTML = dataText;

        } else {
            document.getElementById("statusMessage").innerHTML = "Error" + xhr.status;
        }
    }
}
}());

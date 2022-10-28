(function () {
window.onload = getFavoriteRoutes;
let xhr = false;

function getFavoriteRoutes() {
    if (window.XMLHttpRequest) {
        xhr = new XMLHttpRequest();
    } else {
        if (window.ActiveXObject) {
            xhr = newActiveXObject("Microsoft.XMLHTTP");
        }
    }
    if (xhr) {
        xhr.open("GET", "data/routes.json", true);
        xhr.send();
        xhr.onreadystatechange = displayFavoriteRoutes;
    } else {
        document.getElementById("statusmessage").innerHTML = "Error. Could not perform the stated request";
    }
}

function displayFavoriteRoutes() {
    if (xhr.readyState == 4) {
        if (xhr.status == 200) {
            const data = JSON.parse(xhr.responseText);
            let dataText = "";
            /* Local favourite variable */
            const favorites = getLocalStorage();

            /* For loop to add new favourite line onto table */
            for (let current = 0; current < favorites.length; current++) {
                /* If the favourite route matches that in the JSON route date, it will add the line and display */
                for (let i in data.routes) {
                    if (parseInt(favorites[current]) === parseInt(data.routes[i].id)) {
                        dataText +=
                            `<tr>
                                <td class="text-primary-darker text-center display-6">${data.routes[i].name}</td>
                                <td class="d-grid col-sm-6">
                                    <a href='route.html?id=${data.routes[i].id}' class='btn btn-primary d-grid col-sm-12'>Details</a>
                                </td>
                                <!--
                                <td class="text-center">
                                    <input type="checkbox" class="btn-check" id="btnCheck" autocomplete="off">
                                    <label class="btn btn-outline-primary" for="btnCheck">Complete</label><br>
                                </td>  
                                -->      
                            </tr>`
                    }
                }
            }
            document.getElementById("insertFavTable").innerHTML = dataText;
        } else {
            document.getElementById("statusMessage").innerHTML = "Error. Could not perform the stated request Error: " + xhr.status;
        }
    }
}

function getLocalStorage() {
    return JSON.parse(window.localStorage.getItem('routes'));
}
}());

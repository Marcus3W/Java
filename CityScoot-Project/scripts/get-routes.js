(function () {

    let xhr = false;
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
        xhr.onreadystatechange = displayRoutes;

    } else {
        document.getElementById("statusmessage").innerHTML = "Error with obtaining data";
    }

    /**
     * Function to display table of all routes available in the routes.JSON
     * @author Marc Wheeler
     */
    function displayRoutes() {
        if (xhr.readyState == 4) {
            if (xhr.status == 200) {
                const data = JSON.parse(xhr.responseText);
                let dataText = "";

                for (let i in data.routes) {
                    if (data.routes[i].id >= 0) {
                        dataText +=
                            "<tr><td class='text-primary-darker'><strong>" +
                            data.routes[i].name + "</strong></td><td class='text-left'>" +
                            data.routes[i].day + "</td><td class='text-left'>" +
                            data.routes[i].time + "</td><td class='text-left d-none d-lg-block'>" +
                            data.routes[i].highlights + "</td>" +
                            "<td><a class='btn-narrow btn-outline-primary' href='route.html?id=" + data.routes[i].id + "'>Details</a>" +
                            "</td></tr>";
                    }
                }
                if (dataText.length > 1) {
                    document.getElementById("insertpoint").innerHTML = dataText;
                } else {
                    document.getElementById("datatable").style.display = "none";
                    document.getElementById("statusmessage").style.display = "block";
                    document.getElementById("statusmessage").innerHTML = "No Routes Found";
                }
            } else {
                document.getElementById("statusmessage").innerHTML = "Error" + xhr.status;
            }
        }
    }
}());





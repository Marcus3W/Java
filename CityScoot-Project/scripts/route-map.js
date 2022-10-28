function initMap() {
    getMapDetails();
}

let xhr1 = false;

function getMapDetails() {
    if (window.XMLHttpRequest) {
        xhr1 = new XMLHttpRequest();
    } else {
        if (window.ActiveXObject) {
            xhr1 = newActiveXObject("Microsoft.XMLHTTP");
        }
    }
    if (xhr1) {
        xhr1.open("GET", "data/routes.json", true);
        xhr1.send();
        xhr1.onreadystatechange = displayMap;
    } else {
        document.getElementById("statusmessage").innerHTML = "Error with obtaining data";
    }
}

function displayMap() {
    if (xhr1.readyState == 4) {
        if (xhr1.status == 200) {
            const data = JSON.parse(xhr1.responseText);
            const url = $(location).attr("search");
            const params = new URLSearchParams(url);
            const routeID = parseFloat(params.get("id"));

            for (let i in data.routes) {
                if (data.routes[i].id === routeID) {

                    /* GET USERS CURRENT LOCATION */
                    navigator.geolocation.getCurrentPosition((position) => {

                        /* USERS POSITION */
                        const usermarkerPos = new google.maps.LatLng(
                            position.coords.latitude,
                            position.coords.longitude);

                        /* ROUTE START */
                        const start = new google.maps.LatLng(
                            parseFloat(data.routes[i].startLat),
                            parseFloat(data.routes[i].startLng));

                        /* ROUTE END */
                        const end = new google.maps.LatLng(
                            parseFloat(data.routes[i].endLat),
                            parseFloat(data.routes[i].endLng))

                        /* DISPLAY MAP */
                        const map = new google.maps.Map(document.getElementById("map"), {
                            zoom: 12,
                            center: start,
                            fullscreenControl: false
                        });

                        /* MARKER POSITIONS */
                        /* START */
                        const markerStart = new google.maps.Marker({
                            position: start,
                            map: map
                        });
                        markerStart.setIcon("http://www.google.com/mapfiles/dd-start.png");
                        /* END */
                        const markerEnd = new google.maps.Marker({
                            position: end,
                            map: map
                        });
                        markerEnd.setIcon("http://www.google.com/mapfiles/dd-end.png");
                        /* USER */
                        const userMarker = new google.maps.Marker({
                            position: usermarkerPos,
                            map: map
                        });
                        userMarker.setIcon("http://maps.google.com/mapfiles/ms/icons/blue.png");
                    });
                }
            }
        }
    }
}


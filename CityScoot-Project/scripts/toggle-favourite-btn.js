(function () {

    /* VARIABLE SET UP */

    // get button id from HTML - route.html page
    const addBtn = document.getElementById("favBtn");
    const modalText = document.getElementById("modalText");

    // count to check if button pressed
    let clicks = 0;

    // get page URL / ID
    let url = (location.search);
    const params = new URLSearchParams(url);
    let routesPageID = (params.get("id")); // returns 1 - it is return the id value of this current page
    let routes = (JSON.parse(localStorage.getItem("routes")));


    /* PAGE LOAD CHECK - To check if page is in local storage array*/
    if (routes.includes(routesPageID)) {
        add();
    } else {
        remove();
    }

    /* CLICK EVENT FUNCTION - Process request depending on which button was pressed */
    addBtn.addEventListener("click", function () {
        // checks if class is 'notClicked' and changes to 'clicked' if it is
        if (addBtn.classList.contains("notClicked")) {
            add();
            favouriteToggle();
        } else {
            if (clicks === 0) {
                alert("Cannot removes as not in favourites");
            } else {
                remove();
                favouriteToggle();
            }
        }
    });

    /* Two functions (add & remove) which add text to the button depending on its status */
    function add() {
        addBtn.classList = ["btn btn-danger row d-grid col-sm-12 clicked"];
        addBtn.innerHTML = `<p class="mb-2">Remove Favourite</p><i class="fa-solid fa-circle-minus"></i>`
        modalText.innerHTML = `<p id="modalText">Added to <span><a href="favourites.html" class="tooltip-test" title="Tooltip">Favorites</a></span>`
        clicks++;
    }

    function remove() {
        addBtn.classList = ["btn btn-primary row d-grid col-sm-12 notClicked"];
        addBtn.innerHTML = `<p class="mb-2">Add Favourite</p><i class="fas fa-star"></i>`;
        modalText.innerHTML = `<p id="modalText">Removed from <span><a href="favourites.html" class="tooltip-test" title="Tooltip">Favorites</a></span>`
        clicks = 0;
    }


    function favouriteToggle() {
        // Get a URL
        let url = $(location).attr("search");
        const params = new URLSearchParams(url);

        // Get querystring
        let routesID = params.get("id");
        let routes;

        // Check to see if array already exists
        if (localStorage.getItem("routes") === null) {
            routes = [];
        } else {
            // Get value in local storage using:
            routes = JSON.parse(localStorage.getItem("routes"));
        }

        /* Add or Remove page depending on if it is in the array */
        if (!routes.includes(routesID)) {
            routes.push(routesID);
            localStorage.setItem('routes', JSON.stringify(routes));
        } else {
            routes.pop(routesID);
            localStorage.setItem('routes', JSON.stringify(routes));
        }
    }
}());

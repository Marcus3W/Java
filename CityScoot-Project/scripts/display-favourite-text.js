/**
 * Function will display specific text depending on if there are any favourite
 * routes saved to the local storage
 * @return add text to routes.html page
 * @author Marc Wheeler
 */
(function () {
document.addEventListener('readystatechange', event => {
    if (event.target.readyState === "complete") {
        getFavouriteAddedText();
    }
});

/**
 * Function to display text depending on if there are favourites saves or not
 * @author Marc Wheeler
 */
function getFavouriteAddedText() {
    let favouritesText = "";
    /* Local favourite variable */
    const favorites = JSON.parse(window.localStorage.getItem('routes'));

    /* add functionality to display section on Routes page - if favourites in array, true and else false*/
    if (favorites.length > 0) {
        /* Routes page text */
        favouritesText +=
            `
            <p class="my-2">View all your favourite routes - Take a look and book your next tour with us.</p>
            <a href="favourites.html"
            class="btn btn-primary d-flex col-lg-6 mx-auto align-items-center justify-content-center"
            >See list</a>
            `
        document.getElementById("favouriteAdded").innerHTML = favouritesText;

    } else {
        favouritesText +=
            `
            <p class="my-2">You can add routes to your favourites list, see individual routes below.</p>       
            `
        document.getElementById("favouriteAdded").innerHTML = favouritesText;
    }
}
}());

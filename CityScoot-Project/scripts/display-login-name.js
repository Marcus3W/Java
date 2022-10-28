/**
 * Function to obtain user login's name from firebase - In this example I have used email
 * just to show the functionality of it - In a real world application I would use their first name
 * @return returns currently logged-in user email address
 * @author Marc Wheeler
 */
(function () {
    const firebaseConfig = {
        apiKey: "AIzaSyDGZqlaiqdnPY9TDT8HDeBlDV-RpcBWD6M",
        authDomain: "mwad-7dfae.firebaseapp.com",
        databaseURL: "https://mwad-7dfae-default-rtdb.europe-west1.firebasedatabase.app",
        projectId: "mwad-7dfae",
        storageBucket: "mwad-7dfae.appspot.com",
        messagingSenderId: "524904993154",
        appId: "1:524904993154:web:f66aff64ca8d00c9b87f9b"
    };
    /* INITIALISE FIREBASE */
    firebase.initializeApp(firebaseConfig);

    const displayUserEmail = document.getElementById("displayUser");

    /* DISPLAY TOGGLE DEPENDING ON LOG IN STATUS */
    firebase.auth().onAuthStateChanged(firebaseUser => {
        /* IF USER HAS SUCCESSFULLY LOGGED IN */
        if (firebaseUser) {
            /* GET LOGGED IN USERS NAME TO DISPLAY */
            const userName = getName();
            document.cookie = "validSession=true";
            displayUserEmail.innerHTML = userName;

            /* IF USER IS LOGGED OUT HIDE*/
        } else {
            document.cookie = "validSession=false";
            displayUserEmail.style.display = "none";
        }
    });

    function getName() {
        return firebase.auth().currentUser.email;
    }
}());

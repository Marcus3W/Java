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

/* LOG IN VARIABLES */
const textEmail = document.getElementById("textEmail");
const textPassword = document.getElementById("textPassword");
const textEmailLabel = document.getElementById("textEmailLabel");
const textPasswordLabel = document.getElementById("textPasswordLabel");

/* SIGN UP VARIABLES */
const signUpTextEmail = document.getElementById("signUpTextEmail");
const signUpTextPassword = document.getElementById("signUpTextPassword");
const SignUpTextEmailLabel = document.getElementById("SignUpTextEmailLabel");
const SignUpTextPasswordLabel = document.getElementById("SignUpTextPasswordLabel");
const btnSignup = document.getElementById("btnSignup");
const btnSignupBox = document.getElementById("btnSignupBox");

/* BUTTON VARIABLES */
const btnLogin = document.getElementById("btnLogin");
const btnLogout = document.getElementById("btnLogout");
const loginStatus = document.getElementById("loginStatus");


/* EVENT (CLICK) LISTENERS FOR BUTTONS */
btnSignup.addEventListener("click", e => {
    const enteredEmail = signUpTextEmail.value;
    const enteredPassword = signUpTextPassword.value;
    /* FIRE BASE CHECK */
    const auth = firebase.auth();
    const promise = auth.createUserWithEmailAndPassword(enteredEmail, enteredPassword);
    // MAKE MODAL FOR THIS IF TIME
    promise.catch(e => alert("Could not sign you up in at this time. \n" + e.message));

});
btnLogin.addEventListener("click", e => {
    const enteredEmail = textEmail.value;
    const enteredPassword = textPassword.value;
    /* FIRE BASE CHECK */
    const auth = firebase.auth();
    const promise = auth.signInWithEmailAndPassword(enteredEmail, enteredPassword);
    document.cookie="validSession=true";
    // MAKE MODAL FOR THIS IF TIME
    promise.catch(e => alert("Could not log you in at this time. \n" + e.message));

});
btnLogout.addEventListener("click", e => {
    firebase.auth().signOut();
    document.cookie="validSession=false";
});

/* DISPLAY TOGGLE DEPENDING ON LOG IN STATUS */
firebase.auth().onAuthStateChanged(firebaseUser => {
    /* IF USER HAS SUCCESSFULLY LOGGED IN */
    if (firebaseUser) {
        /* GET LOGGED IN USERS NAME TO DISPLAY */
        const userName = getName();
        document.cookie = "validSession=true";
        /* STYLE ADJUSTMENTS */
        textEmail.style.display = "none";
        textPassword.style.display = "none";
        textEmailLabel.style.display = "none";
        textPasswordLabel.style.display = "none";
        signUpTextEmail.style.display = "none";
        signUpTextPassword.style.display = "none";
        SignUpTextPasswordLabel.style.display = "none";
        SignUpTextEmailLabel.style.display = "none";
        btnLogout.style.display = "block";
        btnSignup.style.display = "none";
        btnLogin.style.display = "none";
        /* HTML DISPLAY SECTION */
        loginStatus.innerHTML = `Welcome - you are logged in as ${userName}`;
        btnSignupBox.innerHTML = `Welcome back! Don't forget to look into our new tours!`
        btnSignupBox.classList = ["row d-grid col-sm-12 my-0 mx-0"];
        displayUserEmail.innerHTML = "hello";

    /* IF USER IS LOGGED OUT */
    } else {
        document.cookie = "validSession=false";
        /* STYLE ADJUSTMENTS */
        textEmail.style.display = "block";
        textPassword.style.display = "block";
        textEmailLabel.style.display = "block";
        textPasswordLabel.style.display = "block";
        signUpTextEmail.style.display = "block";
        signUpTextPassword.style.display = "block";
        btnLogout.style.display = "none";
        btnSignup.style.display = "block";
        btnLogin.style.display = "block";
        /* HTML DISPLAY SECTION */
        loginStatus.innerHTML = "You are not currently logged in. Please log in.";
        btnSignupBox.classList = ["No account? No Problem"];
    }
});

/**
 * Function to obtain the users email address from firebase.
 * @return returns full email address of user logged in
 * @author Marc Wheeler
 */
function getName() {
    return firebase.auth().currentUser.email;
}
}());

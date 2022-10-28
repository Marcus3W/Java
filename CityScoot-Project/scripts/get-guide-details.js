/**
 * Function to obtain data from Firebase Realtime Database and display data
 * Currently displays 'guides' in alphabetical order of their Last Names
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

    // Initialize Firebase
    firebase.initializeApp(firebaseConfig);

    // get immediate child of the root data noda and assign it to a constant
    // this is the object that contains the database data (in order)
    const guidesRef = firebase.database().ref().child("guides");

    // Organise guides by surname - use orderByChild then search for lastName in database
    guidesRef.orderByChild("lastName").on("child_added", snap => {
        // create variables for all the data - might not need all, but good to have access to all

        let guidesFirstName = snap.child("firstName").val();
        let guidesLastName = snap.child("lastName").val();
        let guidesAge = snap.child("age").val();
        let guidesOccupation = snap.child("occupation").val();
        let guidesBlueBadge = snap.child("blueBadge").val();
        let guidesTour = snap.child("tours").val();

        //let guidesID = snap.child("id").val();
        //let guidesImage = snap.child("image").val();

        /* Loop through data - only display guides with blue badge (2.2.4)
        -- Note: There should only be 8 guides with blue badges */
        if(guidesBlueBadge ==="Yes") {
            $("#insertPointGuides").append(
                `
                    <tr>
                    <td class='text-primary-darker'> ${guidesFirstName} ${guidesLastName} </td>
                    <td class="text-left"> ${guidesAge} </td>
                    <td class="text-left d-none d-lg-block"> ${guidesOccupation} </td>
                    <td class="text-left"> ${guidesBlueBadge} </td>
                    <td class="text-left"> ${guidesTour} </td>
                `
            );
        }
    });
}());

/**
 * Function to iterate through database data and display only those in the search box.
 * Currently, only filers using the first name
 */
function filterGuide() {
    // Declare all required variables
    let input;
    let filter;
    let table;
    let tableRow;
    let tableData;
    let guide;
    let textValue;

    // Locate objects in guides.html and assign to variables
    table = document.getElementById("datatable");
    tableRow = table.getElementsByTagName("tr");
    input = document.getElementById("guideInput");
    // Uppercase added to remove the need to be case-sensitive
    filter = input.value.toUpperCase();

    // Loop algorithm to iterated through table rows will hide guide rows that -
    // - do not match the search text entered
    for (guide = 0; guide < tableRow.length; guide++) {
        tableData = tableRow[guide].getElementsByTagName("td")[0];
        if (tableData) {
            textValue = tableData.innerText || tableData.textContent;
            if (textValue.toUpperCase().indexOf(filter) > -1) {
                tableRow[guide].style.display = "";
            } else {
                tableRow[guide].style.display = "none";
            }
        }
    }
}

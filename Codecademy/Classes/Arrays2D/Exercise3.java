package Classes.Arrays2D;

public class Exercise3 {

    // Here is a template which can be used for accessing elements in 2D arrays:
    // datatype variableName = existing2DArray[row][column];

    public static void main(String[] args) {
        // Using the provided 2D array
        int[][] intMatrix = {
                {1, 1, 1, 1, 1},
                {2, 4, 6, 8, 0},
                {9, 8, 7, 6, 5}
        };

        // Access the integer at the first row and fourth column of intMatrix and store it in a variable called retrievedInt
        int retrievedInt = intMatrix[0][3];

        // Print 3 times the center value of intMatrix to the console. Make sure to access the correct element!
        System.out.println(intMatrix[1][2] * 3);



    }
}
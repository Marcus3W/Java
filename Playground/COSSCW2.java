public class COSSCW2 {

    public static void main(String[] args) {
        // Tests for function L
        System.out.println("L(4) = " + L(4));
        System.out.println("L(5) = " + L(5));
        System.out.println("L(6) = " + L(6));
        System.out.println("L(7) = " + L(7));
    }

    /**
     * Function L is defined as L(1) = 2, L(2) = 1, L(3) = 3, L(4) = 4 and for n > 4,
     * (L(n) * L(n-2) + L(n-1)) / L(n-3)
     * If will iterate through a loop if k is greater than 4 and will terminate once
     * k is less than 5.
     * @param k - this is the n'th+1 value to be tested
     * @return returns the value of L(n+1)
     * @author Marc Wheeler
     */
    public static double L( int k) {
        // store initial values into an array (Could have been done with variables)
        double[] valuesStored = {2, 1, 3, 4};
        // Loop conditional check
        while (k > 4) {
            k--;
            double n = valuesStored[valuesStored.length-1];
            double nMinus1 = valuesStored[valuesStored.length-2];
            double nMinus2 = valuesStored[valuesStored.length-3];
            double nMinus3 = valuesStored[valuesStored.length-4];
            // calculate new value of n using the formula in Javadocs
            double newValue = (n * (nMinus2) + (nMinus1)) / (nMinus3);
            // Store new data into array
            valuesStored[0] = valuesStored[1];
            valuesStored[1] = valuesStored[2];
            valuesStored[2] = valuesStored[3];
            valuesStored[3] = newValue;
        }
        return valuesStored[valuesStored.length-1];
    }
}

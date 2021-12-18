package Classes.Loops;

import java.util.ArrayList;

/**
 * Build a PrimeDirective program that creates an ArrayList of all
 * prime numbers in an array.
 */
public class PrimeDirective {

    public static void main(String[] args) {
        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        System.out.println(pd.isPrime(7));
        System.out.println(pd.isPrime(28));
        System.out.println(pd.isPrime(2));
        System.out.println(pd.isPrime(0));
        System.out.println(pd.onlyPrimes(numbers));
    }

    /**
     * Returns an ArrayList of prime numbers from a given list.
     * Calls isPrime method to check if each number is a prime number
     * @param numbers a list of numbers
     * @return ArrayList of all the prime numbers
     */
    public ArrayList<Integer> onlyPrimes(int[] numbers) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int number : numbers) {
            if (isPrime(number)) {
                primes.add(number);
            }
        }
        return primes;
    }

    /**
     * Checks if a number is a prime number
     * @param number integar passed to method to check
     * @return boolean value whether given number is a prime or not
     */
    public boolean isPrime(int number) {
        if (number == 2) { return true; }
        else if (number < 2) { return false; }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

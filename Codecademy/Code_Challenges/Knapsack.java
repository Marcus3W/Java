package Code_Challenges;


/**
 * Imagine that you are a thief breaking into a house.
 * There are so many valuables to steal, but you’re just one person who can only carry so much.
 * Each item has a weight and value, and your goal is to maximize the total value of items
 * while remaining within the weight limit of your knapsack.
 */
public class Knapsack {
    public static void main(String[] args) {

        int values[] = new int[] {50, 60, 100};
        int weights[] = new int[] {3, 8, 6};
        int weightCap = 10;

        System.out.println(knapsack(weightCap, weights, values));
    }

    /**
     * @param weightCap the total amount of weight you can carry
     * @param weights an array of the weights of all of the items
     * @param values an array of the values of all of the items
     * @return the maximum value that you will be able to carry
     */
    public static int knapsack(int weightCap, int weights[], int values[]) {
            return 0;
        }
}

public class Beginner {

    public static int grow(int[] x) {
        int product = 1; // Start with 1, as multiplying by 1 does not change the product

        // Iterate through the array and multiply each element to the product
        for (int num : x) {
            product *= num; // Multiply each number to the product
        }

        return product; // Return the final product
    }
}
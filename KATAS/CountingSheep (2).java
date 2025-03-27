public class CountingSheep {
    public static String countingSheep(int num) {
        StringBuilder result = new StringBuilder(); // Use StringBuilder for efficient string concatenation
        System.out.println("Counting sheep to fall asleep"); // Print the initial message

        for (int i = 1; i <= num; i++) {
            result.append(i).append(" sheep\n"); // Append the current count of sheep
        }

        return result.toString(); // Return the result as a string
    }

    public static void main(String[] args) {
        System.out.println(countingSheep(5)); // Example usage
    }
}

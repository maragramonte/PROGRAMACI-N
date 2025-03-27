import java.util.Scanner;

public class SnailCrawlsUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        System.out.print("Enter the height of the column (H in meters): ");
        int H = scanner.nextInt();
        System.out.print("Enter the distance the snail crawls during the day (U in meters): ");
        int U = scanner.nextInt();
        System.out.print("Enter the distance the snail slides down during the night (D in meters): ");
        int D = scanner.nextInt();

        // Validate inputs
        if (H <= 0 || U <= 0 || D < 0) {
            System.out.println("Height (H) and distance crawled (U) must be positive, and distance slid (D) cannot be negative.");
            scanner.close(); // Close the scanner
            return; // Exit the program if inputs are invalid
        }
        
        if (U <= D && U < H) {
            System.out.println("The snail will never reach the top because it slides down as much or more than it climbs.");
            scanner.close(); // Close the scanner
            return; // Exit the program if the snail can't reach the top
        }

        // Calculate the number of days to reach the top
        int days = calculateDays(H, U, D);
        System.out.println("The snail will reach the top in " + days + " days.");

        scanner.close(); // Close the scanner
    }

    private static int calculateDays(int H, int U, int D) {
        // Initialize variables
        int currentHeight = 0;
        int days = 0;

        while (currentHeight < H) {
            days++; // A new day
            currentHeight += U; // Snail crawls up during the day
            if (currentHeight >= H) {
                break; // Check if it reached the top
            }
            currentHeight -= D; // Snail slips down at night
        }

        return days;
    }
}
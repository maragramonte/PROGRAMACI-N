import java.util.Scanner;

public class SnailCrawls2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        System.out.print("Enter the height of the well (H in meters): ");
        int H = scanner.nextInt();
        System.out.print("Enter the distance the snail crawls during the day (U in meters): ");
        int U = scanner.nextInt();
        System.out.print("Enter the distance the snail slides down during the night (D in meters): ");
        int D = scanner.nextInt();

        // Calculate the number of days to reach the top
        int days = calculateDays(H, U, D);
        System.out.println("The snail will reach the top in " + days + " days.");
    }

    private static int calculateDays(int H, int U, int D) {
        // Check if the snail can reach the top in one day
        if (U >= H) {
            return 1;
        }

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
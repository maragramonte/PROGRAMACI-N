import java.util.Arrays;

public class Solution {
    public static int minSum(int[] passed) {
        // Step 1: Sort the array
        Arrays.sort(passed);
        
        int minSum = 0;
        int n = passed.length;
        
        // Step 2: Pair smallest with largest
        for (int i = 0; i < n / 2; i++) {
            minSum += passed[i] * passed[n - 1 - i];
        }
        
        return minSum; // Return the calculated minimum sum
    }
    
    // Example usage
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 3};
        System.out.println(minSum(arr)); // Output: 22
    }
}
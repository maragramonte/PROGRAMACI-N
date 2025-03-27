import java.util.HashMap;

public class SumOfArraySingles {
    public static int repeats(int[] arr) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        
        // Count occurrences of each number
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        // Sum the numbers that occur only once
        int sum = 0;
        for (int num : countMap.keySet()) {
            if (countMap.get(num) == 1) {
                sum += num;
            }
        }
        
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(repeats(new int[]{4, 5, 7, 5, 4, 8})); // Output: 15
    }
}
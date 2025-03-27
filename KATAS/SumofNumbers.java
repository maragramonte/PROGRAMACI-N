import java.util.HashSet;

class SumofNumbers {
    public static int repeats(int[] arr) {
        HashSet<Integer> singleOccurrences = new HashSet<>();
        HashSet<Integer> multipleOccurrences = new HashSet<>();
        
        // Contar las ocurrencias
        for (int num : arr) {
            if (singleOccurrences.contains(num)) {
                // Si ya está en singleOccurrences, lo movemos a multipleOccurrences
                singleOccurrences.remove(num);
                multipleOccurrences.add(num);
            } else if (!multipleOccurrences.contains(num)) {
                // Si no está en multipleOccurrences, lo agregamos a singleOccurrences
                singleOccurrences.add(num);
            }
        }
        
        // Sumar los números que están en singleOccurrences
        int sum = 0;
        for (int num : singleOccurrences) {
            sum += num;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(repeats(new int[]{4, 5, 7, 5, 4, 8})); // Output: 15
        System.out.println(repeats(new int[]{1, 2, 3, 1, 2, 4})); // Output: 7 (3 + 4)
        System.out.println(repeats(new int[]{10, 20, 10, 30, 20, 40})); // Output: 70 (30 + 40)
    }
}
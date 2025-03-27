public class FizzBuzz {

    public static String convert(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(i);
        }
    }

    public static void main(String[] args) {
        // Test the FizzBuzz implementation
        for (int i = 1; i <= 15; i++) {
            System.out.println(convert(i));
        }
    }
}
public class FixStingCase {
    public static String solve(final String str) {
        int lowerCount = 0;
        int upperCount = 0;

        // Count the number of lowercase and uppercase letters
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowerCount++;
            } else if (Character.isUpperCase(c)) {
                upperCount++;
            }
        }

        // Determine which case to convert to
        if (lowerCount >= upperCount) {
            return str.toLowerCase(); // Convert to lowercase if lowerCount >= upperCount
        } else {
            return str.toUpperCase(); // Convert to uppercase if upperCount > lowerCount
        }
    }
}
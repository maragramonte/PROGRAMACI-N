public class Quadrants {
  
    public static int quadrant(int x, int y) {
        if (x > 0 && y > 0) {
            return 1; // Quadrant 1
        } else if (x < 0 && y > 0) {
            return 2; // Quadrant 2
        } else if (x < 0 && y < 0) {
            return 3; // Quadrant 3
        } else if (x > 0 && y < 0) {
            return 4; // Quadrant 4
        }
        return 0; // This line will never be reached due to the problem constraints
    }
}
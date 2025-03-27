class Cube {
    public static boolean isCube(int volume, int side) {
        // Verificar si el volumen y el lado son válidos
        if (volume <= 0 || side <= 0) {
            return false;
        }

        // Calcular el volumen de un cubo con el lado dado
        int calculatedVolume = side * side * side; // lado^3

        // Verificar si el volumen dado es igual al volumen del cubo
        return volume == calculatedVolume;
    }

    public static void main(String[] args) {
        // Ejemplos de uso
        System.out.println(isCube(27, 3)); // true, porque 3^3 = 27
        System.out.println(isCube(30, 3)); // false, porque 3^3 = 27
        System.out.println(isCube(0, 3));  // false, volumen no válido
        System.out.println(isCube(27, -3)); // false, lado no válido
        System.out.println(isCube(64, 4)); // true, porque 4^3 = 64
    }
}
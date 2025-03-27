import java.util.Scanner;

public class MultipleComun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de números: ");
        int cantidadNumeros = scanner.nextInt();
        
        int[] numeros = new int[cantidadNumeros];
        
        // Obtener los números
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + (i+1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        // Calcular el MCM de los números
        int mcm = numeros[0];
        for (int i = 1; i < cantidadNumeros; i++) {
            mcm = lcm(mcm, numeros[i]);
        }
        
        // Mostrar los múltiplos del MCM
        System.out.println("Los múltiplos comunes de los números son:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(mcm * i);
        }
        
        scanner.close();
    }
    
    // Función para calcular el MCM de dos números
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    
    // Función para calcular el máximo común divisor (MCD) usando el algoritmo de Euclides
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

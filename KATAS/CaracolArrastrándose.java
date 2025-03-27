import java.util.Scanner;

public class CaracolArrastrándose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer valores de entrada
        System.out.print("Introduzca la altura del pozo (H en metros): ");
        int H = scanner.nextInt();
        System.out.print("Introduzca la distancia que recorre el caracol durante el día (U en metros): ");
        int U = scanner.nextInt();
        System.out.print("Introduzca la distancia que recorre el caracol durante la noche (D en metros): ");
        int D = scanner.nextInt();

        // Validar entradas
        if (H <= 0 || U <= 0 || D < 0) {
            System.out.println("La altura (H) y la distancia recorrida (U) deben ser positivas, y la distancia deslizada (D) no puede ser negativa.");
            return; // Salir del programa si las entradas no son válidas
        }
        
        if (U <= D) {
            System.out.println("El caracol nunca llegará a la cima porque se desliza hacia abajo tanto o más de lo que sube.");
            return; // Salir del programa si el caracol no puede llegar a la cima
        }

        // Calcula el número de días para llegar a la cima
        int days = calcularDias(H, U, D);
        System.out.println("El caracol llegará a la cima en " + days + " días.");
    }

    // Función para calcular los días que tarda el caracol en llegar a la cima
    public static int calcularDias(int H, int U, int D) {
        int days = 0; // Contador de días
        int height = 0; // Altura actual del caracol

        while (height < H) {
            days++; // Incrementa el contador de días
            height += U; // El caracol sube durante el día
            
            if (height >= H) {
                break; // Si el caracol ha alcanzado o superado la altura del pozo, termina el bucle
            }
            
            height -= D; // El caracol se desliza hacia abajo durante la noche
        }

        return days; // Retorna el número total de días
    }
}
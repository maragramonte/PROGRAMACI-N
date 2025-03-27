import java.util.*;
public class RespuestaAperros {
    public static String responderADogs(int numPerros) {
        if (numPerros == 1) {
            return "¡Un solo perro! ¡Qué lindo!";
        } else if (numPerros == 2) {
            return "¡Dos perros! ¡Doble diversión!";
        } else if (numPerros == 3) {
            return "¡Tres perros! ¡Eso es una manada!";
        } else if (numPerros > 3) {
            return "¡Vaya, " + numPerros + " perros! ¡Tienes un montón ahora!";
        } else {
            return "Algo no está bien... ¿seguro que son tantos perros?";
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int numeroDePerros = 4;  // Puedes cambiar este número para probar diferentes casos
        System.out.println(responderADogs(numeroDePerros));
    }
}
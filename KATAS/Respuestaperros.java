public class Respuestaperros
public static String responderADogs(int numPerros) {
    switch (numPerros) {
        case 1:
            return "¡Un solo perro! ¡Qué lindo!";
        case 2:
            return "¡Dos perros! ¡Doble diversión!";
        case 3:
            return "¡Tres perros! ¡Eso es una manada!";
        default:
            if (numPerros > 3) {
                return "¡Vaya, " + numPerros + " perros! ¡Tienes un montón ahora!";
            } else {
                return "Algo no está bien... ¿seguro que son tantos perros?";
            }
    }
}

public static void main(String[] args) {
    int numeroDePerros = 4;  // Puedes cambiar este número
    System.out.println(responderADogs(numeroDePerros));
    }

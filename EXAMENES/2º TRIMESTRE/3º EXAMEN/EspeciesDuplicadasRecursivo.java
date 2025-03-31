import java.util.HashSet;
import java.util.Set;

public class EspeciesDuplicadasRecursivo {

    // Método recursivo para contar especies duplicadas
    public static int especiesDuplicadas(String[] especies) {
        return contarDuplicados(especies, 0, new HashSet<>(), new HashSet<>());
    }

    // Función recursiva auxiliar
    private static int contarDuplicados(String[] especies, int index, Set<String> especiesUnicas, Set<String> especiesDuplicadas) {
        // Caso base: Si hemos recorrido todo el array, retornamos la cantidad de duplicados
        if (index >= especies.length) {
            return especiesDuplicadas.size();
        }

        // Normalizamos la especie a minúsculas
        String especieNormalizada = especies[index].toLowerCase();

        // Si ya estaba en especiesUnicas, es un duplicado
        if (!especiesUnicas.add(especieNormalizada)) {
            especiesDuplicadas.add(especieNormalizada);
        }

        // Llamada recursiva con el siguiente índice
        return contarDuplicados(especies, index + 1, especiesUnicas, especiesDuplicadas);
    }

    public static void main(String[] args) {
        // Ejemplo 1
        String[] especies1 = {"MushroomV", "Toadstool", "mushroomv", "Truffle", "TOADSTOOL", "Chanterelle"};
        System.out.println("Especies duplicadas (Ejemplo 1): " + especiesDuplicadas(especies1));  // 2

        // Ejemplo 2
        String[] especies2 = {"Orchid", "Sunflower", "Carnation", "Lily"};
        System.out.println("Especies duplicadas (Ejemplo 2): " + especiesDuplicadas(especies2));  // 0

        // Ejemplo 3
        String[] especies3 = {"Mamboo", "Mamboo", "MAMBOO", "MamboO"};
        System.out.println("Especies duplicadas (Ejemplo 3): " + especiesDuplicadas(especies3));  // 1
    }
}

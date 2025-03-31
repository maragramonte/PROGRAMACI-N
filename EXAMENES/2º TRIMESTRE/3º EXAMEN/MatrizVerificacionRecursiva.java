public class MatrizVerificacionRecursiva {

public static boolean verificarDiagonales(int[][] matriz) {
if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
return false;
}

// Comenzamos la recursión desde el segundo elemento de cada parte
return verificarPrimeraColumna(matriz, 1, matriz[0][0]) &&
verificarUltimaFila(matriz, matriz.length - 1, 1, matriz[matriz.length - 1][0]);
}

// Verificar que todos los elementos de la primera columna sean iguales
private static boolean verificarPrimeraColumna(int[][] matriz, int fila, int valorEsperado) {
if (fila >= matriz.length) return true; // Caso base: hemos revisado toda la columna
if (matriz[fila][0] != valorEsperado) return false; // Si encontramos un valor diferente, retorna falso
return verificarPrimeraColumna(matriz, fila + 1, valorEsperado); // Llamada recursiva
}

// Verificar que todos los elementos de la última fila sean iguales
private static boolean verificarUltimaFila(int[][] matriz, int ultimaFila, int columna, int valorEsperado) {
if (columna >= matriz[ultimaFila].length) return true; // Caso base: hemos revisado toda la fila
if (matriz[ultimaFila][columna] != valorEsperado) return false; // Si encontramos un valor diferente, retorna falso
return verificarUltimaFila(matriz, ultimaFila, columna + 1, valorEsperado); // Llamada recursiva
}

public static void main(String[] args) {
System.out.println(verificarDiagonales(new int[][]{{1, 2, 3}, {1, 2, 3}, {1, 2, 3}})); // true
System.out.println(verificarDiagonales(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})); // false
System.out.println(verificarDiagonales(new int[][]{{2, 2, 2}, {2, 2, 2}, {2, 2, 2}})); // true
System.out.println(verificarDiagonales(new int[][]{{1, 2}, {1, 2}, {1, 3}})); // false
}
}
public class SoBasic {
    public static int convertBase20ToDecimal(String init) {
        // Verificar si la entrada es nula o vacía
        if (init == null || init.isEmpty()) {
            return -1; // Retornar -1 si la entrada no es válida
        }
        
        int decimalValue = 0;
        int length = init.length();
        
        // Recorrer cada carácter de la cadena
        for (int i = 0; i < length; i++) {
            char charAtIndex = init.charAt(length - 1 - i); // Obtener el carácter desde el final
            int value;

            // Determinar el valor del carácter
            if (charAtIndex >= '0' && charAtIndex <= '9') {
                value = charAtIndex - '0'; // Convertir '0'-'9' a 0-9
            } else if (charAtIndex >= 'A' && charAtIndex <= 'J') {
                value = charAtIndex - 'A' + 10; // Convertir 'A'-'J' a 10-19
            } else if (charAtIndex >= 'a' && charAtIndex <= 'j') {
                value = charAtIndex - 'a' + 10; // Convertir 'a'-'j' a 10-19
            } else {
                return -1; // Retornar -1 si hay un carácter no válido
            }

            // Acumular el valor decimal
            decimalValue += value * Math.pow(20, i);
        }

        return decimalValue; // Retornar el valor decimal final
    }

    public static void main(String[] args) {
        // Ejemplos de uso
        System.out.println(convertBase20ToDecimal("1A")); // Debería retornar 30
        System.out.println(convertBase20ToDecimal("10")); // Debería retornar 20
        System.out.println(convertBase20ToDecimal("1Z")); // Debería retornar -1 (carácter no válido)
        System.out.println(convertBase20ToDecimal("")); // Debería retornar -1 (entrada vacía)
    }
}
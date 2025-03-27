public class BalancedNum {
    public static String balancedNum(long number) {
        // Convertir el número a una cadena para manipular los dígitos
        String numStr = String.valueOf(number);
        int length = numStr.length();
        
        // Si el número tiene 1 o 2 dígitos, automáticamente está equilibrado
        if (length <= 2) {
            return "Balanced";
        }
        
        // Identificar el índice central del número
        int mid = length / 2;
        
        // Si la longitud es impar, hay un solo dígito en el medio
        if (length % 2 == 1) {
            // Sumar dígitos a la izquierda y a la derecha del medio
            int leftSum = sumDigits(numStr.substring(0, mid));
            int rightSum = sumDigits(numStr.substring(mid + 1));
            
            if (leftSum == rightSum) {
                return "Balanced";
            }
        } else {
            // Si la longitud es par, los dos dígitos en el medio se excluyen
            int leftSum = sumDigits(numStr.substring(0, mid - 1));
            int rightSum = sumDigits(numStr.substring(mid + 1));
            
            if (leftSum == rightSum) {
                return "Balanced";
            }
        }
        
        return "Not Balanced";
    }
    
    // Función para sumar los dígitos de una cadena
    private static int sumDigits(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            sum += c - '0';  // Convertir el char a int y sumarlo
        }
        return sum;
    }
}

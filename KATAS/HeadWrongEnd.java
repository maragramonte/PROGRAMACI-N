public class HeadWrongEnd {
    public static void main(String[] args) {
        String[] meerkat1 = {"tail", "body", "head"};
        String[] fixed1 = WrongEndHead.fixTheMeerkat(meerkat1);
        System.out.println(String.join(", ", fixed1)); // Debería imprimir "head, body, tail"

        String[] meerkat2 = {"tail", "body", "head"};
        String[] fixed2 = WrongEndHead.fixTheMeerkat(meerkat2);
        System.out.println(String.join(", ", fixed2)); // Debería imprimir "head, body, tail"

        // Casos de prueba adicionales
        String[] meerkat3 = {"tail", "body", "head"};
        String[] fixed3 = WrongEndHead.fixTheMeerkat(meerkat3);
        System.out.println(String.join(", ", fixed3)); // Debería imprimir "head, body, tail"
    }
}
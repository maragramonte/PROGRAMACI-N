public class TestChangeFirstLetter {
    public static void main(String[] args) {
        // Ejemplo 1: Cambiar la primera letra minúscula a mayúscula
        String input1 = "hola mundo";
        String output1 = changeFirstLetter(input1, true);
        System.out.println(output1); // Salida: "Hola mundo"

        // Ejemplo 2: Cambiar la primera letra mayúscula a minúscula
        String input2 = "Hola Mundo";
        String output2 = changeFirstLetter(input2, false);
        System.out.println(output2); // Salida: "hola Mundo"

        // Ejemplo 3: Sin cambios (primera letra ya es mayúscula)
        String input3 = "JAVA es genial";
        String output3 = changeFirstLetter(input3, false);
        System.out.println(output3); // Salida: "java es genial"

        // Ejemplo 4: Sin cambios (primera letra ya es minúscula)
        String input4 = "java es genial";
        String output4 = changeFirstLetter(input4, true);
        System.out.println(output4); // Salida: "Java es genial"

        // Ejemplo 5: Ignorar caracteres no alfabéticos
        String input5 = "1234 hola";
        String output5 = changeFirstLetter(input5, true);
        System.out.println(output5); // Salida: "1234 Hola"
    }
}
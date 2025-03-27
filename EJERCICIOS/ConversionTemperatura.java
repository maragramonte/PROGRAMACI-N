import java.util.Scanner;

public class ConversionTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperatura en Fahrenheit: " + fahrenheit);
    }
}

/* import java.util.Scanner;

public class ConversionTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en Celsius: ");
        double celsius = scanner.nextDouble();
        ConversorTemperatura conversor = new ConversorTemperatura();
        System.out.println("Temperatura en Fahrenheit: " + conversor.aFahrenheit(celsius));
    }
}

class ConversorTemperatura {
    public double aFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
} */
import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature value:");
        double temperature = scanner.nextDouble();

        System.out.println("Enter the unit of the temperature (C/F/K):");
        char unit = scanner.next().toUpperCase().charAt(0);

        switch (unit) {
            case 'C':
                convertFromCelsius(temperature);
                break;
            case 'F':
                convertFromFahrenheit(temperature);
                break;
            case 'K':
                convertFromKelvin(temperature);
                break;
            default:
                System.out.println("Invalid unit. Please enter C, F, or K.");
        }

        scanner.close();
    }

    public static void convertFromCelsius(double celsius) {
        double fahrenheit = celsius * 9 / 5 + 32;
        double kelvin = celsius + 273.15;

        System.out.printf("%.2f°C is equivalent to %.2f°F and %.2fK%n", celsius, fahrenheit, kelvin);
    }

    public static void convertFromFahrenheit(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        double kelvin = (fahrenheit - 32) * 5 / 9 + 273.15;

        System.out.printf("%.2f°F is equivalent to %.2f°C and %.2fK%n", fahrenheit, celsius, kelvin);
    }

    public static void convertFromKelvin(double kelvin) {
        double celsius = kelvin - 273.15;
        double fahrenheit = (kelvin - 273.15) * 9 / 5 + 32;

        System.out.printf("%.2fK is equivalent to %.2f°C and %.2f°F%n", kelvin, celsius, fahrenheit);
    }
}

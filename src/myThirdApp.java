import java.util.Scanner;

/*public class myThirdApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the number of days (enter a non-positive value to exit): ");
            int days = scanner.nextInt();

            if (days <= 0) {
                System.out.println("Exiting program...");
                break;
            }

            int weeks = days / 7;
            int remainingDays = days % 7;

            System.out.println(days + " days is " + weeks + " weeks and " + remainingDays + " days");
        }

        scanner.close();
    }
}*/

public class myThirdApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the temperature in Celsius (-1 to exit): ");
            double celsius = scanner.nextDouble();

            if (celsius == -1) {
                System.out.println("Exiting program...");
                break;
            }

            double fahrenheit = celsiusToFahrenheit(celsius);
            double kelvin = celsiusToKelvin(celsius);

            System.out.printf("%.2f Celsius is %.2f Fahrenheit and %.2f Kelvin%n", celsius, fahrenheit, kelvin);
        }

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
}
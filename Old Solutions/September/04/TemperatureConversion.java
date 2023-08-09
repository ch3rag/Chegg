import java.util.Scanner;

public class TemperatureConversion {

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * (5.0 / 9.0) + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * (9.0 / 5.0) + 32;
    }


    enum Scale {
        KELVIN,
        CELSIUS,
        FAHRENHEIT
    }

    private static Scanner input = new Scanner(System.in);

    public static Scale getScale(String prompt) {
        Scale scale = Scale.CELSIUS;
        while (true) {
            System.out.print(prompt);
            try {
                scale = Scale.valueOf(input.nextLine().toUpperCase());
                break;
            } catch (IllegalArgumentException ex) {
                System.out.println("Invalid Scale. Try Again.");
            }
        }
        return scale;
    }

    public static double getDouble(String prompt) {
        double value = 0;
        while (true) {
            System.out.print(prompt);
            try {
                value = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Please Enter A Numeric Value. Try Again.");
            }
        }
        return value;
    }

    public static void main(String[] args) {
        do {
            double value = getDouble("Enter A Temperature Value: ");
            Scale from = getScale("Enter The Starting Scale: ");
            Scale to = getScale("Enter The Target Scale: ");
            double result = value;
            switch (from) {
                case CELSIUS:
                    result = celsiusToKelvin(result);
                    break;
                case FAHRENHEIT:
                    result = fahrenheitToKelvin(result);
                    break;
                case KELVIN:
                    break;
            }

            switch (to) {
                case CELSIUS:
                    result = kelvinToCelsius(result);
                    break;
                case FAHRENHEIT:
                    result = kelvinToFahrenheit(result);
                    break;
                case KELVIN:
                    break;
            }

            System.out.printf("%.2f %s = %.2f %s\n", value, from, result, to);
        } while(true);
    }
}

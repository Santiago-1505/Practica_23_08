import java.util.*;

public class Main {
    public static void main(String[] args) {
      // Conversion de 0°C a Fahrenheit
        double celsius_1 = 0;
        double fahrenheit_1 = (celsius_1 * 9/5) + 32;
        System.out.println("0°C en Fahrenheit: " + fahrenheit_1 + "°F");

        // Conversion de 32°F a Celsius
        double fahrenheit_2 = 32;
        double celsius_2 = (fahrenheit_2 - 32) * 5/9;
        System.out.println("32°F en Celsius: " + celsius_2 + "°C");

        // Conversion de 100°F a Celsius
        double fahrenheit_3 = 100;
        double celsius_3 = (fahrenheit_3 - 32) * 5/9;
        System.out.println("100°F en Celsius: " + celsius_3 + "°C");

        // Conversion de 100°C a Fahrenheit
        double celsius_4 = 100;
        double fahrenheit_4 = (celsius_4 * 9/5) + 32;
        System.out.println("100°C en Fahrenheit: " + fahrenheit_4 + "°F");

        // Conversion de 25°C a Fahrenheit
        double celsius_5 = 25;
        double fahrenheit_5 = (celsius_5 * 9/5) + 32;
        System.out.println("25°C en Fahrenheit: " + fahrenheit_5 + "°F");

        // Conversion de -10°C a Fahrenheit
        double celsius_6 = -10;
        double fahrenheit_6 = (celsius_6 * 9/5) + 32;
        System.out.println("-10°C en Fahrenheit: " + fahrenheit_6 + "°F");

        // Conversion de -40°F a Celsius
        double fahrenheit_7 = -40;
        double celsius_7 = (fahrenheit_7 - 32) * 5/9;
        System.out.println("-40°F en Celsius: " + celsius_7 + "°C");
    }
}

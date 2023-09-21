package homework_nr_4;

public class TemperatureConverter {
    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        System.out.println(temperatureConverter.toCelsius(51));
        System.out.println(temperatureConverter.toFahrenheit(63));

    }

    public double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double toFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

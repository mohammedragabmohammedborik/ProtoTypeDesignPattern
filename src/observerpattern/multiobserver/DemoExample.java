package observerpattern.multiobserver;

public class DemoExample {
    public static void main(String[] args) {
        // Create a weather station  ///......... subject
        WeatherStation weatherStation = new WeatherStation();

        // Create two weather displays //..............observers
        WeatherDisplay display1 = new WeatherDisplay();
        WeatherDisplay display2 = new WeatherDisplay();

        // Register the weather displays as observers
        weatherStation.addObserver(display1);
        weatherStation.addObserver(display2);

        // Set the temperature, and observers will be notified
        weatherStation.setTemperature(25);

        weatherStation.removeObserver(display2);
        System.out.println("..................after un register observer ...............");
        weatherStation.setTemperature(29);


        // Output:
        // Weather Display: Temperature is 25 degrees Celsius
        // Weather Display: Temperature is 25 degrees Celsius
    }
}

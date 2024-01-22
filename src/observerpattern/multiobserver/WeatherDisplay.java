package observerpattern.multiobserver;

// Concrete Observer

public class WeatherDisplay implements WeatherObserver {
    private int temperature;

    @Override
    public void update(int temperature) {
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.println("Weather Display: Temperature is " + temperature + " degrees Celsius");
    }
}

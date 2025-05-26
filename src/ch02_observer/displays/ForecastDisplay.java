package ch02_observer.displays;

import ch02_observer.DisplayElement;
import ch02_observer.Observer;
import ch02_observer.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;

    private float temperature;


    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Forecast: " + (temperature >= 80.0 ? "Improving weather on the way!" : "Watch out for cooler, rainy weather"));
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        display();
    }
}

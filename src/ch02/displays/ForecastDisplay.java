package ch02.displays;

import ch02.DisplayElement;
import ch02.Observer;
import ch02.WeatherData;

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
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        display();
    }
}

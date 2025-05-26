package ch02_observer.displays;

import ch02_observer.DisplayElement;
import ch02_observer.Observer;
import ch02_observer.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float temperature;
    private WeatherData weatherData;


    public StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + temperature + "/" + temperature + "/" + temperature + "/" + temperature);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        display();
    }
}

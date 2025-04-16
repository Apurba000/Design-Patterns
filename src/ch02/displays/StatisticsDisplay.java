package ch02.displays;

import ch02.DisplayElement;
import ch02.Observer;
import ch02.WeatherData;

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
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        display();
    }
}

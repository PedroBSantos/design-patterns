package com.head.first;

import com.head.first.weather.WeatherConditionsDisplay;
import com.head.first.weather.WeatherData;
import com.head.first.weather.WeatherParams;
import com.head.first.weather.WeatherPrevisionDisplay;
import com.head.first.weather.WeatherStatsDisplay;

public class App {

    public static void main(String[] args) {
        var weatherData = new WeatherData();
        var weatherConditionsDisplay = new WeatherConditionsDisplay();
        var weatherStatsDisplay = new WeatherStatsDisplay();
        var weatherPrevisionDisplay = new WeatherPrevisionDisplay();
        weatherData.register(weatherConditionsDisplay);
        weatherData.register(weatherStatsDisplay);
        weatherData.register(weatherPrevisionDisplay);
        weatherData.setWeatherParams(new WeatherParams(80.0f, 65.0f, 30.4f));
    }
}

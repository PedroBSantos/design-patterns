package com.head.first.weather;

import java.util.logging.Logger;

public class WeatherConditionsDisplay implements WeatherObserver, WeatherDisplay {

    private WeatherParams weatherParams;

    @Override
    public void update(WeatherParams weatherParams) {
        this.weatherParams = weatherParams;
        this.display();
    }

    @Override
    public void display() {
        Logger.getGlobal().info("Current Conditions: "
                + this.weatherParams.getTemperature() + " F deegres and "
                + this.weatherParams.getHumidity() + "% humidity");
    }
}

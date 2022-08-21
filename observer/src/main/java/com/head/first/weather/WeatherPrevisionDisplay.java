package com.head.first.weather;

import java.util.logging.Logger;

public class WeatherPrevisionDisplay implements WeatherObserver, WeatherDisplay {

    @Override
    public void update(WeatherParams weatherParams) {
        this.display();
    }

    @Override
    public void display() {
        Logger.getGlobal().info("WeatherPrevisionDisplay");
    }
}

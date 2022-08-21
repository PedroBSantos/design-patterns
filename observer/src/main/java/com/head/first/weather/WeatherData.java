package com.head.first.weather;

public class WeatherData extends WeatherSubject {

    private WeatherParams weatherParams;

    public void setWeatherParams(WeatherParams weatherParams) {
        this.weatherParams = weatherParams;
        this.measurementChanges();
    }

    public void measurementChanges() {
        this.notifyAllObservers();
    }

    @Override
    protected void notifyAllObservers() {
        this.weatherObservers.stream().forEach(observer -> observer.update(this.weatherParams));
    }
}

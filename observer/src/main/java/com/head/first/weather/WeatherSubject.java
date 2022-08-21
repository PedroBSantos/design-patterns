package com.head.first.weather;

import java.util.ArrayList;
import java.util.List;

public abstract class WeatherSubject {

    protected final List<WeatherObserver> weatherObservers;

    public WeatherSubject() {
        this.weatherObservers = new ArrayList<>();
    }

    public void register(WeatherObserver weatherObserver) {
        this.weatherObservers.add(weatherObserver);
    }

    public void unregister(WeatherObserver weatherObserver) {
        this.weatherObservers.remove(weatherObserver);
    }

    protected abstract void notifyAllObservers();
}

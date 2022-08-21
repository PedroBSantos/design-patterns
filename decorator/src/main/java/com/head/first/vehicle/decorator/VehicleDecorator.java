package com.head.first.vehicle.decorator;

import com.head.first.vehicle.Vehicle;

public abstract class VehicleDecorator extends Vehicle {

    protected Vehicle vehicle;

    @Override
    public String getMake() {
        return vehicle.getMake();
    }

    @Override
    public String getModel() {
        return vehicle.getModel();
    }

    @Override
    public double getPrice() {
        return vehicle.getPrice();
    }
}

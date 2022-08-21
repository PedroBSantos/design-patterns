package com.head.first.vehicle.decorator;

import com.head.first.vehicle.Vehicle;

public class SpecialOffer extends VehicleDecorator {

    private final String offer;
    private double discountPercentage;

    public SpecialOffer(Vehicle vehicle, String offer, double discountPercentage) {
        this.vehicle = vehicle;
        this.offer = offer;
        this.discountPercentage = discountPercentage;
    }

    public String getOffer() {
        return offer;
    }

    @Override
    public double getPrice() {
        var price = super.getPrice();
        var percentage = 100 - discountPercentage;
        return Math.round((price * percentage) / 100);
    }
}

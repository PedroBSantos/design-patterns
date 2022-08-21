package com.head.first.veiculo.factories;

import com.head.first.veiculo.veiculos.bike.*;
import com.head.first.veiculo.veiculos.car.*;
import com.head.first.veiculo.veiculos.scooter.*;

public class HondaVehicleFactory implements VehicleFactory {

    @Override
    public Bike getBike(BikeType type) {
        if (type == BikeType.REGULAR_BIKE) {
            return new RegularBike();
        }
        if (type == BikeType.SPORT_BIKE) {
            return new SportBike();
        }
        throw new RuntimeException("Factory for bike type " + type + " not found");
    }

    @Override
    public Car getCar(CarType type) {
        if (type == CarType.REGULAR_CAR) {
            return new RegularCar();
        }
        if (type == CarType.SPORT_CAR) {
            return new SportCar();
        }
        throw new RuntimeException("Factory for bike type " + type + " not found");
    }

    @Override
    public Scooter getScooter(ScooterType type) {
        if (type == ScooterType.REGULAR_SCOOTER) {
            return new RegularScooter();
        }
        if (type == ScooterType.SCOOTY) {
            return new Scooty();
        }
        throw new RuntimeException("Factory for bike type " + type + " not found");
    }
}

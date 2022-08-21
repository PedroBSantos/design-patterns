package com.head.first.veiculo.factories;

import com.head.first.veiculo.veiculos.bike.Bike;
import com.head.first.veiculo.veiculos.bike.BikeType;
import com.head.first.veiculo.veiculos.car.Car;
import com.head.first.veiculo.veiculos.car.CarType;
import com.head.first.veiculo.veiculos.scooter.Scooter;
import com.head.first.veiculo.veiculos.scooter.ScooterType;

public interface VehicleFactory {
    
    Bike getBike(BikeType type);

    Car getCar(CarType type);

    Scooter getScooter(ScooterType type);
}

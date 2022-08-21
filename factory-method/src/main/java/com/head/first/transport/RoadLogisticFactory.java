package com.head.first.transport;

public class RoadLogisticFactory extends LogisticFactory {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}

package com.head.first.transport;

public class SeaLogisticFactory extends LogisticFactory {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}

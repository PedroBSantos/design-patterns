package com.head.first.transport;

public abstract class LogisticFactory {

    public Transport planDelivere() {
        Transport transport = this.createTransport();
        return transport;
    }

    public abstract Transport createTransport();
}

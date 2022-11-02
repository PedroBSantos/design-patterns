package com.head.first.system;

public abstract class OperationSystem {
    
    protected HardwareSetup setup;

    public void initialize() {
        this.setup.boot();
    }
}

package com.head.first;

public class ConcreteRemoteControl extends RemoteControl {

    private int currentStation;
    
    public ConcreteRemoteControl(TV tv) {
        this.currentStation = 1;
        this.tv = tv;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public void nextChannel() {
        this.setChannel(currentStation + 1);
    }

    public void previousChannel() {
        this.setChannel(currentStation - 1);
    }
}

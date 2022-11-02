package com.head.first;

public abstract class RemoteControl {
    
    protected TV tv;

    public void on() {
        this.tv.on();
    }

    public void off() {
        this.tv.off();
    }

    public void setChannel(int channel) {
        this.tv.tuneChannel(channel);
    }
}

package com.head.first.controle_remoto.dispositivos;

import java.util.logging.Logger;

@SuppressWarnings("unused")
public class TV {

    private final Logger logger;
    private int volume;
    private int actualChannel;

    public TV() {
        this.logger = Logger.getLogger(TV.class.getSimpleName());
        this.volume = 0;
        this.actualChannel = 1;
    }

    public void on() {
        this.logger.info("TV is on");
    }

    public void off() {
        this.logger.info("TV is off");
    }

    public void setInputChannel(int channel) {
        this.actualChannel = channel;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}

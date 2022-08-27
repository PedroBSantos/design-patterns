package com.head.first.controle_remoto.dispositivos;

import java.util.logging.Logger;

public class GarageDoor {

    private Logger logger;

    public GarageDoor() {
        this.logger = Logger.getLogger(GarageDoor.class.getSimpleName());
    }

    public void up() {
        this.logger.info("Openning garage door");
    }

    public void down() {
        this.logger.info("Closing garage door");
    }

    public void stop() {

    }

    public void lightOn() {

    }

    public void lightOff() {

    }
}

package com.head.first.alexa;

import java.util.logging.Logger;

public class PhillipsHueLight implements GenericLight {

    private Logger logger;

    public PhillipsHueLight() {
        this.logger = Logger.getLogger(PhillipsHueLight.class.getSimpleName());
    }

    @Override
    public void on() {
        this.logger.info("PhillipsHueLight on");
    }

    @Override
    public void off() {
        this.logger.info("PhillipsHueLight off");
    }
}

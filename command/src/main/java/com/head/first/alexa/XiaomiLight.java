package com.head.first.alexa;

import java.util.logging.Logger;

public class XiaomiLight implements GenericLight {

    private Logger logger;

    public XiaomiLight() {
        this.logger = Logger.getLogger(XiaomiLight.class.getSimpleName());
    }

    @Override
    public void on() {
        this.logger.info("XiaomiLight on");
    }

    @Override
    public void off() {
        this.logger.info("XiaomiLight off");
    }
}

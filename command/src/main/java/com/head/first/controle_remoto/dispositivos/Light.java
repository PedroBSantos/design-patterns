package com.head.first.controle_remoto.dispositivos;

import java.util.logging.Logger;

public class Light {

    private final String nome;
    private Logger logger;

    public Light(String nome) {
        this.logger = Logger.getLogger(Light.class.getSimpleName());
        this.nome = nome;
    }

    public void on() {
        this.logger.info("Light is on");
    }

    public void off() {
        this.logger.info("Light is off");
    }

    public String getNome() {
        return nome;
    }
}

package com.head.first.controle_remoto.dispositivos;

import java.util.logging.Logger;

public class OutdoorLight {

    private final Logger logger;
    private final String nome;

    public OutdoorLight(String nome) {
        this.nome = nome;
        this.logger = Logger.getLogger(OutdoorLight.class.getSimpleName());
    }

    public void on() {
        this.logger.info("Outdoor light is on");
    }

    public void off() {
        this.logger.info("Outdoor light is off");
    }

    public String getNome() {
        return nome;
    }
}

package com.head.first.controle_remoto.dispositivos;

public class CellingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private int currentSpeed;
    private final String localizacao;

    public CellingFan(String localizacao) {
        this.currentSpeed = OFF;
        this.localizacao = localizacao;
    }

    public void high() {
        this.currentSpeed = HIGH;
    }

    public void medium() {
        this.currentSpeed = MEDIUM;
    }

    public void low() {
        this.currentSpeed = LOW;
    }

    public void off() {
        this.currentSpeed = OFF;
    }

    public int getSpeed() {
        return currentSpeed;
    }

    public String getLocalizacao() {
        return localizacao;
    }
}

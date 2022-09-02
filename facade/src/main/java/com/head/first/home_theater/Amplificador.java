package com.head.first.home_theater;

@SuppressWarnings("unused")
public class Amplificador {
    
    private final Sintonizador sintonizador;
    private CdPlayer cdPlayer;
    private DvdPlayer dvdPlayer;

    public Amplificador(Sintonizador sintonizador) {
        this.sintonizador = sintonizador;
    }

    public void on() {

    }

    public void off() {

    }

    public void setCd(CdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

    public void setDvd(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public void setStereoSound() {
        this.dvdPlayer.setTwoChannelAudio();
    }

    public void setSurroundSound() {
        this.dvdPlayer.setSurroundAudio();
    }

    public void setTuner() {

    }

    public void setVolume(int volume) {

    }
}

package com.head.first.home_theater;

import java.util.logging.Logger;

@SuppressWarnings("unused")
public class HomeTheaterFacade {

    private final Amplificador amplificador;
    private final Sintonizador sintonizador;
    private final DvdPlayer dvdPlayer;
    private final CdPlayer cdPlayer;
    private final Projetor projetor;
    private final LuzAmbiente luzAmbiente;
    private final Tela tela;
    private final MaquinaPipoca maquinaPipoca;
    private final Logger logger;

    public HomeTheaterFacade(Amplificador amplificador,
            Sintonizador sintonizador,
            DvdPlayer dvdPlayer,
            CdPlayer cdPlayer,
            Projetor projetor,
            LuzAmbiente luzAmbiente,
            Tela tela,
            MaquinaPipoca maquinaPipoca) {
        this.amplificador = amplificador;
        this.sintonizador = sintonizador;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projetor = projetor;
        this.luzAmbiente = luzAmbiente;
        this.tela = tela;
        this.maquinaPipoca = maquinaPipoca;
        this.logger = Logger.getLogger(HomeTheaterFacade.class.getSimpleName());
    }

    public void watchMovie(String movie) {
        this.logger.info("Getting ready for watch: " + movie);
        this.maquinaPipoca.on();
        this.maquinaPipoca.pop();
        this.luzAmbiente.dim(10);
        this.tela.down();
        this.projetor.on();
        this.projetor.wideScreenMode();
        this.amplificador.on();
        this.amplificador.setDvd(dvdPlayer);
        this.amplificador.setSurroundSound();
        this.amplificador.setVolume(5);
        this.dvdPlayer.on();
        this.dvdPlayer.play();
    }

    public void endMovie() {
        this.logger.info("Shutting movie theater down");
        this.maquinaPipoca.off();
        this.luzAmbiente.on();
        this.tela.up();
        this.projetor.off();
        this.amplificador.off();
        this.dvdPlayer.stop();
        this.dvdPlayer.eject();
        this.dvdPlayer.off();
    }

    public void listenToCD() {

    }

    public void endCD() {
        this.cdPlayer.stop();
        this.cdPlayer.eject();
        this.cdPlayer.off();
    }

    public void listenToRadio() {

    }

    public void endRadio() {
        this.sintonizador.off();
    }
}

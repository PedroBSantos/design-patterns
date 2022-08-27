package com.head.first.controle_remoto.comandos;

import com.head.first.controle_remoto.dispositivos.Stereo;

public class StereoOnWithCDCommand implements Command {

    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        this.stereo.on();
        this.stereo.setCD();
        this.stereo.setVolume(11);
    }

    @Override
    public void undo() {
        this.stereo.off();        
    }
}

package com.head.first.controle_remoto.comandos;

import com.head.first.controle_remoto.dispositivos.Light;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }

    @Override
    public void undo() {
        this.light.off();        
    }
}

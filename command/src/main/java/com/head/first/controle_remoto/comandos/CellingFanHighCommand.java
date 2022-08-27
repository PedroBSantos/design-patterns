package com.head.first.controle_remoto.comandos;

import com.head.first.controle_remoto.dispositivos.CellingFan;

public class CellingFanHighCommand extends CellingFanCommand {

    public CellingFanHighCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        this.previousSpeed = this.cellingFan.getSpeed();
        this.cellingFan.high();
    }
}

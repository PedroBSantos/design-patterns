package com.head.first.controle_remoto.comandos;

import com.head.first.controle_remoto.dispositivos.CellingFan;

public class CellingFanLowCommand extends CellingFanCommand {

    public CellingFanLowCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        this.previousSpeed = this.cellingFan.getSpeed();
        this.cellingFan.low();
    }
}

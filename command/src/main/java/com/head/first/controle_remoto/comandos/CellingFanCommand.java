package com.head.first.controle_remoto.comandos;

import com.head.first.controle_remoto.dispositivos.CellingFan;

public abstract class CellingFanCommand implements Command {

    protected CellingFan cellingFan;
    protected int previousSpeed;

    @Override
    public abstract void execute();

    @Override
    public final void undo() {
        if (this.previousSpeed == CellingFan.HIGH) {
            this.cellingFan.high();
        }
        if (this.previousSpeed == CellingFan.MEDIUM) {
            this.cellingFan.medium();
        }
        if (this.previousSpeed == CellingFan.LOW) {
            this.cellingFan.low();
        }
        if (this.previousSpeed == CellingFan.OFF) {
            this.cellingFan.off();
        }
    }
}

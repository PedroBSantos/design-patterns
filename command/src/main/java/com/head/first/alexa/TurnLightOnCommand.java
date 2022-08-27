package com.head.first.alexa;

public class TurnLightOnCommand implements Command {

    private GenericLight genericLight;

    public TurnLightOnCommand(GenericLight genericLight) {
        this.genericLight = genericLight;
    }

    @Override
    public void execute() {
        this.genericLight.on();
    }

    @Override
    public void undo() {
        this.genericLight.off();
    }
}

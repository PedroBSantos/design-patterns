package com.head.first.alexa;

public class TurnLightOffCommand implements Command {

    private GenericLight genericLight;

    public TurnLightOffCommand(GenericLight genericLight) {
        this.genericLight = genericLight;
    }

    @Override
    public void execute() {
        this.genericLight.off();
    }

    @Override
    public void undo() {
        this.genericLight.on();
    }
}

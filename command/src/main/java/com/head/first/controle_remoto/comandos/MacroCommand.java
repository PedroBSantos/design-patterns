package com.head.first.controle_remoto.comandos;

public class MacroCommand implements Command {

    private Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (var command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (var command : commands) {
            command.undo();
        }
    }
}

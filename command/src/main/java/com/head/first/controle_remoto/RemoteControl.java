package com.head.first.controle_remoto;

import com.head.first.controle_remoto.comandos.Command;
import com.head.first.controle_remoto.comandos.NoCommand;

public class RemoteControl {

    public static final int SLOTS_NUMBER = 7;
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        this.onCommands = new Command[SLOTS_NUMBER];
        this.offCommands = new Command[SLOTS_NUMBER];
        this.initializeSlots();
    }

    private void initializeSlots() {
        var noCommand = new NoCommand();
        for (int i = 0; i < SLOTS_NUMBER; i++) {
            this.onCommands[i] = noCommand;
            this.offCommands[i] = noCommand;
        }
        this.undoCommand = noCommand;
    }

    private boolean isValidSlot(int slot) {
        if (slot < 0 || slot >= SLOTS_NUMBER) {
            return false;
        }
        return true;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        if (!this.isValidSlot(slot)) {
            throw new RuntimeException("Invalid slot number");
        }
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonPushed(int slot) {
        if (!this.isValidSlot(slot)) {
            throw new RuntimeException("Invalid slot number");
        }
        this.onCommands[slot].execute();
        this.undoCommand = this.onCommands[slot];
    }

    public void offButtonPushed(int slot) {
        if (!this.isValidSlot(slot)) {
            throw new RuntimeException("Invalid slot number");
        }
        this.offCommands[slot].execute();
        this.undoCommand = this.offCommands[slot];
    }

    public void undoButtonPushed() {
        this.undoCommand.undo();
    }
}

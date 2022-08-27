package com.head.first.alexa;

import java.util.Stack;

public class Alexa {

    private Stack<Command> commandsHistory;

    public Alexa() {
        this.commandsHistory = new Stack<>();
    }

    public void sendCommand(Command command) {
        this.commandsHistory.push(command);
        command.execute();
    }
}

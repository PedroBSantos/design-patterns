package com.head.first.chat;

import java.util.logging.Logger;

public class FacebookUser extends User {

    public FacebookUser(String name, FacebookGroupMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public void receive(String message) {
        Logger.getLogger(FacebookUser.class.getSimpleName()).info(message);
    }

    @Override
    public void send(String message) {
        this.mediator.sendMessage(message, this);
    }
}

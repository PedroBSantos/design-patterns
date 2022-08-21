package com.head.first.notifier;

import java.util.logging.Logger;

public class FacebookNotifierDecorator extends NotifierDecorator {

    public FacebookNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        this.sendFacebookNotification(message);
    }

    public void sendFacebookNotification(String message) {
        Logger.getGlobal().info("Sending Facebook notification");
    }
}

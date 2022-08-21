package com.head.first.notifier;

import java.util.logging.Logger;

public class SMSNotifierDecorator extends NotifierDecorator {

    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        this.sendSMSNotification(message);
    }

    public void sendSMSNotification(String message) {
        Logger.getGlobal().info("Sending SMS notification");
    }
}

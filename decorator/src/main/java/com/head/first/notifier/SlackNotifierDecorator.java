package com.head.first.notifier;

import java.util.logging.Logger;

public class SlackNotifierDecorator extends NotifierDecorator {

    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        this.sendSlackNotification(message);
    }

    public void sendSlackNotification(String message) {
        Logger.getGlobal().info("Sending Slack notification");
    }
}

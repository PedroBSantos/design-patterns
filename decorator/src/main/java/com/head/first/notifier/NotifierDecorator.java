package com.head.first.notifier;

public class NotifierDecorator extends Notifier {

    private Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    public void send(String message) {
        this.notifier.send(message);
    }
}

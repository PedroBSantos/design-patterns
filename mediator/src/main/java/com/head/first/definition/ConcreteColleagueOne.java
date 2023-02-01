package com.head.first.definition;

import java.util.logging.Logger;

@SuppressWarnings("unused")
public class ConcreteColleagueOne implements Colleague {

    private Mediator mediator;
    private Logger logger;

    public ConcreteColleagueOne(Mediator mediator) {
        this.logger = Logger.getLogger(ConcreteColleagueOne.class.getSimpleName());
        this.mediator = mediator;
    }

    @Override
    public void receive(Message message) {
        if (message instanceof ConcreteColleagueOneMessage) {
            this.logger.info("Message received");
        }
    }
}

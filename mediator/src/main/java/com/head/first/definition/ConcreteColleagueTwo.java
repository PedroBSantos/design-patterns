package com.head.first.definition;

import java.util.logging.Logger;

@SuppressWarnings("unused")
public class ConcreteColleagueTwo implements Colleague {

    private Mediator mediator;
    private Logger logger;

    public ConcreteColleagueTwo(Mediator mediator) {
        this.logger = Logger.getLogger(ConcreteColleagueTwo.class.getSimpleName());
        this.mediator = mediator;
    }

    @Override
    public void receive(Message message) {
        if (message instanceof ConcreteColleagueTwoMessage) {
            this.logger.info("Message received");
        }
    }
}

package com.head.first;

import java.util.logging.Logger;

import com.head.first.decorator.QuackCounterDecorator;
import com.head.first.duck.Quackable;
import com.head.first.goose.Goose;
import com.head.first.goose.GooseAdapter;

public class DuckSimulator {
    
    public void simulate(DuckAbstractFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redHeadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable goose = new GooseAdapter(new Goose());
        var flock = new Flock();
        flock.add(mallardDuck);
        flock.add(redHeadDuck);
        flock.add(duckCall);
        flock.add(rubberDuck);
        flock.add(goose);
        var quackologist = new Quackologist();
        flock.addQuackObserver(quackologist);
        this.simulate(flock);
        Logger.getGlobal().info("Quacks: " + QuackCounterDecorator.getQuackCounter());
    }

    public void simulate(Quackable quackable) {
        quackable.quack();
    }
}

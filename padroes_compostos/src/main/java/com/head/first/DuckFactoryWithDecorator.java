package com.head.first;

import com.head.first.decorator.QuackCounterDecorator;
import com.head.first.duck.DuckCall;
import com.head.first.duck.MallardDuck;
import com.head.first.duck.Quackable;
import com.head.first.duck.RedheadDuck;
import com.head.first.duck.RubberDuck;
import com.head.first.goose.Goose;
import com.head.first.goose.GooseAdapter;

public class DuckFactoryWithDecorator implements DuckAbstractFactory {

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounterDecorator(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounterDecorator(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounterDecorator(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounterDecorator(new RubberDuck());
    }

    @Override
    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }
}

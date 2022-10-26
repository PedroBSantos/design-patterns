package com.head.first;

import com.head.first.duck.*;
import com.head.first.goose.Goose;
import com.head.first.goose.GooseAdapter;

public class DuckFactory implements DuckAbstractFactory {

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

    @Override
    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }
}

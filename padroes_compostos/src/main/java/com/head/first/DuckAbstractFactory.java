package com.head.first;

import com.head.first.duck.Quackable;

public interface DuckAbstractFactory {
    
    Quackable createMallardDuck();

    Quackable createRedheadDuck();

    Quackable createDuckCall();

    Quackable createRubberDuck();

    Quackable createGoose();
}

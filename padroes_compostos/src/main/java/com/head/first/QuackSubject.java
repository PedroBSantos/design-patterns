package com.head.first;

public interface QuackSubject {

    void addQuackObserver(QuackObserver quackObserver);

    void notifyObservers();
}

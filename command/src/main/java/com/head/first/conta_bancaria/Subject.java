package com.head.first.conta_bancaria;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject<T> {

    protected List<Observer<T>> observers;

    protected Subject() {
        this.observers = new ArrayList<Observer<T>>();
    }

    protected final void attach(Observer<T> observer) {
        this.observers.add(observer);
    }

    protected final void dettach(Observer<T> observer) {
        this.observers.remove(observer);
    }

    protected abstract void notifyObservers();
}

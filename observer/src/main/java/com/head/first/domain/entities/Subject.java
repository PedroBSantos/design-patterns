package com.head.first.domain.entities;

import java.util.HashSet;
import java.util.Set;

public abstract class Subject<T> {

    private Set<Observer<T>> observers;

    protected Subject() {
        this.observers = new HashSet<Observer<T>>();
    }

    public boolean attach(Observer<T> observer) {
        return this.observers.add(observer);
    }

    public void dettach(Observer<T> observer) {
        this.observers.remove(observer);
    }

    public final void notifyObservers(T value) {
        this.observers.stream().forEach(observer -> observer.update(value));
    }
}

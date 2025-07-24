package org.example.observer.library;

import java.util.HashSet;
import java.util.Set;

public abstract class Observable {
    private Set<Observer> observers;

    public Observable() {
        this.observers = new HashSet<Observer>();
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    protected void notifyDependents() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}

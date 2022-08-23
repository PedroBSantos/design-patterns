package com.head.first.chocolate;

public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;
    private static volatile ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        this.empty = true;
        this.boiled = false;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public void fill() {
        if (empty) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!empty && boiled) {
            empty = true;
        }
    }

    public void boil() {
        if (!empty && !boiled) {
            boiled = true;
        }
    }

    public static ChocolateBoiler getInstance() {
        if (ChocolateBoiler.uniqueInstance == null) {
            synchronized (ChocolateBoiler.class) {
                if (ChocolateBoiler.uniqueInstance == null) {
                    ChocolateBoiler.uniqueInstance = new ChocolateBoiler();
                }
            }
        }
        return ChocolateBoiler.uniqueInstance;
    }
}

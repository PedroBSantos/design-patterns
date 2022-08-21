package com.head.first.after;

import com.head.first.after.behaivors.QuackBehaivor;

public class DuckDevice {
    
    private QuackBehaivor quackBehaivor;

    public DuckDevice(QuackBehaivor quackBehaivor) {
        this.quackBehaivor = quackBehaivor;
    }

    public QuackBehaivor getQuackBehaivor() {
        return quackBehaivor;
    }

    public void setQuackBehaivor(QuackBehaivor quackBehaivor) {
        this.quackBehaivor = quackBehaivor;
    }

    public void performQuack() {
        this.quackBehaivor.quack();
    }
}

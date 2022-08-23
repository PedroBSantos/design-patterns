package com.head.first.chocolate;

import java.util.concurrent.Callable;

public class ChocolateBoilerCallable implements Callable<ChocolateBoiler> {

    @Override
    public ChocolateBoiler call() throws Exception {
        return ChocolateBoiler.getInstance();
    }
}

package com.head.first;

public class App {
    
    public static void main(String[] args) {
        var duckSimulator = new DuckSimulator();
        DuckAbstractFactory duckFactory = new DuckFactoryWithDecorator();
        duckSimulator.simulate(duckFactory);
    }
}

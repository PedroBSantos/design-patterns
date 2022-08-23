package com.head.first.chocolate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ChocolateBoilerSingletonTest {

    @Test
    @DisplayName("Deveria ser a mesma referencia retornada em ambas as threads")
    public void test1() throws InterruptedException, ExecutionException {
        var threadPool = Executors.newFixedThreadPool(3);
        var singleton1 = threadPool.submit(new ChocolateBoilerCallable());
        var singleton2 = threadPool.submit(new ChocolateBoilerCallable());
        assertEquals(singleton1.get(), singleton2.get());
    }
}

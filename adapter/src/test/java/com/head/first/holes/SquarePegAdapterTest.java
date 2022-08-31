package com.head.first.holes;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SquarePegAdapterTest {
    
    @Test
    @DisplayName("Deveria ser possível encaixar em um circulo de raio 3.6")
    public void test1() {
        var roundHole = new RoundHole(3.6);
        var squaredPegAdapter = new SquarePegAdapter(new SquarePeg(5.0));
        assertTrue(roundHole.fits(squaredPegAdapter));
    }

    @Test
    @DisplayName("Não deveria ser possível encaixar em um circulo de raio 3.0")
    public void test2() {
        var roundHole = new RoundHole(3.0);
        var squaredPegAdapter = new SquarePegAdapter(new SquarePeg(5.0));
        assertFalse(roundHole.fits(squaredPegAdapter));
    }
}

package com.head.first.maquina_gomas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EntregarUmaGomaTest {
    
    @Test
    @DisplayName("Deveria diminuir o contador de gomas em 1")
    public void test1() {
        var maquinaGomas = new MaquinaGoma(10);
        assertEquals(10, maquinaGomas.getContadorGomas());
        maquinaGomas.inserirMoeda();
        maquinaGomas.acionarAlavanca();
        assertEquals(9, maquinaGomas.getContadorGomas());
    }
}

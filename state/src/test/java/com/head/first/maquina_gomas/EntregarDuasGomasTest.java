package com.head.first.maquina_gomas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EntregarDuasGomasTest {
    
    @Test
    @DisplayName("Sempre que o número de vezes em que a alavanca" + 
        " foi acionada for múltiplo de 10, o contador de gomas deve ser diminuido em 2 se possível")
    public void test1() {
        var maquinaGomas = new MaquinaGoma(11);
        int contadorGomasAntes = 0;
        int contadorGomasDepois = 0;
        for (int i = 1; i <= 10; i++) {
            maquinaGomas.inserirMoeda();
            contadorGomasAntes = maquinaGomas.getContadorGomas();
            maquinaGomas.acionarAlavanca();
            contadorGomasDepois = maquinaGomas.getContadorGomas();
            if (i == 10) {
                assertEquals(contadorGomasAntes - 2, contadorGomasDepois);
            }
        }
    }

    @Test
    @DisplayName("Deveria lançar uma exceção ao tentar inserir uma moeda quando no estado EntregarDuasGomas")
    public void test2() {
        var maquinaGomas = new MaquinaGoma(10);
        for (int i = 1; i <= 10; i++) {
            maquinaGomas.inserirMoeda();
            if (i != 10) {
                maquinaGomas.acionarAlavanca();
                continue;
            }
            var exception = assertThrows(UnsupportedOperationException.class, () -> maquinaGomas.inserirMoeda());
            assertEquals("A moeda já foi inserida", exception.getMessage());
        }
    }
}

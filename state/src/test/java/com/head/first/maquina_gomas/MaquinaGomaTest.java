package com.head.first.maquina_gomas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MaquinaGomaTest {

    @Test
    @DisplayName("Deveria começar no estado GomasAcabaram ao inicializar com contadorGomas = 0")
    public void test1() {
        var maquinaGomas = new MaquinaGoma(0);
        assertEquals(0, maquinaGomas.getContadorGomas());
        assertEquals(0, maquinaGomas.getVezesAlavancaAcionada());
        assertInstanceOf(GomasAcabaram.class, maquinaGomas.getEstadoAtual());
    }

    @Test
    @DisplayName("Deveria começar no estado SemMoeda ao inicializar com contadorGomas > 0")
    public void test2() {
        var maquinaGomas = new MaquinaGoma(5);
        assertEquals(5, maquinaGomas.getContadorGomas());
        assertEquals(0, maquinaGomas.getVezesAlavancaAcionada());
        assertInstanceOf(SemMoeda.class, maquinaGomas.getEstadoAtual());
    }

    @Test
    @DisplayName("Deveria reabastecer a máquina de gomas e alterar o seu estado de GomasAcabaram para SemMoeda")
    public void test3() {
        var maquinaGomas = new MaquinaGoma(0);
        assertEquals(0, maquinaGomas.getContadorGomas());
        assertInstanceOf(GomasAcabaram.class, maquinaGomas.getEstadoAtual());
        maquinaGomas.reabastecer(2);
        assertEquals(2, maquinaGomas.getContadorGomas());
        assertInstanceOf(SemMoeda.class, maquinaGomas.getEstadoAtual());
    }
}

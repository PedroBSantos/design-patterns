package com.head.first.socorro;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.head.first.socorro.factories.SocorroFactory;
import com.head.first.socorro.model.*;

public class SocorroFactoryTest {

    @Test
    @DisplayName("Deveria criar o guincho de pequeno porte para um veículo de pequeno porte")
    public void test1() {
        var socorroFactory = SocorroFactory.getInstance(PorteVeiculo.PEQUENO);
        var veiculo = socorroFactory.criarCVeiculo("celta");
        var guincho = socorroFactory.criarGuincho();
        assertInstanceOf(VeiculoPequenoPorte.class, veiculo);
        assertInstanceOf(GuinchoVeiculoPequenoPorte.class, guincho);
    }

    @Test
    @DisplayName("Deveria criar o guincho de pequeno porte para um veículo de meio porte")
    public void test2() {
        var socorroFactory = SocorroFactory.getInstance(PorteVeiculo.MEDIO);
        var veiculo = socorroFactory.criarCVeiculo("jetta");
        var guincho = socorroFactory.criarGuincho();
        assertInstanceOf(VeiculoMedioPorte.class, veiculo);
        assertInstanceOf(GuinchoVeiculoMedioPorte.class, guincho);
    }

    @Test
    @DisplayName("Deveria criar o guincho de pequeno porte para um veículo de grande porte")
    public void test3() {
        var socorroFactory = SocorroFactory.getInstance(PorteVeiculo.GRANDE);
        var veiculo = socorroFactory.criarCVeiculo("bmw v6");
        var guincho = socorroFactory.criarGuincho();
        assertInstanceOf(VeiculoGrandePorte.class, veiculo);
        assertInstanceOf(GuinchoVeiculoGrandePorte.class, guincho);
    }
}

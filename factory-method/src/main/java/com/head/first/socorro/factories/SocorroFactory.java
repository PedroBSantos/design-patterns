package com.head.first.socorro.factories;

import com.head.first.socorro.model.Guincho;
import com.head.first.socorro.model.PorteVeiculo;
import com.head.first.socorro.model.Veiculo;

public abstract class SocorroFactory {

    public abstract Veiculo criarCVeiculo(String modelo);

    public abstract Guincho criarGuincho();

    public static SocorroFactory getInstance(PorteVeiculo porteVeiculo) {
        if (porteVeiculo == PorteVeiculo.PEQUENO) {
            return new SocorroPequenoPorteFactory();
        }
        if (porteVeiculo == PorteVeiculo.MEDIO) {
            return new SocorroMedioPorteFactory();
        }
        if (porteVeiculo == PorteVeiculo.GRANDE) {
            return new SocorroGrandePorteFactory();
        }
        throw new RuntimeException("Não foi possível instanciar a factory para o porte " + porteVeiculo);
    }
}

package com.head.first.socorro.factories;

import com.head.first.socorro.model.Guincho;
import com.head.first.socorro.model.GuinchoVeiculoGrandePorte;
import com.head.first.socorro.model.Veiculo;
import com.head.first.socorro.model.VeiculoGrandePorte;

public class SocorroGrandePorteFactory extends SocorroFactory {

    @Override
    public Veiculo criarCVeiculo(String modelo) {
        return new VeiculoGrandePorte(modelo);
    }

    @Override
    public Guincho criarGuincho() {
        return new GuinchoVeiculoGrandePorte();
    }
}

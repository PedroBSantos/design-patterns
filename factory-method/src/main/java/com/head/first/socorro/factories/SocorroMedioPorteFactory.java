package com.head.first.socorro.factories;

import com.head.first.socorro.model.Guincho;
import com.head.first.socorro.model.GuinchoVeiculoMedioPorte;
import com.head.first.socorro.model.Veiculo;
import com.head.first.socorro.model.VeiculoMedioPorte;

public class SocorroMedioPorteFactory extends SocorroFactory {

    @Override
    public Veiculo criarCVeiculo(String modelo) {
        return new VeiculoMedioPorte(modelo);
    }

    @Override
    public Guincho criarGuincho() {
        return new GuinchoVeiculoMedioPorte();
    }
}

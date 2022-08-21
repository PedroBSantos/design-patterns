package com.head.first.socorro.factories;

import com.head.first.socorro.model.Guincho;
import com.head.first.socorro.model.GuinchoVeiculoPequenoPorte;
import com.head.first.socorro.model.Veiculo;
import com.head.first.socorro.model.VeiculoPequenoPorte;

public class SocorroPequenoPorteFactory extends SocorroFactory {

    @Override
    public Veiculo criarCVeiculo(String modelo) {
        return new VeiculoPequenoPorte(modelo);
    }

    @Override
    public Guincho criarGuincho() {
        return new GuinchoVeiculoPequenoPorte();
    }
}

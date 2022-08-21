package com.head.first.socorro.model;

public abstract class Veiculo {
    
    protected String modelo;
    protected PorteVeiculo porteVeiculo;

    public final String getModelo() {
        return modelo;
    }

    public final PorteVeiculo getPorteVeiculo() {
        return porteVeiculo;
    }
}

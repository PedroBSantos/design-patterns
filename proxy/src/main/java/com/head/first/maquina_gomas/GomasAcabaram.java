package com.head.first.maquina_gomas;

public class GomasAcabaram implements MaquinaGomaState {

    @Override
    public MaquinaGomaState inserirMoeda() {
        throw new UnsupportedOperationException("A máquina de gomas está sem gomas");
    }

    @Override
    public MaquinaGomaState ejetarMoeda() {
        throw new UnsupportedOperationException("A máquina de gomas está sem gomas");
    }

    @Override
    public MaquinaGomaState acionarAlavanca() {
        throw new UnsupportedOperationException("A máquina de gomas está sem gomas");
    }

    @Override
    public MaquinaGomaState entregarGoma() {
        throw new UnsupportedOperationException("A máquina de gomas está sem gomas");
    }

    @Override
    public String toString() {
        return "Sem gomas";
    }
}

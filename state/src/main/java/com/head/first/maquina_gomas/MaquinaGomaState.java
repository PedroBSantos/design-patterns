package com.head.first.maquina_gomas;

public interface MaquinaGomaState {

    MaquinaGomaState inserirMoeda();

    MaquinaGomaState ejetarMoeda();

    MaquinaGomaState acionarAlavanca();

    MaquinaGomaState entregarGoma();

}

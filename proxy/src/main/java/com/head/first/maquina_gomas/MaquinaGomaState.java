package com.head.first.maquina_gomas;

import java.io.Serializable;

public interface MaquinaGomaState extends Serializable {

    MaquinaGomaState inserirMoeda();

    MaquinaGomaState ejetarMoeda();

    MaquinaGomaState acionarAlavanca();

    MaquinaGomaState entregarGoma();

}

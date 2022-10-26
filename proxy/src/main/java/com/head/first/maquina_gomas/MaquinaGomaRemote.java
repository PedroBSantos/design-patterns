package com.head.first.maquina_gomas;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MaquinaGomaRemote extends Remote {

    String getLocalizacao() throws RemoteException;

    int getContadorGomas() throws RemoteException;

    MaquinaGomaState getEstadoAtual() throws RemoteException;
}

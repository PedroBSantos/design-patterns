package com.head.first.maquina_gomas;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {

    public static void main(String[] args) {
        try {
            var maquinaGomas = new MaquinaGoma(10, "Aracaju");
            LocateRegistry.createRegistry(1900);
            Naming.bind("rmi://localhost:1900/maquina_goma/report", maquinaGomas);
        } catch (RemoteException | MalformedURLException | AlreadyBoundException e) {
            e.printStackTrace();
        }
    }
}

package com.head.first.maquina_gomas;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Logger;

public class Client {
    
    public static void main(String[] args) {
        try {
            var maquinaGomaReportService = (MaquinaGomaRemote) Naming.lookup("rmi://localhost:1900/maquina_goma/report");
            var maquinaGomaMonitor = new MaquinaGomaMonitor(maquinaGomaReportService);
            System.out.println(maquinaGomaMonitor.report());
        } catch (MalformedURLException | RemoteException | NotBoundException exception) {
            Logger.getGlobal().severe(exception.getMessage());
        }
    }
}

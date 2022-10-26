package com.head.first.maquina_gomas;

import java.rmi.RemoteException;
import java.util.logging.Logger;

public class MaquinaGomaMonitor {

    private MaquinaGomaRemote reportavel;

    public MaquinaGomaMonitor(MaquinaGomaRemote reportavel) {
        this.reportavel = reportavel;
    }

    public String report() {
        try {
            var report = new StringBuilder();
            report.append("\nLocalização: ").append(this.reportavel.getLocalizacao())
                .append("\nQuantidade de gomas: ").append(this.reportavel.getContadorGomas())
                .append("\nEstado atual: ").append(this.reportavel.getEstadoAtual());
            return report.toString();
        } catch (RemoteException exception) {
            Logger.getGlobal().severe(exception.getMessage());
        }
        return "Unable to connect";
    }
}

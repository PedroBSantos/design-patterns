package com.head.first.maquina_gomas;

public class MaquinaGoma {

    private int contadorGomas;
    private int vezesAlavancaAcionada;
    private MaquinaGomaState estadoAtual;

    public MaquinaGoma(int contadorGomas) {
        this.contadorGomas = contadorGomas;
        this.vezesAlavancaAcionada = 0;
        if (this.contadorGomas > 0) {
            this.estadoAtual = new SemMoeda(this);
            return;
        }
        this.estadoAtual = new GomasAcabaram();
    }

    public MaquinaGomaState getEstadoAtual() {
        return estadoAtual;
    }

    public int getContadorGomas() {
        return contadorGomas;
    }

    public void reabastecer(int contadorGomas) {
        if (contadorGomas <= 0) {
            return;
        }
        this.contadorGomas += contadorGomas;
        if (this.estadoAtual instanceof GomasAcabaram) {
            this.estadoAtual = new SemMoeda(this);
        }
    }

    void liberarGoma() {
        if (this.contadorGomas == 0) {
            return;
        }
        this.contadorGomas--;
    }

    void aumentarVezesAlavancaAcionada() {
        this.vezesAlavancaAcionada++;
    }

    public int getVezesAlavancaAcionada() {
        return vezesAlavancaAcionada;
    }

    public void inserirMoeda() {
        this.estadoAtual = this.estadoAtual.inserirMoeda();
    }

    public void ejetarMoeda() {
        this.estadoAtual = this.estadoAtual.ejetarMoeda();
    }

    public void acionarAlavanca() {
        this.estadoAtual = this.estadoAtual.acionarAlavanca();
        this.estadoAtual = this.estadoAtual.entregarGoma();
    }
}

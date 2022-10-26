package com.head.first.maquina_gomas;

public class EntregarUmaGoma implements MaquinaGomaState {
    
    private transient MaquinaGoma maquinaGomaMascar;

    public EntregarUmaGoma(MaquinaGoma maquinaGomaMascar) {
        this.maquinaGomaMascar = maquinaGomaMascar;
    }

    @Override
    public MaquinaGomaState entregarGoma() {
        this.maquinaGomaMascar.liberarGoma();
        if (this.maquinaGomaMascar.getContadorGomas() > 0) {
            return new SemMoeda(this.maquinaGomaMascar);
        }
        return new GomasAcabaram();
    }

    @Override
    public MaquinaGomaState inserirMoeda() {
        throw new UnsupportedOperationException("A alavanca já foi acionada.");
    }

    @Override
    public MaquinaGomaState ejetarMoeda() {
        throw new UnsupportedOperationException("A alavanca já foi acionada.");
    }

    @Override
    public MaquinaGomaState acionarAlavanca() {
        throw new UnsupportedOperationException("A alavanca já foi acionada.");
    }

    @Override
    public String toString() {
        return "Entregar uma goma";
    }
}

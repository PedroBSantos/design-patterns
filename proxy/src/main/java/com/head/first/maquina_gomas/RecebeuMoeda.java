package com.head.first.maquina_gomas;

public class RecebeuMoeda implements MaquinaGomaState {

    private transient MaquinaGoma maquinaGomaMascar;

    public RecebeuMoeda(MaquinaGoma maquinaGomaMascar) {
        this.maquinaGomaMascar = maquinaGomaMascar;
    }

    @Override
    public MaquinaGomaState ejetarMoeda() {
        return new SemMoeda(this.maquinaGomaMascar);
    }

    @Override
    public MaquinaGomaState acionarAlavanca() {
        this.maquinaGomaMascar.aumentarVezesAlavancaAcionada();
        if (this.maquinaGomaMascar.getVezesAlavancaAcionada() % 10 == 0) {
            return new EntregarDuasGomas(this.maquinaGomaMascar);
        }
        return new EntregarUmaGoma(this.maquinaGomaMascar);
    }

    @Override
    public MaquinaGomaState inserirMoeda() {
        throw new UnsupportedOperationException("A moeda já foi inserida");
    }

    @Override
    public MaquinaGomaState entregarGoma() {
        throw new UnsupportedOperationException("Antes é preciso acionar a alavanca");
    }

    @Override
    public String toString() {
        return "Moeda inserida";
    }
}

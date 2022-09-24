package com.head.first.maquina_gomas;

public class SemMoeda implements MaquinaGomaState {
    
    private MaquinaGoma maquinaGomaMascar;

    public SemMoeda(MaquinaGoma maquinaGomaMascar) {
        this.maquinaGomaMascar = maquinaGomaMascar;
    }

    @Override
    public MaquinaGomaState inserirMoeda() {
        return new RecebeuMoeda(this.maquinaGomaMascar);
    }

    @Override
    public MaquinaGomaState ejetarMoeda() {
        throw new UnsupportedOperationException("É necessário inserir uma moeda para ejeta-la");
    }

    @Override
    public MaquinaGomaState acionarAlavanca() {
        throw new UnsupportedOperationException("Antes de acionar a alavanca é preciso inserir uma moeda");
    }

    @Override
    public MaquinaGomaState entregarGoma() {
        throw new UnsupportedOperationException("Alavanca não foi acionada");
    }
}

package com.head.first.restaurante;

public class XBaconPedidoCommand implements PedidoCommand {

    private final Cozinheiro cozinheiro;
    private final int qtdHamburgers;
    private final boolean colocarSalada;
    private final boolean baconAoPonto;

    public XBaconPedidoCommand(Cozinheiro cozinheiro, int qtdHamburgers, boolean colocarSalada, boolean baconAoPonto) {
        this.qtdHamburgers = qtdHamburgers;
        this.colocarSalada = colocarSalada;
        this.baconAoPonto = baconAoPonto;
        this.cozinheiro = cozinheiro;
    }

    public int getQtdHamburgers() {
        return qtdHamburgers;
    }

    public boolean isColocarSalada() {
        return colocarSalada;
    }

    public boolean isBaconAoPonto() {
        return baconAoPonto;
    }

    @Override
    public void execute() {
        this.cozinheiro.prepararXBacon(this.qtdHamburgers, this.colocarSalada, this.baconAoPonto);
    }
}

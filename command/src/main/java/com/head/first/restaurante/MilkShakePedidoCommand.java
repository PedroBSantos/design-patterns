package com.head.first.restaurante;

public class MilkShakePedidoCommand implements PedidoCommand {

    private final Cozinheiro cozinheiro;
    private final String tamanho;
    private final String sabor;

    public MilkShakePedidoCommand(Cozinheiro cozinheiro, String tamanho, String sabor) {
        this.cozinheiro = cozinheiro;
        this.tamanho = tamanho;
        this.sabor = sabor;
    }

    @Override
    public void execute() {
        this.cozinheiro.prepararMilkShake(this.tamanho, this.sabor);
    }
}

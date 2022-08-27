package com.head.first.restaurante;

import java.util.logging.Logger;

public class Cozinheiro {

    private final String nome;
    private final Logger logger;

    public Cozinheiro(String nome) {
        this.nome = nome;
        this.logger = Logger.getLogger(Cozinheiro.class.getSimpleName());
    }

    public String getNome() {
        return nome;
    }

    public void prepararXBacon(int qtdHamburgers, boolean colocarSalada, boolean baconAoPonto) {
        this.logger.info("\nPeparando XBacon:\nQuantidade de hamburgers: " + qtdHamburgers
                + "\nDevo colocar salada: " + colocarSalada
                + "\nO bacon é ao ponto: " + baconAoPonto);
    }

    public void prepararMilkShake(String tamanho, String sabor) {
        this.logger.info("\nPreparando milk shake:\nSabor: " + sabor + "\nTamanho: " + tamanho);
    }
}

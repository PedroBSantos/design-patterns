package com.design.patterns.handlers;

import java.time.LocalDateTime;

import com.design.patterns.commands.GerarPedidoCommand;
import com.design.patterns.entities.Orcamento;
import com.design.patterns.entities.Pedido;
import com.design.patterns.repositories.PedidoRepository;
import com.design.patterns.services.EnviarEmailService;

public class GerarPedidoHandler {

    private EnviarEmailService enviarEmailService;
    private PedidoRepository pedidoRepository;

    public GerarPedidoHandler(EnviarEmailService enviarEmailService, PedidoRepository pedidoRepository) {
        this.enviarEmailService = enviarEmailService;
        this.pedidoRepository = pedidoRepository;
    }

    public void executar(GerarPedidoCommand command) {
        var orcamento = new Orcamento(command.getValorOrcamento(), command.getQtdItens());
        var pedido = new Pedido(command.getCliente(), LocalDateTime.now(), orcamento);
        this.pedidoRepository.criar(pedido);
        this.enviarEmailService.enviar("cliente@email.com", "email text");
    }
}

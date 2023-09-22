package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDedados;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    //construtor com injecao de dependencias: repository,service, etc.
    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public  void execute(GeraPedido dados){
        //Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

        //Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

       // acoes.forEach(a -> a.executarAcao(pedido));
    };
}

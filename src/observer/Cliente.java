package observer;

import java.util.ArrayList;
import java.util.List;

public class Cliente implements Observer {
    private String nome;
    private List<String> notificacoes;

    public Cliente(String nome) {
        this.nome = nome;
        notificacoes = new ArrayList<>();
    }

    @Override
    public void update(String produto) {
        String mensagem = "Produto em promoção: " + produto;
        notificacoes.add(mensagem);
        System.out.println(nome + " foi notificado: " + mensagem);
    }
}

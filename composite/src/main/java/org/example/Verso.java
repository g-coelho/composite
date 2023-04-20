package org.example;

public class Verso extends Conteudo {

    public Verso(String descricao) {
        super(descricao);
    }

    @Override
    public String getConteudo() {
        return this.getDescricao();
    }
}

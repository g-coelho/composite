package org.example;

import java.util.ArrayList;
import java.util.List;

public class Estrofe extends Conteudo{

    private List<Verso> versos;

    public Estrofe(String descricao) {
        super(descricao);
        this.versos = new ArrayList<Verso>();
    }

    public void addVersos(Verso verso) {
        this.versos.add(verso);
    }


    @Override
    public String getConteudo() {
        String saida = "";
        saida = "Estrofe: " + this.getDescricao() + "\n";
        for (Verso verso : versos) {
            saida += verso.getConteudo();
        }
        return saida;
    }
}

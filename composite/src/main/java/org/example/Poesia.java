package org.example;

public class Poesia {
    private Conteudo versos;

    public void setVerso(Conteudo versos) {
        this.versos = versos;
    }

    public String getVersos() {
        if (this.versos == null) {
            throw new NullPointerException("Poesia sem versos");
        }
        return this.versos.getConteudo();
    }
}
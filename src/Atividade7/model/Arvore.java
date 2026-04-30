package Atividade7.model;

public class Arvore {

    private String tipo;

    public Arvore(String tipo) {
        this.tipo = tipo;
    }

    public String fornecerSombra() {
        return "A árvore está fornecendo sombra.";
    }

    public String darFruto() {
        return "A árvore deu um fruto.";
    }
}
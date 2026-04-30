package Atividade7.model;

public class Carro {

    private String modelo;
    private boolean ligado;
    private boolean emMovimento;

    public Carro(String modelo) {
        this.modelo = modelo;
        this.ligado = false;
        this.emMovimento = false;
    }

    public String ligar() {
        ligado = true;
        return "Carro ligado!";
    }

    public String movimentar() {
        if (ligado) {
            emMovimento = true;
            return "Carro em movimento!";
        }
        return "O carro precisa estar ligado.";
    }

    public String estacionar(Arvore arvore) {
        if (!emMovimento) {
            return arvore.fornecerSombra() + "\nCarro estacionado na sombra da árvore.";
        }
        return "Pare o carro antes de estacionar.";
    }

    public void parar() {
        emMovimento = false;
    }
}
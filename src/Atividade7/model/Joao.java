package Atividade7.model;

public class Joao {

    private String nome;

    public Joao(String nome) {
        this.nome = nome;
    }

    public String ler(Arvore arvore) {
        return nome + " está lendo embaixo da árvore.";
    }

    public String comerFruto(Arvore arvore) {
        return arvore.darFruto() + "\n" + nome + " está comendo um fruto da árvore.";
    }

    public String dirigir(Carro carro) {
        return carro.ligar() + "\n" +
                carro.movimentar() + "\n" +
                nome + " está dirigindo o carro.";
    }
}
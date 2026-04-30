package Atividade7.controller;

import Atividade7.model.*;
import Atividade7.view.SimulacaoView;

public class SimulacaoController {

    public static void main(String[] args) {

        SimulacaoView view = new SimulacaoView();

        Joao joao = new Joao("João");
        Carro carro = new Carro("Corolla");
        Arvore arvore = new Arvore("Goiabeira");
        Casa casa = new Casa("Rua da mãe Joana");

        view.mostrar(casa.abrirPorta());
        view.mostrar(casa.acenderLuz());
        view.mostrar(casa.sairDeCasa());

        view.mostrar("");

        view.mostrar(joao.dirigir(carro));

        view.mostrar("");

        carro.parar();

        view.mostrar(carro.estacionar(arvore));

        view.mostrar(joao.ler(arvore));
        view.mostrar(joao.comerFruto(arvore));
    }
}
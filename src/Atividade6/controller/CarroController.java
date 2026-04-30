package Atividade6.controller;

import Atividade6.model.Carro;
import Atividade6.view.CarroView;

public class CarroController {

    public static void main(String[] args) {

        Carro carro = new Carro("Corolla", 20, 120000);
        CarroView view = new CarroView();

        view.exibirDados(carro.getMarca(), carro.getCodigoCor(), carro.getPreco());

        if (carro.podeBuzinar()) {
            view.mostrarMensagem("BIP BIP!");
        } else {
            view.mostrarMensagem("O carro precisa estar em movimento para buzinar.");
        }

        if (carro.movimentar()) {
            view.mostrarMensagem("Carro em movimento!");
        } else {
            view.mostrarMensagem("O carro precisa estar ligado para se movimentar.");
        }

        carro.ligar();
        view.mostrarMensagem("Carro ligado!");

        if (carro.movimentar()) {
            view.mostrarMensagem("Carro em movimento!");
        }

        // Buzinar
        if (carro.podeBuzinar()) {
            view.mostrarMensagem("BIP BIP!");
        }
    }
}
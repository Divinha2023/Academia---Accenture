package Atividade5.controller;

import Atividade5.model.Dog;
import Atividade5.model.Gato;

public class PrincipalAnimais {

    public static void main(String[] args) {

        Gato gato = new Gato("Zaya", 5);
        Dog dog = new Dog("Ponguinha", 7);

        gato.emitirSom();
        dog.emitirSom();
    }
}

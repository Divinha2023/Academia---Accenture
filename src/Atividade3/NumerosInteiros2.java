package Atividade3;

//package sef.module3.activity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NumerosInteiros2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //iniciando variaveis:
        int saoPares = 0;
        ArrayList<Integer> numerosPares = new ArrayList<>();

        //lendo a Quantidade de entrada:
        System.out.println();
        System.out.print("Quantos números você deseja digitar: ");
        int quantidadeDeNumeros = input.nextInt();

        //Criando vetor recebendo a entrada:
        int[] numeros = new int[quantidadeDeNumeros];

        //criando la�o for para armazenar as posi��es e armazenar a quantidade de pares:
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Entre com a posição %d: ", i + 1);
            numeros[i] = input.nextInt();

            //contando os pares
            if (numeros[i] % 2 == 0)
                saoPares++;

            //pegando os valores que s�o pares e armazenando em uma Lista. "esse aqui � um plus":
            if (numeros[i] % 2 == 0){
                numerosPares.add(numeros[i]);
            }
        }

        //imprimindo conforme sintaxe
        System.out.println();
        //Operador ternário
        System.out.println(numeros.length == 1 ? "O número digitado é: " + Arrays.toString(numeros) : "Os números digitados são: " + Arrays.toString(numeros)
        );

        //Operador ternário
        System.out.println(saoPares == 1 ? "A quantidade de numeros pares é " + saoPares + ".\n" + numerosPares + " é um numero par" : "Desses números apenas " + saoPares + " são pares.\nOs numeros pares são: " + numerosPares
        );

        input.close();
    }
}
package Atividade4;
//package sef.module3.sample;
//Faça um programa para pesquisar o valor 8 no vetor dado:
//inteiro vetor[] = {1, 3, 5, 8, 9, 10}

import java.util.Scanner;
public class LocalizaNumero {
    // Corrigir este algoritmo.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int vetor[] = {1,2,3,4,5,6,7,8,9,10};

        System.out.print("Digite o número que deseja achar: ");
        int numero = scan.nextInt();

        boolean achou = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                achou = true;
                System.out.println("Achei!");
                System.out.printf("Na posição %d está localizado o número %d.", i, vetor[i]);
                break;
            }
        }

        if (!achou) {
            System.out.println("Número não encontrado.");
        }

        scan.close();
    }
}
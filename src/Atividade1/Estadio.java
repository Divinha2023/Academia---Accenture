package Atividade1;

import java.util.Scanner;

public class Estadio {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int classeA, classeB, classeC;
    double renda = 0;

    System.out.print("Quantos bilhetes da Classe A foram vendidos? ");
    classeA = scan.nextInt();

    System.out.print("Quantos bilhetes da Classe B foram vendidos? ");
    classeB = scan.nextInt();


    System.out.print("Quantos bilhetes da Classe C foram vendidos? ");
    classeC = scan.nextInt();

    renda = (classeA * 50) + (classeB * 30) + (classeC * 20);
    System.out.println("Renda total gerada: R$ " + renda);



    scan.close();
  }
}
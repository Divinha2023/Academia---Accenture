package Atividade2;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int opcao;
        double num1, num2, resultado;

        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Escolha uma opção: ");
        opcao = scan.nextInt();

        System.out.print("Digite o primeiro número: ");
        num1 = scan.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = scan.nextDouble();

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;

            default:
                System.out.println("Opção inválida!");
        }

        scan.close();
    }
}

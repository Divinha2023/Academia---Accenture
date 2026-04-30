package Atividade6.view;

public class CarroView {

    public void exibirDados(String marca, int codigoCor, double preco) {
        System.out.println("Marca: " + marca);
        System.out.println("Código da Cor: " + codigoCor);
        System.out.printf("Preço: R$ %,.2f\n", preco);
    }

    public void mostrarMensagem(String msg) {
        System.out.println(msg);
    }
}

package Atividade6.model;

public class Carro {

    String marca;
    int codigoCor;
    double preco;
    boolean ligado;
    boolean emMovimento;

    public Carro(String marca, int codigoCor, double preco) {
        this.marca = marca;
        this.codigoCor = codigoCor;
        this.preco = preco;
        this.ligado = false;
        this.emMovimento = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCodigoCor() {
        return codigoCor;
    }

    public void setCodigoCor(int codigoCor) {
        this.codigoCor = codigoCor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isEmMovimento() {
        return emMovimento;
    }

    public void setEmMovimento(boolean emMovimento) {
        this.emMovimento = emMovimento;
    }

    public void ligar() {
        ligado = true;
    }

    public boolean movimentar() {
        if (ligado) {
            emMovimento = true;
            return true;
        }
        return false;
    }

    public boolean podeBuzinar() {
        return emMovimento;
    }
}
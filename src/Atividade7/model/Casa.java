package Atividade7.model;

public class Casa {

    private String endereco;

    public Casa(String endereco) {
        this.endereco = endereco;
    }

    public String abrirPorta() {
        return "A porta da casa foi aberta.";
    }

    public String acenderLuz() {
        return "A luz da casa foi acesa.";
    }

    public String sairDeCasa() {
        return "A porta de casa foi fechada.";
    }
}
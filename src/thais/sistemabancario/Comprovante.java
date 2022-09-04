package thais.sistemabancario;

public class Comprovante {

    final String descricao;
    final double valor;
    final boolean operacaoRealizada;

    Comprovante(String descricaoComprovante, double valorComprovante, boolean operacaoRealzadaComprovante) {
        //ALTEREI
        this.descricao = descricaoComprovante;
        this.valor = valorComprovante;
        this.operacaoRealizada = operacaoRealzadaComprovante;
    }

    boolean operacaoRealizada() {
        return false;
    }

    public void mostrarDetalhes(String descricaoOperacao) {
        System.out.println("\n---- Detalhes do COMPROVANTE ----");
        System.out.println(descricaoOperacao);
        System.out.println("resultado: " + descricao);
        System.out.println("valor: " + valor);
    }
}
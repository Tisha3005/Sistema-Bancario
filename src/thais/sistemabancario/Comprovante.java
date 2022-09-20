package thais.sistemabancario;

public class Comprovante {

    final String descricao;
    final double valor;
    final boolean operacaoRealizada;

    //ALTEREI pois estava escrito errado
    Comprovante(String descricaoComprovante, double valorComprovante, boolean operacaoRealzadaComprovante) {
        //ALTEREI
        this.descricao = descricaoComprovante;
        this.valor = valorComprovante;
        this.operacaoRealizada = operacaoRealzadaComprovante;
    }

    //ALTEREI
    boolean operacaoRealizada() {
        return this.operacaoRealizada;
    }

    public void mostrarDetalhes(String descricaoOperacao) {
        System.out.println("\n---- Detalhes do COMPROVANTE ----");
        System.out.println(descricaoOperacao);
        System.out.println("resultado: " + descricao);
        System.out.println("valor: " + valor);
    }
}
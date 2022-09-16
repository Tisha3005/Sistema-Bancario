package thais.sistemabancario;

public class Comprovante {

    final String descricao;
    final double valor;
     final boolean operacaoRealizada;

//ALTEREI pois estava escrito errado
    Comprovante(String descricaoComprovante, double valorComprovante, boolean operacaoRealizadaComprovante) {
        //ALTEREI
        this.descricao = descricaoComprovante;
        this.valor = valorComprovante;
        this.operacaoRealizada = operacaoRealizadaComprovante;
    }
//ALTEREI
  /*  boolean operacaoRealizada() {
        return false;
    }*/

    public void mostrarDetalhes(String descricaoOperacao) {
        System.out.println("\n---- Detalhes do COMPROVANTE ----");
        System.out.println(descricaoOperacao);
        System.out.println("resultado: " + descricao);
        System.out.println("valor: " + valor);
    }
}
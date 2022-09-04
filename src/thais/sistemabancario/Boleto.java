package thais.sistemabancario;

public class Boleto {

    final double valor;
    boolean boletoEstaPago;

    public Boleto(double valorBoleto) {
        valor = valorBoleto;
        boletoEstaPago = false;
    }

    /**
     * Paga o boleto usando o saldo de uma conta, retorna true se o boleto foi pago e false se n�o foi
     */
    Comprovante pagar(Conta conta) {
        //ALTEREI
        //Comprovante comprovante = conta.sacar(conta.saldo);
        Comprovante comprovante = conta.sacar(this.valor);
        if (comprovante.operacaoRealizada) {
            boletoEstaPago = true;
            return new Comprovante("boleto pago com sucesso", valor, true);
        } else {
            return new Comprovante("sem saldo para pagar o boleto", valor, false);
        }
    }
}
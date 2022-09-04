package thais.sistemabancario;

public class Conta {

    final Banco banco;
    final Cliente cliente;
    final int agencia;
    final int numero;
    double saldo;

    Conta(Banco bancoConta, Cliente donoConta, int agenciaConta, int numeroConta, double saldo) {
        //ALTEREI
        this.banco = bancoConta;
        this.cliente = donoConta;
        this.agencia = agenciaConta;
        this.numero = numeroConta;
        this.saldo = 0;
    }

    /**
     * Deposita um valor na conta
     */
    void depositar(double valor) {
        saldo = saldo + Math.max(valor, 0);
    }

    /**
     * faz um saque na conta, retorna o valor que pode ser sacado
     */
    Comprovante sacar(double valor) {
        //ALTEREI
        if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;
            return new Comprovante("Saque realizado com sucesso", valor, true);
        } else {
            return new Comprovante("Sem saldo para realizar o saque", valor, false);
        }
    }

    /**
     * Transfere um valor de uma conta para outra, na pratica, a transferencia de um
     * valor � o saque na conta de origem e o deposito na conta de destino. Retorna
     * true se conseguiu transferir e false se n�o conseguiu
     */
    Comprovante transferir(Conta contaDestino, double valor) {
        //ALTEREI
        //Comprovante comprovante = contaDestino.sacar(valor);
        Comprovante comprovante = this.sacar(valor);
        //ALTEREI
        //if (comprovante.operacaoRealizada()){
        if (comprovante.operacaoRealizada) {
            //ALTEREI
            // depositar(comprovante.valor);
            contaDestino.depositar(valor);
            return new Comprovante("Transfer�ncia realizada com sucesso", valor, true);
        } else {
            return new Comprovante("Conta n�o tem dinheiro para realizar a transferencia", valor, false);
        }
    }

    void mostrarDetalhes() {
        System.out.println("\n---- Detalhes da CONTA ----");
        //ALTEREI
        System.out.println("Dono: " + cliente.nome);
        System.out.println("Banco: " + banco.nome);
        System.out.println("Ag�ncia: " + agencia);
        System.out.println("N�mero: " + numero);
        System.out.println("Saldo: " + saldo);
    }
}
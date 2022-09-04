package thais.sistemabancario;

public class Banco {

    final String nome;
    int ultimaConta = 10000;
    int agenciaPrincipal = 1;

    public Banco(String nomeBanco) {
        this.nome = nomeBanco;
    }

    Conta criarConta(Cliente cliente) {
        Conta novaConta = new Conta(this, cliente, agenciaPrincipal, ultimaConta, agenciaPrincipal); //new Conta(Banco, Cliente);//(Banco, agenciaPrincipal, ultimaConta);
        ultimaConta = ultimaConta + 1;
        return novaConta;
    }

    Boleto gerarBoleto(double valorBoleto) {
        return new Boleto(valorBoleto);
    }
}
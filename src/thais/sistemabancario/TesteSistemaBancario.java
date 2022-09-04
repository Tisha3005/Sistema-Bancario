package thais.sistemabancario;

public class TesteSistemaBancario {

	public static void main(String[] args) {
		// IMPORTANTE vc s� deve executar essa classe, n�o pode mexer em nada aqui

		// cria um banco
		Banco banco = new Banco("pagbank");

		// cria dois clientes
		Cliente joao = new Cliente("joao", "92170298746", "11 282736262", "04570000");
		Cliente maria = new Cliente("maria", "45521414061", "11 425362171", "38408254");

		// cria uma conta para cada cliente
		Conta contaJoao = banco.criarConta(joao);
		Conta contaMaria = banco.criarConta(maria);

		// faz um deposito inicial nas contas
		contaMaria.depositar(600);
		contaJoao.depositar(100);

		// mostra os detalhes de cada conta
		contaJoao.mostrarDetalhes();
		contaMaria.mostrarDetalhes();

		Boleto boletoDeLuz = banco.gerarBoleto(200);

		// jo�o precisa pagar uma conta de 800 reais e pede emprestimo para maria
		Comprovante comprovanteTransferencia = contaMaria.transferir(contaJoao, 130);
		comprovanteTransferencia.mostrarDetalhes("Transferencia de 130 reais de Maria para Jo�o");

		//alterei aqui comprovanteTransferencia.operacaoRealizada()
		if (comprovanteTransferencia.operacaoRealizada) {
			Comprovante comprovantePagtoBoleto = boletoDeLuz.pagar(contaJoao);
			comprovantePagtoBoleto.mostrarDetalhes("Pagamento do boleto de luz de 200 reais feito por jo�o");
		}

		// maria resolve sacar o saldo total da sua conta
		final Comprovante comprovanteSaqueMaria = contaMaria.sacar(470);
		comprovanteSaqueMaria.mostrarDetalhes("Saque do valor total da conta de Maria");

		// mostra os detalhes de cada conta
		contaJoao.mostrarDetalhes();
		contaMaria.mostrarDetalhes();

	}

}
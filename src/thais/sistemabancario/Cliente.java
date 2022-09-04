package thais.sistemabancario;

public class Cliente {

	final String nome;
	final String documento;
	String telefone;
	String cep;

	Cliente(String nomeCliente, String documentoCliente, String telefoneCliente, String cepCliente) {
		//ALTEREI
		this.nome = nomeCliente;
		this.documento = documentoCliente;
		this.telefone = telefoneCliente;
		this.cep = cepCliente;
	}
}
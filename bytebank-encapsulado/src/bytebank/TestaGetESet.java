package bytebank;

public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		// conta.numero = 1337; nao compila
		conta.setNumero(1337);
		System.out.println(conta.getNumero());

		Cliente ricardo = new Cliente();
		// conta.titular = ricardo; não irá compilar pois esta privado;
		ricardo.setNome("Ricardo Neves");

		conta.setTitular(ricardo);

		System.out.println(conta.getTitular().getNome());

		conta.getTitular().setProfissao("programador");
		// agora em duas linhas :
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
	}

}

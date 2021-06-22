package bytebank;

public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);

		System.out.println(conta.getAgencia());

		conta.setAgencia(1232123);

		System.out.println(Conta.getTotal());
	}
	
}

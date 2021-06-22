package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.adicionarSaldo(300);
	
		System.out.println("saldo da primeira: " + primeiraConta.pegaSaldo());
	
		Conta segundaConta = primeiraConta;
	
		System.out.println("saldo da segunda conta: " + segundaConta.pegaSaldo());
	
		segundaConta.adicionarSaldo(100);
		System.out.println("saldo da segunda conta " + segundaConta.pegaSaldo());
	
		System.out.println(primeiraConta.pegaSaldo());
	
		if (primeiraConta == segundaConta) {
			System.out.println("é a mesma conta");
		}
	
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
        
 }

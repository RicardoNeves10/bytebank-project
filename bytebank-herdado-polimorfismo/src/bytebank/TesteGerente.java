package bytebank;

public class TesteGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("Ana");
		gerente.setCpf("000.000.000-00");
		gerente.setSalario(2000.0);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		
		gerente.setSenha(123456);
		boolean autenticou = gerente.autentica(123456);
		
		System.out.println(autenticou);
	}

}

package bytebank;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario ricardo = new Funcionario();
		ricardo.setNome("Ricardo Neves");
		ricardo.setCpf("000.000.000-00");
		ricardo.setSalario(2000.00);
		
		System.out.println(ricardo.getNome());
		System.out.println(ricardo.getBonificacao());
	}

}

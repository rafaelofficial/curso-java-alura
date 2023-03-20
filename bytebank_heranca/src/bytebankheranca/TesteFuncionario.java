package bytebankheranca;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente maria = new Gerente();
		
		maria.setNome("Maria Jose");
		maria.setCpf("222111333-1");
		maria.setSalario(2500.0);
		
		System.out.println(maria.getNome());
		System.out.println(maria.getCpf());
		System.out.println(maria.getBonificacao());

	}

}

package bytebankheranca;

public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente gerente1 = new Gerente();
		
		gerente1.setNome("Marco");
		gerente1.setCpf("333444555-2");
		gerente1.setSalario(5000.0);
		
		System.out.println(gerente1.getNome());
		System.out.println(gerente1.getCpf());
		System.out.println(gerente1.getSalario());
		
		gerente1.setSenha(2222);		
		boolean autenticou = gerente1.autentica(2222);
		
		System.out.println(autenticou);
		System.out.println(gerente1.getBonificacao());
		
	}

}

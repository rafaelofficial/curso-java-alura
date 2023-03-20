package bytebankheranca;

public class SistemaInterno {

	private int senha = 2222;
	
	public void autentica(Autenticavel autenticavel) {
		
		boolean autenticou = autenticavel.autentica(this.senha);
		
		if (autenticou) {
			System.out.println("Pode entrar no sistema!");
		} else {
			System.err.println("Nao pode entrar no sistema!");
		}
	}
}

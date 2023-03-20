package alura.java.enums;

public class TesteEnum {

	public static void main(String[] args) {
		

		Prioridade prioridadeMin = Prioridade.MIN;
		Prioridade prioridadeMax = Prioridade.MAX;
		Prioridade prioridadeNormal = Prioridade.NORMAL;
		
		System.out.println(prioridadeMin.name());
		System.out.println(prioridadeMax.name());
		
		System.out.println(prioridadeMin.ordinal());
		System.out.println(prioridadeMax.ordinal());
		
		System.out.println(prioridadeMin.getValor());
		System.out.println(prioridadeMax.getValor());
		System.out.println(prioridadeNormal.getValor());
		
	}

}

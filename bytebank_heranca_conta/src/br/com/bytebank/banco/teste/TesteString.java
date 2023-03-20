package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-")
			.append("me")
			.append(", ")
			.append("subi ")
			.append("no ")
			.append("onibus ")
			.append("em ")
			.append("Marrocos!!!");
		
		String texto = builder.toString();
		System.out.println(texto);
		
		String nome = "Alura";

		char x = nome.charAt(3);
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		int pos = nome.indexOf(x);
		System.out.println(pos);
		
		
		String sub = nome.substring(1);
		System.out.println(sub);
		
		char c = 'A';
		char d = 'a';
		
		String outro = nome.replace(c, d);

		System.out.println(nome);
		System.out.println(outro);
		
		
		String minusculo = nome.toLowerCase();
		String maiusculo = nome.toUpperCase();
		

		
		System.out.println(minusculo);
		System.out.println(maiusculo);

	}

}

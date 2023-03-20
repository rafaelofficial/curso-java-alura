package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5];

		var cc1 = new ContaCorrente(11, 22);
		contas[0] = cc1;
		
		var cc2 = new ContaPoupanca(22, 33);
		contas[1] = cc2;
		
		System.out.println(contas[1].getNumero());
		
		Conta ref = contas[0];
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		
	}

}

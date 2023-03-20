package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.exceptions.SaldoInsuficienteException;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSaca {

	public static void main(String[] args) {
		
		var conta = new ContaCorrente(123, 321);
		
		conta.deposita(200.0);
		try {
			conta.saca(215.0);
		} catch (SaldoInsuficienteException e) {
			System.out.println("SaldoInsuficienteException: " + e.getMessage());
		}
		
		System.out.println(conta.getSaldo());
	}

}

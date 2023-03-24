package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {

		List<Conta> lista = new ArrayList<>();
		
		Conta cc1 = new ContaCorrente(11, 77);
		cc1.deposita(223.0);
		Conta cc2 = new ContaCorrente(11, 44);
		cc2.deposita(155.0);
		Conta cc3 = new ContaCorrente(11, 33);
		cc3.deposita(450.0);
		Conta cc4 = new ContaCorrente(11, 22);
		cc4.deposita(99.9);
		
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		NumeroDaContaComparator comparator = new NumeroDaContaComparator();
		
		lista.sort(comparator);
		
		System.out.println("----------");

		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}

}

class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta o1, Conta o2) {
		
		if (o1.getNumero() < o2.getNumero()) {
			return -1;
		}
		
		if (o1.getNumero() > o2.getNumero()) {
			return 1;
		}
		
		return 0;
	}
	
}








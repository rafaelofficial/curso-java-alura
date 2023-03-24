package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {

		List<Conta> lista = new ArrayList<>();
		
		Conta cc1 = new ContaCorrente(11, 77);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.deposita(223.0);
		
		
		Conta cc2 = new ContaPoupanca(11, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Rafael");
		cc2.setTitular(clienteCC2);
		cc2.deposita(155.0);
		
		Conta cc3 = new ContaCorrente(11, 33);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Ana");
		cc3.setTitular(clienteCC3);
		cc3.deposita(450.0);
		
		
		Conta cc4 = new ContaPoupanca(11, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Paula");
		cc4.setTitular(clienteCC4);
		cc4.deposita(99.9);
		
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
//		NumeroDaContaComparator comparator = new NumeroDaContaComparator();
		lista.sort(new TitularDaContaComparator());
		
		System.out.println("----------");

		for (Conta conta : lista) {
			System.out.println(conta + ", " + conta.getTitular().getNome());
		}
	}

}

class TitularDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta o1, Conta o2) {

		String nomeConta1 = o1.getTitular().getNome();
		String nomeConta2 = o2.getTitular().getNome();
		
		return nomeConta1.compareTo(nomeConta2);
	}
}

class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta o1, Conta o2) {
		return Integer.compare(o1.getNumero(), o2.getNumero());
	}
}

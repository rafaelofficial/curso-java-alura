package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {

		Integer idadeRef = 29; //autoboxinng, é criado um objeto do tipo Integer
		int primitivo = new Integer(29); //que locura!! unboxing
		
		List<Integer> lista = new ArrayList<>();
		lista.add(idadeRef);
		lista.add(primitivo); // autoboxing
		
		int i1 = lista.get(0);
		Integer i2 = lista.get(1);
		
		System.out.println(i1);
		System.out.println(i2);
		
		Integer valorRef = Integer.valueOf(33);
		int valorPrimitivo = valorRef.intValue();
		
		System.out.println(valorPrimitivo);
		
		Integer iParseado1 = Integer.valueOf("42");
		int iParseado2 = Integer.parseInt("42");
		
		System.out.println(iParseado1);
		System.out.println(iParseado2);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		
		
		
		
	}

}

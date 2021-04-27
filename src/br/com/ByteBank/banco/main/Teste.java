package br.com.ByteBank.banco.main;

import br.com.ByteBank.banco.model.ContaCorrente;

public class Teste {

	public static void main(String[] args) {

		System.out.println("teste");
		System.out.println(4);
		System.out.println(true);
		
		ContaCorrente cc = new ContaCorrente(423, 535);
		print(cc);
		
//		System.out.println(cc);
	}
	
	public static void print(Object referencia) {
		System.out.println(referencia);
	}
	

}

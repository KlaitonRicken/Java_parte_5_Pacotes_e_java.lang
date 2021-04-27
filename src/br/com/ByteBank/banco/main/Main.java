package br.com.ByteBank.banco.main;

//import br.com.ByteBank.banco.especial.ContaEspecial;
//import br.com.ByteBank.banco.model.CalculadorDeImposto;
//import br.com.ByteBank.banco.model.ContaCorrente;
//import br.com.ByteBank.banco.model.ContaPoupanca;
//import br.com.ByteBank.banco.model.SaldoInsuficienteException;
//import br.com.ByteBank.banco.model.SeguroDeVida;

public class Main {

	public static void main(String[] args) {
	
//		ContaCorrente cc = new ContaCorrente(34234, 100);
//		cc.deposita(256);
//	
//		ContaPoupanca cp = new ContaPoupanca(23525, 533);
//		cp.deposita(5226);
//		
//		try {
//			cc.transfere(50, cp);
//		} catch (SaldoInsuficienteException e1) {
//			e1.printStackTrace();
//		}
//		System.out.println(cp.getSaldo());
//		System.out.println(cc.getSaldo());
//		
//		SeguroDeVida seguro = new SeguroDeVida();
//		CalculadorDeImposto ci = new CalculadorDeImposto();
//		ci.registro(cc);
//		ci.registro(seguro);
//		
//		System.out.println(ci.getTotalImposto());
//		
//		ContaCorrente conta = new ContaCorrente(24, 2525);
//		
//		conta.deposita(200);
//		try {
//			conta.saca(50);
//		} catch (SaldoInsuficienteException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(conta.getSaldo());
//		
//		ContaEspecial ce = new ContaEspecial(2523, 143);
//		ce.getSaldo();
		
		String nome = "Alura ";
		String vazio = "    Alura";
		
		System.out.println(vazio);
		System.out.println(vazio.trim());
		System.out.println(vazio.contains("lur"));
		
		char c = 'A';
		char d = 'a';
		
		String outro = nome.toLowerCase();
		outro = nome.toUpperCase();
		
		outro = nome.replace(c,d);
		
		System.out.println(nome.charAt(3));
		
		System.out.println(nome.indexOf("ur"));
		
		System.out.println(nome.substring(1, 4));
		
		System.out.println(nome);
		System.out.println(outro);
		
		int n = nome.length();
		
		for(int i=0; i<n; i++) {
			System.out.println(nome.charAt(i));
		}
		
	}
}

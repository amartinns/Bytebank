package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteConta {
	
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 333);
		cc.deposita(500);
		
		ContaPoupanca cp = new ContaPoupanca(222, 444);
		cp.deposita(600);
		
		cc.transfere(250, cp);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
	}

}

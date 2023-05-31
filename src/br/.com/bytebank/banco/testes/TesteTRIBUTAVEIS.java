package br.com.bytebank.banco.testes; 

import br.com.bytebank.banco.modelo.*;


public class TesteTRIBUTAVEIS {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(222, 444);
		
		cc.deposita(250.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorImposto calc = new CalculadorImposto();
		
		calc.registra(seguro);
		calc.registra(cc);
		
		
		

	}

}

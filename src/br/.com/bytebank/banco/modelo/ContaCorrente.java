package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	
	public void saca(double valor) {
		double valorSacado = valor + 0.5;
		super.saca(valorSacado);
	}


	@Override
	public void deposita(double valor) {
		 super.saldo += valor;
		
	}


	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return super.saldo * 0.01;
	}
}

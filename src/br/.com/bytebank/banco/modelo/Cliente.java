package br.com.bytebank.banco.modelo;

public class Cliente {
	
	private String Nome;
	private String Cpf;
	private String Profissão;
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	public String getProfissão() {
		return Profissão;
	}
	public void setProfissão(String profissão) {
		Profissão = profissão;
	}

}

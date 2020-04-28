package entity;

import java.io.Serializable;

public class Correntista implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private Double saldo = 0D;
	private String banco;
	
	public Correntista() {
	}

	public Correntista(Long id, String nome, Double saldo, String banco) {
		this.id = id;
		this.nome = nome;
		this.saldo = saldo;
		this.banco = banco;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public String getBanco() {
		return banco;
	}
	
	public void setBanco(String banco) {
		this.banco = banco;
	}
	
	public String toString() {
		return "Id Cliente: "
				+ id
				+ ", "
				+ nome
				+ ", "
				+ String.format("R$%.2f", saldo)
				+ ", "
				+ banco;
	}
}

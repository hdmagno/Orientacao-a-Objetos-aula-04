package entity;

public class Cliente {
	
	private Long id;
	private String nome;
	private String plano;
	private Double valorPlano = 0D;
	
	public Cliente() {
	}

	public Cliente(Long id, String nome, String plano, Double valorPlano) {
		this.id = id;
		this.nome = nome;
		this.plano = plano;
		this.valorPlano = valorPlano;
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
	
	public String getPlano() {
		return plano;
	}
	
	public void setPlano(String plano) {
		this.plano = plano;
	}
	
	public Double getValorPlano() {
		return valorPlano;
	}
	
	public void setValorPlano(Double valorPlano) {
		this.valorPlano = valorPlano;
	}
	
	@Override
	public String toString() {
		return "Id Cliente: "
				+ id
				+ ", Nome: "
				+ nome
				+ ", Plano:"
				+ plano
				+ ", Valor do Plano: "
				+ String.format("R$%.2f", valorPlano);
	}
}

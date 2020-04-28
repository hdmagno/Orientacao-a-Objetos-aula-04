package entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Movimentacao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Long idMovimentacao;
	private Double valor;
	private String operacao;
	private Date dataMovimentacao  = new Date();
	
	private Correntista correntista;

	public Movimentacao() {
	}
	
	public Movimentacao(Long idMovimentacao, Double valor, String operacao) {
		this.idMovimentacao  = idMovimentacao;
		this.valor = valor;
		this.operacao = operacao;
	}
	
	public Long getIdMovimentacao() {
		return idMovimentacao;
	}
	
	public void setMovimentacao(Long idMovimentacao) {
		this.idMovimentacao = idMovimentacao;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public String getOperacao() {
		return operacao;
	}
	
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	
	public Date getDataMovimentacao() {
		return dataMovimentacao;
	}
	
	public void setDataMovimentacao(Date dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}
	
	public Correntista getCorrentista() {
		return correntista;
	}
	
	public void setCorrentista(Correntista correntista) {
		this.correntista = correntista;
	}
	
	public void gerarMovimentacao() {
		if(this.getOperacao().equals("deposito")) {
			this.correntista.setSaldo(this.correntista.getSaldo() + this.valor);
		}
		else if(this.getOperacao().equals("retirada")) {
			this.correntista.setSaldo(this.correntista.getSaldo() - this.valor - 5.0);
			
		}
	}
	
	public String toString() {
		return "Id Movimentacao: "
				+ idMovimentacao
				+ ", Valor: "
				+ String.format("R$%.2f", valor)
				+ ", Operação: "
				+ operacao
				+ ", Data da Movimentação: "
				+ sdf.format(dataMovimentacao);
	}
}

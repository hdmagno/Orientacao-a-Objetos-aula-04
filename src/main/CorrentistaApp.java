package main;

import entity.Correntista;
import entity.Movimentacao;

public class CorrentistaApp {

	public static void main(String[] args) {

		Correntista correntista = new Correntista(10L, "Amanda", 8000D, "Bradesco");
		Correntista correntista2 = new Correntista(11L, "Hilton", 14000D, "Itaú");
		
		Movimentacao movimentacao = new Movimentacao(10L, 700D, "deposito");
		movimentacao.setCorrentista(correntista);
		movimentacao.gerarMovimentacao();
		
		Movimentacao movimentacao2 = new Movimentacao(11L, 1350D, "retirada");
		movimentacao2.setCorrentista(correntista2);
		movimentacao2.gerarMovimentacao();
		
		System.out.println(correntista);
		System.out.println(movimentacao);
		System.out.println("===================================================================================================");
		System.out.println(correntista2);
		System.out.println(movimentacao2);
	}

}

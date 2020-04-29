package main;

import java.util.ArrayList;
import java.util.List;

import entity.Cliente;
import io.GravacaoJson;

public class ClienteApp {
	
	public static void main(String[] args) {
		
		GravacaoJson json = new GravacaoJson();
		
		List<Cliente> lista = new ArrayList<Cliente>();
		Cliente cliente1 = new Cliente(10L, "Amanda", "Bradesco Saúde", 300D);
		Cliente cliente2 = new Cliente(12L, "Hilton", "SulAmérica Saúde", 450D);
		Cliente cliente3 = new Cliente(17L, "Mel", "Saúde Canino", 800D);
		lista.add(cliente1);
		lista.add(cliente2);
		lista.add(cliente3);
		try {
		json.open();
		json.writeJson(lista);
		json.close();
		System.out.println("Dados Gravados em JSON");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error... " + e.getMessage());
		}
		
		
	}
	

}

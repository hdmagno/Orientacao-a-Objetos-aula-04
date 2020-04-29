package io;

import java.io.FileWriter;
import java.util.List;

import com.google.gson.Gson;

import entity.Cliente;

public class GravacaoJson implements IGravacaoJson {
	
	FileWriter fw;
	
	@Override
	public void open() throws Exception {
		fw = new FileWriter("/tmp/cliente.json", false);
		
	}

	@Override
	public void writeJson(List<Cliente> lista) throws Exception {
		fw.write(new Gson().toJson(lista));
		
	}

	@Override
	public void close() throws Exception {
		fw.flush();
		fw.close();
		
	}

}

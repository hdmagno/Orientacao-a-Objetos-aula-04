package io;

import java.util.List;

import entity.Cliente;

public interface IGravacaoJson {
	
	public void open() throws Exception;
	
	public void writeJson(List<Cliente> lista) throws Exception;
	
	public void close() throws Exception;

}

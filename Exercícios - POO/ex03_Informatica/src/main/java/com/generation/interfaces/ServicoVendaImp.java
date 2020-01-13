package com.generation.interfaces;

import com.generation.model.Produto;
import com.generation.modelCliente.Cliente;

public class ServicoVendaImp {
	public String venda(Produto produto, Cliente cliente) {
		String mensagem= "Cliente: "+cliente.getNome()+"\n-Produto: "+produto.getModelo()+"\n-Marca: "+produto.getMarca()+"\n-Referência: "+produto.getReferencia();
		return mensagem;
	}
}

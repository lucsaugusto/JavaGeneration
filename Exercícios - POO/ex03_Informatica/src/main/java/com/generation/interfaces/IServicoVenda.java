package com.generation.interfaces;

import com.generation.model.Produto;
import com.generation.modelCliente.Cliente;

public interface IServicoVenda {
	String venda(Produto produto, Cliente cliente);
	String cancelarVenda(Produto produto, Cliente cliente);
}

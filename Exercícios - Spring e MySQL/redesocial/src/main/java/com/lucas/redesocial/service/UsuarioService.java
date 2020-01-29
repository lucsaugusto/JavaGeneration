package com.lucas.redesocial.service;

import java.util.List;

import com.lucas.redesocial.entity.Usuario;

public interface UsuarioService {
	Usuario insertOrUpdate(Usuario usuario);
	
	void delete(int id);
	
	List<Usuario> getAll();
	
	Usuario getById(int id);
}

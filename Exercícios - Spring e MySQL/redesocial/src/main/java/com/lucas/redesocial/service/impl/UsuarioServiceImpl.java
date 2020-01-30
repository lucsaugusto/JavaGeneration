package com.lucas.redesocial.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.escola.entity.Aluno;
import com.lucas.redesocial.entity.Usuario;
import com.lucas.redesocial.repository.UsuarioRepository;
import com.lucas.redesocial.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository repository;
	
	
	@Override
	public Usuario insertOrUpdate(Usuario entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
	}

	@Override
	public List<Usuario> getAll() {
		return (List<Usuario>) this.repository.findAll();
	}

	@Override
	public Usuario getById(int id) {
		return this.repository.findById(id).orElse(null);
	}
	

}

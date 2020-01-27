package com.lucas.escola.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.escola.entity.Turno;
import com.lucas.escola.repository.TurnoRepository;
import com.lucas.escola.service.TurnoService;

@Service
public class TurnoServiceImpl implements TurnoService {

	@Autowired
	private TurnoRepository repository;
	
	@Override
	public Turno insertOrUpdate(Turno entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
	}

	@Override
	public List<Turno> getAll() {
		return (List<Turno>) this.repository.findAll();
	}

	@Override
	public Turno getById(int id) {
		return this.repository.findById(id).orElse(null);
	}

	@Override
	public List<Turno> getAllByNome(String nome) {
		return (List<Turno>) this.repository.findAllByNome(nome);
	}

	@Override
	public Turno getByNome(String nome) {
		return this.repository.findTurnoByNome(nome);
	}

}

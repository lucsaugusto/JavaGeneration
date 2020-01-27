package com.lucas.escola.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.escola.entity.Turma;
import com.lucas.escola.repository.TurmaRepository;
import com.lucas.escola.service.TurmaService;

@Service
public class TurmaServiceImpl implements TurmaService {
	
	@Autowired
	private TurmaRepository repository;
	
	@Override
	public Turma insertOrUpdate(Turma entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
	}

	@Override
	public List<Turma> getAll() {
		return (List<Turma>) this.repository.findAll();
	}

	@Override
	public Turma getById(int id) {
		return this.repository.findById(id).orElse(null);
	}

	@Override
	public List<Turma> getAllByNome(String nome) {
		return (List<Turma>)this.repository.findAllByNome(nome);
	}

	@Override
	public Turma getByNome(String nome) {
		return this.repository.findTurmaByNome(nome);
	}
}

package com.lucas.escola.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.lucas.escola.entity.Turma;

public interface TurmaRepository extends CrudRepository<Turma, Integer>{

	List<Turma> findAllByNome(String nome);
	Turma findTurmaByNome(String nome);
}

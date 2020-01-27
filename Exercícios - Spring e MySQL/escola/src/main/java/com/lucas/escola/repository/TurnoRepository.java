package com.lucas.escola.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.lucas.escola.entity.Turno;

public interface TurnoRepository extends CrudRepository<Turno, Integer>{
	List<Turno> findAllByNome(String nome);
	Turno findTurnoByNome(String nome);
}

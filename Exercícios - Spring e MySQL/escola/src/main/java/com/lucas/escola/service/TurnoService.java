package com.lucas.escola.service;

import java.util.List;

import com.lucas.escola.entity.Turno;

public interface TurnoService {
	Turno insertOrUpdate(Turno entity);
	
	void delete (int id);
	
	List<Turno> getAll();
	
	Turno getById(int id);
	
	List<Turno> getAllByNome(String nome);
	
	Turno getByNome(String nome);
}

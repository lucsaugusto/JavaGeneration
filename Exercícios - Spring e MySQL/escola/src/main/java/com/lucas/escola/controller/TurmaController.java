package com.lucas.escola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.lucas.escola.entity.Turma;
import com.lucas.escola.service.TurmaService;

@RestController
@CrossOrigin("*")
public class TurmaController {
	@Autowired
	private TurmaService service;
	
	@PostMapping("/turma")
	public ResponseEntity<Turma> post(@RequestBody Turma entity){
		try {
			Turma turmaSalvo = this.service.insertOrUpdate(entity);
			return ResponseEntity.ok(turmaSalvo);
		}catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@PutMapping("/turma")
	public ResponseEntity<Turma> put(@RequestBody Turma entity){
		try {
			Turma turmaSalvo = this.service.insertOrUpdate(entity);
			return ResponseEntity.ok(turmaSalvo);
		}catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@DeleteMapping("/turma/{id}")
	public ResponseEntity<String> delete(@PathVariable int id){
		if(this.service.getById(id) == null)
			return ResponseEntity.notFound().build();
		
		try {
			this.service.delete(id);
			return ResponseEntity.ok("Removido com sucesso.");
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@GetMapping("/turma/{id}")
	public ResponseEntity<Turma> getById(@PathVariable int id){
		Turma turma = this.service.getById(id);
		
		if(turma == null)
			return ResponseEntity.notFound().build();
		
		return ResponseEntity.ok(turma);
	}
	
	@GetMapping("/turma")
	public ResponseEntity<List<Turma>> getAll(){
		return ResponseEntity.ok(this.service.getAll());
	}
	
	@GetMapping("/turma/nome/{nome}")
	public ResponseEntity<Turma> getByName(String nome){
		return ResponseEntity.ok(this.service.getByNome(nome));
	}
	
	@GetMapping("/turma/nomes/{nome}")
	public ResponseEntity<List<Turma>> getAllByName(String nome){
		return ResponseEntity.ok(this.service.getAllByNome(nome));
	}
}

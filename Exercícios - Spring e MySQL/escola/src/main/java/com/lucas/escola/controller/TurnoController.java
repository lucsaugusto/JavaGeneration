package com.lucas.escola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.lucas.escola.entity.Turno;
import com.lucas.escola.service.TurnoService;

@RestController
@CrossOrigin("*")
public class TurnoController {
	@Autowired
	private TurnoService service;
	
	@PostMapping("/turno")
	public ResponseEntity<Turno> post(@RequestBody Turno entity){
		try {
			Turno turnoSalvo = this.service.insertOrUpdate(entity);
			return ResponseEntity.ok(turnoSalvo);
		}catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@PutMapping("/turno")
	public ResponseEntity<Turno> put(@RequestBody Turno entity){
		try {
			Turno turnoSalvo = this.service.insertOrUpdate(entity);
			return ResponseEntity.ok(turnoSalvo);
		}catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@DeleteMapping("/turno/{id}")
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
	
	@GetMapping("/turno/{id}")
	public ResponseEntity<Turno> getById(@PathVariable int id){
		Turno turno = this.service.getById(id);
		
		if(turno == null)
			return ResponseEntity.notFound().build();
		
		return ResponseEntity.ok(turno);
	}
	
	@GetMapping("/turno")
	public ResponseEntity<List<Turno>> getAll(){
		return ResponseEntity.ok(this.service.getAll());
	}
	
	@GetMapping("/turno/nome/{nome}")
	public ResponseEntity<Turno> getByName(String nome){
		return ResponseEntity.ok(this.service.getByNome(nome));
	}
	
	@GetMapping("/turno/nomes/{nome}")
	public ResponseEntity<List<Turno>> getAllByName(String nome){
		return ResponseEntity.ok(this.service.getAllByNome(nome));
	}
}

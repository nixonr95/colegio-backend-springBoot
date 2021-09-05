package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.modelo.Curso;
import com.crud.h2.service.InterfaceCursoService;

@RestController
public class CursoController {

	@Autowired
	private InterfaceCursoService service;
	
	@GetMapping("/curso/listar")
	public List<Curso> listar() {
		return service.listar();
	}
	
	@PostMapping("/curso/agregar")
	public List<Curso> agregar(@RequestBody Curso curso) {
		service.agregar(curso);
		return service.listar();
	}
	
	@GetMapping("/curso/{id}")
	public Curso listarPorId(@PathVariable("id") int id ) {
		return service.listCursoId(id);
	}
	
	@PutMapping("/curso/{id}")
	public Curso editar(@PathVariable("id") int id, @RequestBody Curso curso) {
		service.editar(id, curso);
		return service.listCursoId(id);
	}
	
	@DeleteMapping("/curso/{id}")
	public List<Curso> eliminar(@PathVariable("id") int id) {
		service.delete(id);
		return service.listar();
	}
}

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

import com.crud.h2.modelo.Estudiante;
import com.crud.h2.service.InterfaceEstudianteService;

@RestController
public class EstudianteController {
	
	@Autowired
	private InterfaceEstudianteService service;

	@GetMapping("/estudiante/listar")
	public List<Estudiante> listar() {
		return service.listar();
	}
	
	@PostMapping("/estudiante/agregar") 
	public List<Estudiante> agregar(@RequestBody Estudiante estudiante) {
		service.agregar(estudiante);
		return service.listar();
	}
	
	@GetMapping("/estudiante/{id}")
	public Estudiante listarPorId(@PathVariable("id") int id ) {
		return service.listEstudianteId(id);
	}
	
	@PutMapping("/estudiante/{id}")
	public Estudiante editar(@PathVariable("id") int id, @RequestBody Estudiante estudiante) {
		service.editar(id, estudiante);
		return service.listEstudianteId(id);
	}
	
	@DeleteMapping("/estudiante/{id}")
	public List<Estudiante> eliminar(@PathVariable("id") int id) {
		service.delete(id);
		return service.listar();
	}
	
}

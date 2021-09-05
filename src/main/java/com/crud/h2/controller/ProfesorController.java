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

import com.crud.h2.modelo.Profesor;
import com.crud.h2.service.InterfaceProfesorService;

@RestController
public class ProfesorController {
	
	@Autowired
	private InterfaceProfesorService service;
	
	@GetMapping("/profesor/listar")
	public List<Profesor> listar() {
		return service.listar();
	}
	
	@PostMapping("/profesor/agregar")
	public List<Profesor> agregar(@RequestBody Profesor profesor){
		service.agregar(profesor);
		return service.listar();
	}
	
	@GetMapping("/profesor/{id}")
	public Profesor listarPorId(@PathVariable("id") int id ) {
		return service.listProfesorId(id);
	}
	
	@PutMapping("/profesor/{id}")
	public Profesor editar(@PathVariable("id") int id, @RequestBody Profesor profesor) {
		service.editar(id, profesor);
		return service.listProfesorId(id);
	}
	
	@DeleteMapping("/profesor/{id}")
	public List<Profesor> eliminar(@PathVariable("id") int id) {
		service.delete(id);
		return service.listar();
	}
}

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

import com.crud.h2.modelo.Asignatura;
import com.crud.h2.service.InterfaceAsignaturaService;

@RestController
public class AsignaturaController {
	@Autowired
	private InterfaceAsignaturaService service;
	
	@GetMapping("/asignatura/listar")
	public List<Asignatura> listar(){
		return service.listar();
	}
	
	@PostMapping("/asignatura/agregar")
	public List<Asignatura> agregar(@RequestBody Asignatura asignatura){
		service.agregar(asignatura);
		return service.listar();
	}
	
	@GetMapping("/asignatura/{id}")
	public Asignatura listarPorId(@PathVariable("id") int id ) {
		return service.listAsignaturaId(id);
	}
	
	@PutMapping("/asignatura/{id}")
	public Asignatura editar(@PathVariable("id") int id, @RequestBody Asignatura asignatura) {
		service.editar(id, asignatura);
		return service.listAsignaturaId(id);
	}
	
	@DeleteMapping("/asignatura/{id}")
	public List<Asignatura> eliminar(@PathVariable("id") int id) {
		service.delete(id);
		return service.listar();
	}
}

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

import com.crud.h2.modelo.AsignaturaCursada;
import com.crud.h2.service.InterfaceAsignaturaCursadaService;

@RestController
public class AsignaturaCursadaController {
	
	@Autowired
	private InterfaceAsignaturaCursadaService service;

	@GetMapping("/asignatura-cursada/listar")
	public List<AsignaturaCursada> listar() {
		return service.listar();
	}
	
	@PostMapping("/asignatura-cursada/agregar")
	public List<AsignaturaCursada> agregar(@RequestBody AsignaturaCursada asignaturaCursada) {
		return service.listar();
	}
	
	@GetMapping("/asignatura-cursada/{id}")
	public AsignaturaCursada listarPorId(@PathVariable("id") int id ) {
		return service.listAsignaturaCursadaId(id);
	}
	
	@PutMapping("/asignatura-cursada/{id}")
	public AsignaturaCursada editar(@PathVariable("id") int id, @RequestBody AsignaturaCursada asignaturaCursada) {
		service.editar(id, asignaturaCursada);
		return service.listAsignaturaCursadaId(id);
	}
	
	@DeleteMapping("/asignatura-cursada/{id}")
	public List<AsignaturaCursada> eliminar(@PathVariable("id") int id) {
		service.delete(id);
		return service.listar();
	}
}

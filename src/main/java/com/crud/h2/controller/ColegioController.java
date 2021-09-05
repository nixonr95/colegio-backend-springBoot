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

import com.crud.h2.modelo.Colegio;
import com.crud.h2.service.InterfaceColegioService;

@RestController
public class ColegioController {
	
	@Autowired
	private InterfaceColegioService service;
	
	@GetMapping("/colegio/listar")
	public List<Colegio> listar(){
		return service.listar();
	}
	
	@PostMapping("/colegio/agregar")
	public List<Colegio> agregar(@RequestBody Colegio colegio){
		service.agregar(colegio);
		return service.listar();
	}
	
	@GetMapping("/colegio/{id}")
	public Colegio listarPorId(@PathVariable("id") int id ) {
		return service.listColegioId(id);
	}
	
	@PutMapping("/colegio/{id}")
	public Colegio editar(@PathVariable("id") int id, @RequestBody Colegio colegio) {
		service.editar(id, colegio);
		return service.listColegioId(id);
	}
	
	@DeleteMapping("/colegio/{id}")
	public List<Colegio> eliminar(@PathVariable("id") int id) {
		service.delete(id);
		return service.listar();
	}
	
}

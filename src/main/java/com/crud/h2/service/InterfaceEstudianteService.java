package com.crud.h2.service;

import java.util.List;

import com.crud.h2.modelo.Estudiante;

public interface InterfaceEstudianteService {
	public List<Estudiante>listar();
	
	public Estudiante listEstudianteId(int id);
	
	public int agregar(Estudiante estudiante);
	
	public int editar(int id, Estudiante estudiante);
	
	public void delete(int id);
}

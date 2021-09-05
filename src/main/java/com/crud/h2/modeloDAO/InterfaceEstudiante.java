package com.crud.h2.modeloDAO;

import java.util.List;

import com.crud.h2.modelo.Estudiante;


public interface InterfaceEstudiante {
	public List<Estudiante>listar();
	
	public Estudiante listEstudianteId(int id);
	
	public int agregar(Estudiante estudiante);
	
	public int editar(int id, Estudiante estudiante);
	
	public void delete(int id);
}

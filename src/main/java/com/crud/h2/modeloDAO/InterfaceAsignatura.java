package com.crud.h2.modeloDAO;

import java.util.List;

import com.crud.h2.modelo.Asignatura;


public interface InterfaceAsignatura {
	public List<Asignatura>listar();
	
	public Asignatura listAsignaturaId(int id);
	
	public int agregar(Asignatura asignatura);
	
	public int editar(int id, Asignatura asignatura);
	
	public void delete(int id);
}

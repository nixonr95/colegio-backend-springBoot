package com.crud.h2.modeloDAO;

import java.util.List;

import com.crud.h2.modelo.Profesor;


public interface InterfaceProfesor {
	public List<Profesor>listar();
	
	public Profesor listProfesorId(int id);
	
	public int agregar(Profesor profesor);
	
	public int editar(int id, Profesor profesor);
	
	public void delete(int id);
}

package com.crud.h2.service;

import java.util.List;

import com.crud.h2.modelo.Curso;

public interface InterfaceCursoService {
	public List<Curso>listar();
	
	public Curso listCursoId(int id);
	
	public int agregar(Curso curso);
	
	public int editar(int id, Curso curso);
	
	public void delete(int id);
}

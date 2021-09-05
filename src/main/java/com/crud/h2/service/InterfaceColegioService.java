package com.crud.h2.service;

import java.util.List;

import com.crud.h2.modelo.Colegio;

public interface InterfaceColegioService {
	public List<Colegio>listar();
	
	public Colegio listColegioId(int id);
	
	public int agregar(Colegio colegio);
	
	public int editar(int id, Colegio colegio);
	
	public void delete(int id);
}

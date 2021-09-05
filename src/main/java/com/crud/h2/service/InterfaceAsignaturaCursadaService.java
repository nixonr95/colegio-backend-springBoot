package com.crud.h2.service;

import java.util.List;

import com.crud.h2.modelo.AsignaturaCursada;

public interface InterfaceAsignaturaCursadaService {
	public List<AsignaturaCursada>listar();
	
	public AsignaturaCursada listAsignaturaCursadaId(int id);
	
	public int agregar(AsignaturaCursada asignaturaCursada);
	
	public int editar(int id, AsignaturaCursada asignaturaCursada);
	
	public void delete(int id);
}

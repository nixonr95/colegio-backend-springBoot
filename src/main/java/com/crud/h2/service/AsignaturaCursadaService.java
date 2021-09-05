package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.modelo.AsignaturaCursada;
import com.crud.h2.modeloDAO.InterfaceAsignaturaCursada;

@Service
public class AsignaturaCursadaService implements InterfaceAsignaturaCursadaService {
	
	@Autowired
	private InterfaceAsignaturaCursada dao;

	@Override
	public List<AsignaturaCursada> listar() {
		// TODO Auto-generated method stub
		return dao.listar();
	}

	@Override
	public AsignaturaCursada listAsignaturaCursadaId(int id) {
		// TODO Auto-generated method stub
		return dao.listAsignaturaCursadaId(id);
	}

	@Override
	public int agregar(AsignaturaCursada asignaturaCursada) {
		dao.agregar(asignaturaCursada);
		return 0;
	}

	@Override
	public int editar(int id, AsignaturaCursada asignaturaCursada) {
		dao.editar(id, asignaturaCursada);
		return 0;
	}

	@Override
	public void delete(int id) {
		dao.delete(id);
		
	}

}

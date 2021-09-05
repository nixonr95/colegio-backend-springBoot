package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.modelo.Asignatura;
import com.crud.h2.modeloDAO.InterfaceAsignatura;

@Service
public class AsignaturaService implements InterfaceAsignaturaService{
	
	@Autowired
	private InterfaceAsignatura dao;

	@Override
	public List<Asignatura> listar() {
		// TODO Auto-generated method stub
		return dao.listar();
	}

	@Override
	public Asignatura listAsignaturaId(int id) {
		// TODO Auto-generated method stub
		return dao.listAsignaturaId(id);
	}

	@Override
	public int agregar(Asignatura asignatura) {
		dao.agregar(asignatura);
		return 0;
	}

	@Override
	public int editar(int id, Asignatura asignatura) {
		dao.editar(id, asignatura);
		return 0;
	}

	@Override
	public void delete(int id) {
		dao.delete(id);
		
	}
}

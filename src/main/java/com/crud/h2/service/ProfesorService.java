package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.modelo.Profesor;
import com.crud.h2.modeloDAO.InterfaceProfesor;

@Service
public class ProfesorService implements InterfaceProfesorService {

	@Autowired
	private InterfaceProfesor dao;
	
	@Override
	public List<Profesor> listar() {
		// TODO Auto-generated method stub
		return dao.listar();
	}

	@Override
	public Profesor listProfesorId(int id) {
		
		return dao.listProfesorId(id);
	}

	@Override
	public int agregar(Profesor profesor) {
		dao.agregar(profesor);
		return 0;
	}

	@Override
	public int editar(int id, Profesor profesor) {
		dao.editar(id, profesor);
		return 0;
	}

	@Override
	public void delete(int id) {
		dao.delete(id);
		
	}
	
}

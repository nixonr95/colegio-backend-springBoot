package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.modelo.Estudiante;
import com.crud.h2.modeloDAO.InterfaceEstudiante;

@Service
public class EstudianteService implements InterfaceEstudianteService {

	@Autowired
	private InterfaceEstudiante dao;
	
	@Override
	public List<Estudiante> listar() {
		// TODO Auto-generated method stub
		return dao.listar();
	}

	@Override
	public Estudiante listEstudianteId(int id) {
		// TODO Auto-generated method stub
		return dao.listEstudianteId(id);
	}

	@Override
	public int agregar(Estudiante estudiante) {
		dao.agregar(estudiante);
		return 0;
	}

	@Override
	public int editar(int id, Estudiante estudiante) {
		dao.editar(id, estudiante);
		return 0;
	}

	@Override
	public void delete(int id) {
		dao.delete(id);
		
	}
	
}

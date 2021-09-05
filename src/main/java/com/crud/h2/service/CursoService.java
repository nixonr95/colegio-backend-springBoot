package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.modelo.Curso;
import com.crud.h2.modeloDAO.InterfaceCurso;

@Service
public class CursoService implements InterfaceCursoService {

	@Autowired
	private InterfaceCurso dao;
	
	@Override
	public List<Curso> listar() {
		// TODO Auto-generated method stub
		return dao.listar();
	}

	@Override
	public Curso listCursoId(int id) {
		// TODO Auto-generated method stub
		return dao.listCursoId(id);
	}

	@Override
	public int agregar(Curso curso) {
		dao.agregar(curso);
		return 0;
	}

	@Override
	public int editar(int id, Curso curso) {
		dao.editar(id, curso);
		return 0;
	}

	@Override
	public void delete(int id) {
		dao.delete(id);
		
	}

}

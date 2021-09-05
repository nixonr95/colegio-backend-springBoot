package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.modelo.Colegio;
import com.crud.h2.modeloDAO.InterfaceColegio;

@Service
public class ColegioService implements InterfaceColegioService{

	@Autowired
	private InterfaceColegio dao;
	
	@Override
	public List<Colegio> listar() {
		// TODO Auto-generated method stub
		return dao.listar();
	}

	@Override
	public Colegio listColegioId(int id) {
		// TODO Auto-generated method stub
		return dao.listColegioId(id);
	}

	@Override
	public int agregar(Colegio colegio) {
		dao.agregar(colegio);
		return 0;
	}

	@Override
	public int editar(int id, Colegio colegio) {
		dao.editar(id, colegio);
		return 0;
	}

	@Override
	public void delete(int id) {
		dao.delete(id);
		
	}

}

package com.crud.h2.modeloDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.crud.h2.modelo.Colegio;

@Repository
public class ColegioDAO implements InterfaceColegio{
	
	@Autowired
	private JdbcTemplate template;

	@Override
	public List<Colegio> listar() {
		String sql = "select * from colegios";
		List<Colegio>colegios=template.query(sql, new BeanPropertyRowMapper<Colegio>(Colegio.class));
		return colegios;
	}

	@Override
	public Colegio listColegioId(int id) {
		String sql = "select * from colegios where id_colegio=?";
		Colegio colegio = template.queryForObject(sql, new BeanPropertyRowMapper<Colegio>(Colegio.class), new Object[] {id});
		return colegio;
	}

	@Override
	public int agregar(Colegio colegio) {
		String sql="insert into colegios(name_colegio)values(?)";
		int res = template.update(sql, colegio.getName_colegio());
		return res;
	}

	@Override
	public int editar(int id, Colegio colegio) {
		String sql = "update colegios set name_colegio=? where id_colegio=?";
		int res = template.update(sql, colegio.getName_colegio(), id);
		return res;
	}

	@Override
	public void delete(int id) {
		String sql = "delete from colegios where id_colegio=?";
		template.update(sql, id);
		
	}

}

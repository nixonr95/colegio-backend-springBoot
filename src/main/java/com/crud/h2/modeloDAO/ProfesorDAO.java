package com.crud.h2.modeloDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.crud.h2.modelo.Profesor;

@Repository
public class ProfesorDAO implements InterfaceProfesor{
	
	@Autowired
	private JdbcTemplate template;

	@Override
	public List<Profesor> listar() {
		String sql = "select * from profesores";
		List<Profesor>profesores=template.query(sql, new BeanPropertyRowMapper<Profesor>(Profesor.class));
		return profesores;
	}

	@Override
	public Profesor listProfesorId(int id) {
		String sql = "select * from profesores where id_profesor=?";
		Profesor profesor = template.queryForObject(sql, new BeanPropertyRowMapper<Profesor>(Profesor.class), new Object[] {id});
		return profesor;
	}

	@Override
	public int agregar(Profesor profesor) {
		String sql="insert into profesores(name_profesor)values(?)";
		int res = template.update(sql, profesor.getName_profesor());
		return res;
	}

	@Override
	public int editar(int id, Profesor profesor) {
		String sql = "update profesores set name_profesor=? where id_profesor=?";
		int res = template.update(sql, profesor.getName_profesor(), id);
		return res;
	}

	@Override
	public void delete(int id) {
		String sql = "delete from profesores where id_profesor=?";
		template.update(sql, id);
		
	}

}

package com.crud.h2.modeloDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.crud.h2.modelo.Estudiante;

@Repository
public class EstudianteDAO implements InterfaceEstudiante{
	
	@Autowired
	private JdbcTemplate template;

	@Override
	public List<Estudiante> listar() {
		String sql = "select * from estudiantes";
		List<Estudiante>estudiantes=template.query(sql, new BeanPropertyRowMapper<Estudiante>(Estudiante.class));
		return estudiantes;
	}

	@Override
	public Estudiante listEstudianteId(int id) {
		String sql = "select * from estudiantes where id_estudiante=?";
		Estudiante estudiante = template.queryForObject(sql, new BeanPropertyRowMapper<Estudiante>(Estudiante.class), new Object[] {id});
		return estudiante;
	}

	@Override
	public int agregar(Estudiante estudiante) {
		String sql="insert into estudiantes(name_estudiante)values(?)";
		int res = template.update(sql, estudiante.getName_estudiante());
		return res;
	}

	@Override
	public int editar(int id, Estudiante estudiante) {
		String sql = "update estudiantes set name_estudiante=? where id_estudiante=?";
		int res = template.update(sql, estudiante.getName_estudiante(), id);
		return res;
	}

	@Override
	public void delete(int id) {
		String sql = "delete from estudiantes where id_estudiante=?";
		template.update(sql, id);
		
	}

}

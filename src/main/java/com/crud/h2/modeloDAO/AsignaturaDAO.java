package com.crud.h2.modeloDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.crud.h2.modelo.Asignatura;

@Repository
public class AsignaturaDAO implements InterfaceAsignatura{
	
	@Autowired
	private JdbcTemplate template;

	@Override
	public List<Asignatura> listar() {
		String sql = "select * from asignaturas";
		List<Asignatura>asignaturas=template.query(sql, new BeanPropertyRowMapper<Asignatura>(Asignatura.class));
		return asignaturas;
	}

	@Override
	public Asignatura listAsignaturaId(int id) {
		String sql = "select * from asignaturas where id_asignatura=?";
		Asignatura asignatura = template.queryForObject(sql, new BeanPropertyRowMapper<Asignatura>(Asignatura.class), new Object[] {id});
		return asignatura;
	}

	@Override
	public int agregar(Asignatura asignatura) {
		String sql="insert into asignaturas(name_asignatura, id_profesor, id_curso)values(?,?,?)";
		int res = template.update(sql, asignatura.getName_asignatura(), asignatura.getId_profesor(), asignatura.getId_curso());
		return res;
	}

	@Override
	public int editar(int id, Asignatura asignatura) {
		String sql = "update asignaturas set name_asignatura=?, id_profesor=?, id_curso=? where id_asignatura=?";
		int res = template.update(sql, asignatura.getName_asignatura(), asignatura.getId_profesor(), asignatura.getId_curso(), id);
		return res;
	}

	@Override
	public void delete(int id) {
		String sql = "delete from asignaturas where id_asignatura=?";
		template.update(sql, id);
		
	}

}

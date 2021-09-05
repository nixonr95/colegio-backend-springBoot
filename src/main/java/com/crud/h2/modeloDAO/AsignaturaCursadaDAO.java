package com.crud.h2.modeloDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.crud.h2.modelo.AsignaturaCursada;

@Repository
public class AsignaturaCursadaDAO implements InterfaceAsignaturaCursada {
	
	@Autowired
	private JdbcTemplate template;

	@Override
	public List<AsignaturaCursada> listar() {
		String sql = "select * from asignaturas_cursadas";
		List<AsignaturaCursada>asignaturasCursadas=template.query(sql, new BeanPropertyRowMapper<AsignaturaCursada>(AsignaturaCursada.class));
		return asignaturasCursadas;
	}

	@Override
	public AsignaturaCursada listAsignaturaCursadaId(int id) {
		String sql = "select * from asignaturas_cursadas where id_asignaturas_cursadas=?";
		AsignaturaCursada asignaturaCursada = template.queryForObject(sql, new BeanPropertyRowMapper<AsignaturaCursada>(AsignaturaCursada.class), new Object[] {id});
		return asignaturaCursada;
	}

	@Override
	public int agregar(AsignaturaCursada asignaturaCursada) {
		String sql="insert into asignaturas_cursadas(id_asignatura, id_estudiante)values(?,?)";
		int res = template.update(sql, asignaturaCursada.getId_asignatura(), asignaturaCursada.getId_estudiante());
		return res;
	}

	@Override
	public int editar(int id, AsignaturaCursada asignaturaCursada) {
		String sql = "update asignaturas_cursadas set id_asignatura=?, id_estudiante=? where id_asignaturas_cursadas=?";
		int res = template.update(sql, asignaturaCursada.getId_asignatura(), asignaturaCursada.getId_estudiante(), id);
		return res;
	}

	@Override
	public void delete(int id) {
		String sql = "delete from asignaturas_cursadas where id_asignaturas_cursadas=?";
		template.update(sql, id);
		
	}

}

package com.crud.h2.modeloDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.crud.h2.modelo.Curso;

@Repository
public class CursoDAO implements InterfaceCurso{
	
	@Autowired
	private JdbcTemplate template;

	@Override
	public List<Curso> listar() {
		String sql = "select * from cursos";
		List<Curso>cursos=template.query(sql, new BeanPropertyRowMapper<Curso>(Curso.class));
		return cursos;
	}

	@Override
	public Curso listCursoId(int id) {
		String sql = "select * from cursos where id_curso=?";
		Curso curso = template.queryForObject(sql, new BeanPropertyRowMapper<Curso>(Curso.class), new Object[] {id});
		return curso;
	}

	@Override
	public int agregar(Curso curso) {
		String sql="insert into cursos(salon, grado, id_colegio)values(?,?,?)";
		int res = template.update(sql, curso.getSalon(), curso.getGrado(), curso.getId_colegio());
		return res;
	}

	@Override
	public int editar(int id,Curso curso) {
		String sql = "update cursos set grado=?, salon=?, id_colegio=? where id_curso=?";
		int res = template.update(sql, curso.getGrado(), curso.getSalon(),curso.getId_colegio() , id);
		return res;
	}

	@Override
	public void delete(int id) {
		String sql = "delete from cursos where id_curso=?";
		template.update(sql, id);
		
	}

}

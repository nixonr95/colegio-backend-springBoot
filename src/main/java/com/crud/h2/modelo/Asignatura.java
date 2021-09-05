package com.crud.h2.modelo;

public class Asignatura {
	private int id_asignatura;
	private String name_asignatura;
	private int id_profesor;
	private int id_curso;
	
	public Asignatura() {
		
	}

	public Asignatura(int id_asignatura, String name_asignatura, int id_profesor, int id_curso) {
		super();
		this.id_asignatura = id_asignatura;
		this.name_asignatura = name_asignatura;
		this.id_profesor = id_profesor;
		this.id_curso = id_curso;
	}

	public int getId_asignatura() {
		return id_asignatura;
	}

	public void setId_asignatura(int id_asignatura) {
		this.id_asignatura = id_asignatura;
	}

	public String getName_asignatura() {
		return name_asignatura;
	}

	public void setName_asignatura(String name_asignatura) {
		this.name_asignatura = name_asignatura;
	}

	public int getId_profesor() {
		return id_profesor;
	}

	public void setId_profesor(int id_profesor) {
		this.id_profesor = id_profesor;
	}

	public int getId_curso() {
		return id_curso;
	}

	public void setId_curso(int id_curso) {
		this.id_curso = id_curso;
	}

	
}

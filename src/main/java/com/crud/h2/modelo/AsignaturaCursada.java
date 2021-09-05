package com.crud.h2.modelo;

public class AsignaturaCursada {
	private int id_asignaturas_cursadas;
	private int id_asignatura;
	private int id_estudiante;
	
	public AsignaturaCursada() {
		
	}

	public AsignaturaCursada(int id_asignaturas_cursadas, int id_asignatura, int id_estudiante) {
		super();
		this.id_asignaturas_cursadas = id_asignaturas_cursadas;
		this.id_asignatura = id_asignatura;
		this.id_estudiante = id_estudiante;
	}

	public int getId_asignaturas_cursadas() {
		return id_asignaturas_cursadas;
	}

	public void setId_asignaturas_cursadas(int id_asignaturas_cursadas) {
		this.id_asignaturas_cursadas = id_asignaturas_cursadas;
	}

	public int getId_asignatura() {
		return id_asignatura;
	}

	public void setId_asignatura(int id_asignatura) {
		this.id_asignatura = id_asignatura;
	}

	public int getId_estudiante() {
		return id_estudiante;
	}

	public void setId_estudiante(int id_estudiante) {
		this.id_estudiante = id_estudiante;
	}
	
	
	
}

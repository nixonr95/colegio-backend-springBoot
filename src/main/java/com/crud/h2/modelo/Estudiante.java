package com.crud.h2.modelo;


public class Estudiante {
	private int id_estudiante;
	private String name_estudiante;
	
	public Estudiante() {
		
	}

	public Estudiante(int id_estudiante, String name_estudiante) {
		super();
		this.id_estudiante = id_estudiante;
		this.name_estudiante = name_estudiante;
	}

	public int getId_estudiante() {
		return id_estudiante;
	}

	public void setId_estudiante(int id_estudiante) {
		this.id_estudiante = id_estudiante;
	}

	public String getName_estudiante() {
		return name_estudiante;
	}

	public void setName_estudiante(String name_estudiante) {
		this.name_estudiante = name_estudiante;
	}


	
}

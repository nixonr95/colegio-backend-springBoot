package com.crud.h2.modelo;

public class Curso {
	private int id_curso;
	private String salon;
	private int grado;
	private int id_colegio;
	
	public Curso() {
		
	}

	public int getId_colegio() {
		return id_colegio;
	}

	public void setId_colegio(int id_colegio) {
		this.id_colegio = id_colegio;
	}

	public Curso(int id_curso, String salon, int grado, int id_colegio) {
		super();
		this.id_curso = id_curso;
		this.salon = salon;
		this.grado = grado;
		this.id_colegio = id_colegio;
	}



	public int getId_curso() {
		return id_curso;
	}

	public void setId_curso(int id_curso) {
		this.id_curso = id_curso;
	}

	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	public String getSalon() {
		return salon;
	}

	public void setSalon(String salon) {
		this.salon = salon;
	}

}

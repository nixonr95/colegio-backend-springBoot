package com.crud.h2.modelo;


public class Colegio {
	private int id_colegio;
	private String name_colegio;
	
	public Colegio() {
		
	}

	public Colegio(int id_colegio, String name_colegio) {
		super();
		this.id_colegio = id_colegio;
		this.name_colegio = name_colegio;
	}

	public int getId_colegio() {
		return id_colegio;
	}

	public void setId_colegio(int id_colegio) {
		this.id_colegio = id_colegio;
	}

	public String getName_colegio() {
		return name_colegio;
	}

	public void setName_colegio(String name_colegio) {
		this.name_colegio = name_colegio;
	}

	
}

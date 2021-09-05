package com.crud.h2.modelo;


public class Profesor {
	private int id_profesor;
	private String name_profesor;
	
	public Profesor() {
		
	}

	public Profesor(int id_profesor, String name_profesor) {
		super();
		this.id_profesor = id_profesor;
		this.name_profesor = name_profesor;
	}

	public int getId_profesor() {
		return id_profesor;
	}

	public void setId_profesor(int id_profesor) {
		this.id_profesor = id_profesor;
	}

	public String getName_profesor() {
		return name_profesor;
	}

	public void setName_profesor(String name_profesor) {
		this.name_profesor = name_profesor;
	}
	
}

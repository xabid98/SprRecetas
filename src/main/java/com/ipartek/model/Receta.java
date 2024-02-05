package com.ipartek.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "recetas")
public class Receta {

	@Id // primary key y not null
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	@ManyToOne
	private Dificultad dificultad;
	
	
	
	/*  --==## borrar de aqui para abajo si hay cambios y regenerar ##==-- */

	public Receta(int id, String nombre, Dificultad dificultad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.dificultad = dificultad;
	}
	
	public Receta() {
		super();
		this.id = id;
		this.nombre = nombre;
		this.dificultad =new Dificultad();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Dificultad getDificultad() {
		return dificultad;
	}

	public void setDificultad(Dificultad dificultad) {
		this.dificultad = dificultad;
	}

	@Override
	public String toString() {
		return "Receta [id=" + id + ", nombre=" + nombre + ", dificultad=" + dificultad + "]";
	}
	
	
}

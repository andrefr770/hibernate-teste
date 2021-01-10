package com.example.teste.hibernate.teste.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "ANIMAL", uniqueConstraints = {@UniqueConstraint(columnNames = {"DEPT_NO"})})
public class Animal {
	
	private String id;
	private String name;
	private String dono;
	private String tipo_de_animal;
	//private Set<Animal> animal = new HashSet<Animal>(0); hashSet para fazer as ligações many to many
	
	@Id
	@Column(name="id")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="dono")
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	
	@Column(name="tipo_de_animal")
	public String getTipo_de_animal() {
		return tipo_de_animal;
	}
	public void setTipo_de_animal(String tipo_de_animal) {
		this.tipo_de_animal = tipo_de_animal;
	}
}

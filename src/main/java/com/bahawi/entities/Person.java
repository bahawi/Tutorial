package com.bahawi.entities;


import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "PERSON2")
public class Person {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id=1;
	@Column
	private String nom;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Person(String nom) {
		this.nom = nom;
	}
	public Person() {
	
	}
	
	

}

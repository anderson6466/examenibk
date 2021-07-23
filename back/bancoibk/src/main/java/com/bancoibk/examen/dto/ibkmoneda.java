package com.bancoibk.examen.dto;

import java.io.Serializable;

import javax.persistence.Entity;
 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
 
import javax.persistence.*;
 
 

import lombok.Getter;
import lombok.Setter;
 



@Entity
@Table(name = "ibkmoneda")
 
public class ibkmoneda   implements Serializable   {
 	
 
@Id
  @GeneratedValue(strategy = GenerationType.AUTO)
private long  id;
 
public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getCod() {
	return cod;
}

public void setCod(String cod) {
	this.cod = cod;
}

private String  nombre ;
 
private String  cod ;
	
	
	
	
	
	
	
	
}

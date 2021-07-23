package com.bancoibk.examen.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ibktipocambio")
public class ibktipocambio    implements Serializable  {

@Id
  @GeneratedValue(strategy = GenerationType.AUTO)
private long  id;




public long getId() {
	return id;
}


public void setId(long id) {
	this.id = id;
}


public String getIbkde() {
	return ibkde;
}


public void setIbkde(String ibkde) {
	this.ibkde = ibkde;
}


public String getIbkto() {
	return ibkto;
}


public void setIbkto(String ibkto) {
	this.ibkto = ibkto;
}


public String getIbkvalor() {
	return ibkvalor;
}


public void setIbkvalor(String ibkvalor) {
	this.ibkvalor = ibkvalor;
}


private String  ibkde ;
 
private String  ibkto ;
 

private String  ibkvalor ;
}

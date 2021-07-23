package com.bancoibk.examen.dto;

import lombok.Getter;
import lombok.Setter;

public class requestdto {

 
private  double monto;

	
	 
public double getMonto() {
	return monto;
}


public void setMonto(double monto) {
	this.monto = monto;
}


public String getMoneda() {
	return moneda;
}


public void setMoneda(String moneda) {
	this.moneda = moneda;
}


public String getCod() {
	return cod;
}


public void setCod(String cod) {
	this.cod = cod;
}


private  String moneda;
	
	 
private  String cod;
	
	
 
	
	
}

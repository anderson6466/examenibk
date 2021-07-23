package com.bancoibk.examen.logica;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bancoibk.examen.dto.ibkmoneda;
import com.bancoibk.examen.dto.ibktipocambio;
import com.bancoibk.examen.dto.requestdto;
import com.bancoibk.examen.repository.ibkmonedaInterface;
import com.bancoibk.examen.repository.ibktipodecambiointerface;

@Service("tipocambioInterface")
@Transactional
public class tipocambioImplement implements tipocambioInterface{

	@Autowired
	private ibkmonedaInterface IbkmonedaInterface;
	@Autowired
	private ibktipodecambiointerface Ibktipodecambiointerface;
	
	
	@Override
	public String operaciontipoCambio(requestdto Requestdto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addmoneda(requestdto Requestdto) {
		// TODO Auto-generated method stub
		 
	 	ibkmoneda ibkmon= new ibkmoneda();
		ibkmon.setCod(Requestdto.getCod());
		ibkmon.setNombre(Requestdto.getMoneda());
		IbkmonedaInterface.save(ibkmon); 
		return "Moneda Ingresada";
	}

	@Override
	public String addtipodecambio(ibktipocambio Requestdto) {
	
		
		
		
		Ibktipodecambiointerface.save(Requestdto);
		
		
		return "Agregado";
	}

	@Override
	public List<ibkmoneda> listmoneda() {
		// TODO Auto-generated method stub
		
		
		
		return IbkmonedaInterface.findAll(); 
	}

	@Override
	public String operaciontipocambio(ibktipocambio Ibktipocambio) {
	 
		
		try	{
		
	String tipocambio=	Ibktipodecambiointerface.obttipocambio(Ibktipocambio.getIbkde(), Ibktipocambio.getIbkto());
		
	if(tipocambio.isEmpty()) {
		
		return "Tipo de Cambio no existe" ; 
		
	} else {
		
		if(Ibktipocambio.getIbkvalor()=="") {
			
			return "Falta  ingresar monto a convertir" ; 
			
		} else {
		
	double  valorfinal=  Double.parseDouble( Ibktipocambio.getIbkvalor() ) / Double.parseDouble(tipocambio);
	
		return String.valueOf(valorfinal) ; 
		}
	}
	
		} catch (Exception ex )	{
			
			
			return "Tipo de Cambio no existe" ;  
			
			
		}
	
	
	}

}

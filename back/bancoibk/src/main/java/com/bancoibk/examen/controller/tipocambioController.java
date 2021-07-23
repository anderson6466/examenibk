package com.bancoibk.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bancoibk.examen.dto.ibkmoneda;
import com.bancoibk.examen.dto.ibktipocambio;
import com.bancoibk.examen.dto.requestdto;
import com.bancoibk.examen.logica.tipocambioInterface;

@RestController
@RequestMapping("/mantenimiento")
public class tipocambioController {
	
	
	
	@Autowired
	private tipocambioInterface TipocambioInterface;
	
	
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/tipocambio", method=RequestMethod.POST)
	public String tipocambio(@RequestBody requestdto Requestdto){
	   
		
		
		
	    return TipocambioInterface.operaciontipoCambio(Requestdto);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/addmoneda", method=RequestMethod.POST)
	public String addmoneda(@RequestBody requestdto Requestdto){
	    
	    return TipocambioInterface.addmoneda(Requestdto);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/addtipocambio", method=RequestMethod.POST)
	public String addtipocambio(@RequestBody ibktipocambio Requestdto){
	    
	    return TipocambioInterface.addtipodecambio(Requestdto) ;
	}
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/listmoneda", method=RequestMethod.GET)
	public List< ibkmoneda >  listmoneda( ){
	    
	    return TipocambioInterface.listmoneda();
	}
	
	
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/operaciontipocambio", method=RequestMethod.POST)
	public String   operaciontipocambio(@RequestBody ibktipocambio Requestdto ){
	    
	    return TipocambioInterface.operaciontipocambio(  Requestdto);
	}
	
}

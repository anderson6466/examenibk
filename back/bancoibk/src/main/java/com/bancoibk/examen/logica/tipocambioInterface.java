package com.bancoibk.examen.logica;

import java.util.List;

import com.bancoibk.examen.dto.ibkmoneda;
import com.bancoibk.examen.dto.ibktipocambio;
import com.bancoibk.examen.dto.requestdto;

public interface tipocambioInterface {

	
	public String  operaciontipoCambio(requestdto Requestdto);
	public String addmoneda (requestdto Requestdto);
	public String addtipodecambio (ibktipocambio Requestdto);
	
	public List<ibkmoneda> listmoneda ( );
	public String  operaciontipocambio    (ibktipocambio Ibktipocambio );
}

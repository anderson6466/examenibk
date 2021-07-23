package com.bancoibk.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.bancoibk.examen.dto.ibktipocambio;

@Repository
public interface ibktipodecambiointerface  extends JpaRepository<ibktipocambio, Long> {

	
	@Query(value ="select IBKVALOR   FROM ibktipocambio    where ibkde =:ikde and ibkto=:ikto  limit 1 ",nativeQuery  = true)
	public String    obttipocambio (String ikde, String ikto);
	
	
}

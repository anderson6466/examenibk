package com.bancoibk.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bancoibk.examen.dto.ibkmoneda;

@Repository
public interface ibkmonedaInterface   extends JpaRepository<ibkmoneda, Long>  {

}

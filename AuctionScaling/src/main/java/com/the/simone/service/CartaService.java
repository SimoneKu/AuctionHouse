package com.the.simone.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.the.simone.model.Carta;

public interface CartaService extends CrudRepository<Carta, Long>{
	
	List<Carta> findByCodice(String codice);
}

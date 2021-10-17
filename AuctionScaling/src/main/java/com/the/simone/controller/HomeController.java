package com.the.simone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.the.simone.model.Carta;
import com.the.simone.service.CartaService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HomeController {
	
	@Autowired
	CartaService cartaService;
	
	@GetMapping("/carta")
    public List<Carta> getCarta() {
        return (List<Carta>) cartaService.findAll();
    }

    @PostMapping("/carta")
    void addCarta(@RequestBody Carta carta) {
        cartaService.save(carta);
    }
    
//    @PostMapping("/ricerca")
//    public List<Carta> ricerca(@RequestParam String codice) {
//        cartaService.findByCodice(codice);
//        return (List<Carta>) cartaService.findByCodice(codice);
//    }
    
//    @PostMapping("/cerca")
//    public List<Carta> ricerca(@RequestBody String codice) {
//    	return (List<Carta>) cartaService.findByCodice(codice);
//    }
//    @GetMapping("/cerca")
//    public List<Carta> ricerca2(@RequestBody String codice) {
//    	return (List<Carta>) cartaService.findByCodice(codice);
//    }
    
//    @RequestMapping(method = RequestMethod.GET, value = "/cerca")
//    public List<Carta> cerca(@RequestParam(value = "search") String search){
//    	return (List<Carta>) cartaService.findByCodice(search);
//    	
//    }
    
    @GetMapping("/cerca/{codice}")
    public List<Carta> getReport(@PathVariable (name="codice") String codice) {
    return  (List<Carta>) cartaService.findByCodice(codice);
    }

}

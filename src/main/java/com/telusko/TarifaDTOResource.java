package com.telusko;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TarifaDTOResource {

	@RequestMapping("tarifas")
	public List<TarifaDTO> getAliens(){
		List<TarifaDTO> tarifas = new ArrayList<>();
		
		String cdr1="11111";
		String cdr2="22222";
		String cdr3="33333";
		String cdr4="44444";
		
		List<String> cdrs1 = new ArrayList<>();
		List<String> cdrs2 = new ArrayList<>();
		
		cdrs1.add(cdr1);
		cdrs1.add(cdr2);
		cdrs2.add(cdr3);
		cdrs2.add(cdr4);
		
		String linea1="70711111";
		String linea2="70722222";
		
		String nombre1="aaaaaaa";
		String nombre2="bbbbbbb";
		
		tarifas.add(new TarifaDTO(nombre1,linea1,cdrs1));
		tarifas.add(new TarifaDTO(nombre2,linea2,cdrs2));
		return tarifas;
	}
}

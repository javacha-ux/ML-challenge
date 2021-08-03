package com.javacha.demos.mlchallenge.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javacha.demos.mlchallenge.model.Dna;

@RestController 
@RequestMapping("mutant")
public class MutantController {
	
	@RequestMapping("")
	public String mutant(@RequestBody Dna dna) throws Exception {
		validaSecuenciaADN(dna);
		dump(dna);
		return "true";			
	}
	
	
	private void validaSecuenciaADN(Dna dna) throws Exception {
		int cantItemsSecuencia = dna.getDna().length;
		for (int i = 0; i < dna.getDna().length; i++) {
			String secuencia = dna.getDna()[i];
			
			if (secuencia.length() != cantItemsSecuencia)
				throw new Exception("secuencia ADN errónea");
			
			System.out.println(secuencia);
		}		
	}
	
	
	private void dump(Dna dna) {
		for (int i = 0; i < dna.getDna().length; i++) {
			String secuencia = dna.getDna()[i];
			System.out.println(secuencia);
		}		
	}
}

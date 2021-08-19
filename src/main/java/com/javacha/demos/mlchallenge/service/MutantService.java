package com.javacha.demos.mlchallenge.service;

import java.util.Iterator;

import com.javacha.demos.mlchallenge.mutante.BuscadorDiagAscendente;
import com.javacha.demos.mlchallenge.mutante.BuscadorDiagDescendente;
import com.javacha.demos.mlchallenge.mutante.BuscadorHorizontal;
import com.javacha.demos.mlchallenge.mutante.BuscadorVertical;
import com.javacha.demos.mlchallenge.mutante.IBuscadorMutante;
import com.javacha.demos.mlchallenge.mutante.Mutante;

public class MutantService {

	int CANT_SECUENCIAS_MUTANTES = 2 ;
	
	

	/**
	 * Verifico que sea una matriz cuadrada, y que sean caracteres válidos
	 * @param dna
	 * @return true si es un dna valido
	 */
	boolean validaDna(String[] dna) {
		for (int seq = 0; seq < dna.length; seq++) {
			if (dna.length != dna[seq].length() )
				return false;
			
			for (int base = 0; base < dna.length; base++) {
				if (!Mutante.baseNitrogenadaValida(dna[seq].charAt(base))) {
					return false;
				}			
			}						
		}
		return true;
	}		
	
	
	

	int buscaSecuenciasMutantes(String[] dna) {
		int cantSecuenciasMutantes = 0 ;
		
		IBuscadorMutante[] buscadores = { new BuscadorHorizontal(),
										  new BuscadorVertical(),
										  new BuscadorDiagDescendente(),
										  new BuscadorDiagAscendente() } ;
		
		for (IBuscadorMutante buscadorMutante : buscadores) {
			cantSecuenciasMutantes += buscadorMutante.buscarMutante(dna) ;
		}
				
		return cantSecuenciasMutantes;
	}
	

	
	public boolean isMutant(String[] dna) {
		return validaDna(dna)  &&  buscaSecuenciasMutantes(dna) >= CANT_SECUENCIAS_MUTANTES ;
	}

	
	
		



		
	public static void main(String[] args) {
		String[] dna = {  "GTCACCAGAG", "TGAAACTATC", "CTCTGAGTAA", "AGCGTGTCCA", "TGTGCTCAAC", "CTAGGACTTA", "AAGGGGGGGG", "TAATGCAATA", "GGATTTAGAC", "TTCAATGGCG" };
		
		MutantService mut = new MutantService();
		TimeTrack tt = new TimeTrack();
	
		
		System.out.println(mut.isMutant(dna));
		
		
		
		//boolean valido = mut.validaDna(dna);	
		
		
		
	}
	

}



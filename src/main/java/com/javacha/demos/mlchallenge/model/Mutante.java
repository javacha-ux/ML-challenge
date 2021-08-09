package com.javacha.demos.mlchallenge.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Mutante {

	

	static int MUTANT_SEQUENCE_LENGTH = 4 ;
	
	static Set<Character> baseValida = new HashSet<Character>(Arrays.asList('A', 'C', 'G', 'T'));
	
	
	public static int getMutantSequenceLength() {
		return MUTANT_SEQUENCE_LENGTH;
	}
	
	public static Set<Character> getBaseNitrogenada() {
		return baseValida;
	}
	
	
	public static boolean baseNitrogenadaValida(char base) {
		return baseValida.contains(base); 
		
	}
	
	
	public static int buscaSecuenciaMutante(String seq) {
		char ant = ' ', act = ' ' ;
		int sameCharCount = 1;
		int cantSecuenciasMutantes = 0;
		for (int i = 0; i < seq.length() && sameCharCount < MUTANT_SEQUENCE_LENGTH; i++) {
			act = seq.charAt(i);
			if (ant != act) {
				ant = act ;				
				sameCharCount=1;
			}
			else
				sameCharCount++;
			
			
			if (sameCharCount == MUTANT_SEQUENCE_LENGTH) {
				cantSecuenciasMutantes++;
				sameCharCount=1;
				ant = ' ';
			}
		}
		return cantSecuenciasMutantes;
	}
	
}

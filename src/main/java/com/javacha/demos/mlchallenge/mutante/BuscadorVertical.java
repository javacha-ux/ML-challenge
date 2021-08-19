package com.javacha.demos.mlchallenge.mutante;

public class BuscadorVertical implements IBuscadorMutante {

	
	public int buscarMutante(String[] dna) {
		int cantMutantes=0;
		for (int i = 0; i < dna.length ; i++) {
			cantMutantes += Mutante.buscaSecuenciaMutante(getSecuenciaVertical(dna, i));			
		}
		return cantMutantes;
	}	
	
	String getSecuenciaVertical(String[] dna, int col ) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < dna.length; i++) {
			sb.append(dna[i].charAt(col));
		}
		return sb.toString();
	}	
			
	
	
	
}

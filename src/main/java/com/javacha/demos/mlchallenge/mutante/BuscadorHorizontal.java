package com.javacha.demos.mlchallenge.mutante;

public class BuscadorHorizontal implements IBuscadorMutante {

	
	public int buscarMutante(String[] dna) {
		int cantMutantes=0;
		for (int i = 0; i < dna.length ; i++) {
			cantMutantes += Mutante.buscaSecuenciaMutante(getSecuenciaHorizontal(dna, i));			
		}
		return cantMutantes;
	}
	
	
	String getSecuenciaHorizontal(String[] dna, int row ) {
		return dna[row];
	}	
	
}

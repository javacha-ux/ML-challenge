package com.javacha.demos.mlchallenge.mutante;

public class BuscadorDiagDescendente implements IBuscadorMutante {

	
	public int buscarMutante(String[] dna) {
		int cantSeqMutantes=0;
		
		for (int x = dna.length - Mutante.getMutantSequenceLength(); x >= 0 ; x--) {
			cantSeqMutantes += Mutante.buscaSecuenciaMutante(getSecuenciaDiagonalDesc(dna, 0, x));			
		}
		
		for (int y = 1; y < dna.length ; y++) {				
			cantSeqMutantes += Mutante.buscaSecuenciaMutante(getSecuenciaDiagonalDesc(dna, y, 0));
		}
		
		return cantSeqMutantes;
	}		
	String getSecuenciaDiagonalDesc(String[] dna, int row, int col ) {
		int v_row, v_col=0;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; row+col+i < dna.length; i++) {
			v_row=row+i;
			v_col=col+i;
			sb.append(dna[v_row].charAt(v_col));
		}
		return sb.toString();		
	}	
	
	
	
}

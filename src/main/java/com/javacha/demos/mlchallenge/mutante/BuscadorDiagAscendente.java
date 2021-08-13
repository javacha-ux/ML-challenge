package com.javacha.demos.mlchallenge.mutante;

public class BuscadorDiagAscendente implements IBuscadorMutante {

	
	public int buscarMutante(String[] dna) {
		int cantSeqMutantes=0;
		
		for (int y = 3; y < dna.length ; y++) {				
			cantSeqMutantes += Mutante.buscaSecuenciaMutante(getSecuenciaDiagonalAsc(dna, y, 0));
		}
		
		for (int x = 1; x < dna.length -  Mutante.getMutantSequenceLength() ; x++) {
			cantSeqMutantes += Mutante.buscaSecuenciaMutante(getSecuenciaDiagonalAsc(dna, 9, x));			
		}
		
		return cantSeqMutantes;
	}		
	
	String getSecuenciaDiagonalAsc(String[] dna, int row, int col ) {
		int v_row, v_col=0;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; row-i >= 0 && col+i < dna.length; i++) {
			v_row=row-i;
			v_col=col+i;
			sb.append(dna[v_row].charAt(v_col));
		}
		return sb.toString();		
	}	
}

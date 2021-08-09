package com.javacha.demos.mlchallenge.service;

import com.javacha.demos.mlchallenge.model.Mutante;

public class MutantService {

	
	
	int cantSeqMutante = 0;
	
	boolean mutantCheck(String[] dna) {
		
		if (dna.length < 4)
			return false;
		
		
		
		
		return false;
		
	}
	
	
	
	

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
	

	
	/////////////  HORIZONTAL
	int validaHorizontal(String[] dna) {
		int cantMutantes=0;
		for (int i = 0; i < dna.length ; i++) {
			cantMutantes += Mutante.buscaSecuenciaMutante(getHorizontalChunk(dna, i));			
		}
		return cantMutantes;
	}
	String getHorizontalChunk(String[] dna, int row ) {
		return dna[row];
	}
	

	
	/////////////  VERTICAL
	int validaVertical(String[] dna) {
		int cantMutantes=0;
		for (int i = 0; i < dna.length ; i++) {
			cantMutantes += Mutante.buscaSecuenciaMutante(getVerticalChunk(dna, i));			
		}
		return cantMutantes;
	}		
	String getVerticalChunk(String[] dna, int col ) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < dna.length; i++) {
			sb.append(dna[i].charAt(col));
		}
		return sb.toString();
	}	
	
	
	
	/////////////  DIAGONAL DESCENDENTE
	int validaDiagonalDesc(String[] dna) {
		int cantSeqMutantes=0;
		
		for (int x = dna.length - Mutante.getMutantSequenceLength(); x >= 0 ; x--) {
			cantSeqMutantes += Mutante.buscaSecuenciaMutante(getDiagonalDescChunk(dna, 0, x));			
		}
		
		for (int y = 1; y < dna.length ; y++) {				
			cantSeqMutantes += Mutante.buscaSecuenciaMutante(getDiagonalDescChunk(dna, y, 0));
		}
		
		return cantSeqMutantes;
	}		
	String getDiagonalDescChunk(String[] dna, int row, int col ) {
		int v_row, v_col=0;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; row+col+i < dna.length; i++) {
			v_row=row+i;
			v_col=col+i;
			sb.append(dna[v_row].charAt(v_col));
		}
		return sb.toString();		
	}	
	



		
	public static void main(String[] args) {
		String[] dna = {  "GTCACCAGAG", "TGAAACTATC", "CTCTGAGGAA", "AGCGTGTCCA", "TGTGCTCAAC", "CTAGGACTTA", "AATAGGGGGG", "TAATGCAATA", "GGATTTAGAC", "TTCAATGGCC" };
		
		MutantService mut = new MutantService();
		TimeTrack tt = new TimeTrack();
	
		//System.out.println(mut.validaHorizontal(dna ));
		//System.out.println(mut.validaVertical(dna ));
		System.out.println(mut.validaDiagonalDesc(dna));
		
		
		//boolean valido = mut.validaDna(dna);	
		
		
		
	}
	

}



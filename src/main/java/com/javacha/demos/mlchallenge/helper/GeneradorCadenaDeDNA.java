package com.javacha.demos.mlchallenge.helper;

import java.util.Random;

public class GeneradorCadenaDeDNA {

	static String[] validChars =  { "A", "C", "G", "T"};
	
	static void generaDNA(int tamanio) {
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		
		for (int row = 0; row < tamanio; row++) {
			sb1.append('"');
			
			for (int col = 0; col < tamanio; col++) {
				String letra = dameLetra(row, col);
				sb1.append(letra);
				sb2.append(letra);
			}
			sb1.append("\", ");
			sb2.append("\n");
		}
		System.out.println(sb1);
		System.err.println("");
		System.out.println(sb2);
		
	}
	
	static String dameLetra(int row, int col) {
		return  validChars[((row % 2) + col) % validChars.length];
		//return validChars[new Random().nextInt(4)];
	}
	
	public static void main(String[] args) {
		generaDNA(13);
	}
}

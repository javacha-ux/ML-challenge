package com.javacha.demos.mlchallenge.helper;

import java.util.Random;

public class GeneradorDeDNA {

	static String[] validChars =  { "A", "C", "G", "T"};
	
	static void generaDNA(int tamanio) {
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		
		for (int i = 0; i < tamanio; i++) {
			sb1.append('"');
			
			for (int z = 0; z < tamanio; z++) {
				String letra = dameLetra();
				sb1.append(letra);
				sb2.append(letra);
			}
			sb1.append("\", ");
			sb2.append("\n");
		}
		System.out.println(sb1);
		
		System.out.println(sb2);
		
	}
	
	static String dameLetra() {
		return validChars[new Random().nextInt(4)];
	}
	
	public static void main(String[] args) {
		generaDNA(10);
	}
}

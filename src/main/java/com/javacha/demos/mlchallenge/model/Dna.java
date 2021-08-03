package com.javacha.demos.mlchallenge.model;

import java.util.Arrays;

public class Dna {

	public String[] dna;

	
	public String[] getDna() {
		return dna;
	}

	public void setDna(String[] dna) {
		this.dna = dna;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dna [dna=").append(Arrays.toString(dna)).append("]");
		return builder.toString();
	}

	
	
	
	
}

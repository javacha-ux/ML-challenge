package com.javacha.demos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.javacha.demos.mlchallenge.service.MutantService;

@RunWith(SpringRunner.class)
@SpringBootTest
class MutanteTest {

	MutantService mutante = new MutantService();

	@Test
	public void secuenciasHorizontales() {
		String[] dna = new String[] { "ACGTACGTACGTACGTACGTACGTACGTAC", "CGTACGTACGTACGTACGTACGTACGTACG",
				"ACGTACGTACGTACGTACGTACGTACGTAC", "CGTACGTACGTACGTACGTACGTACGTACG", "ACGTACGTACGTACGTACGTACGTACGTAC",
				"CGTACGTACGTACGTACGTACGTACGTACG", "ACGTACGTACGTACGTACGTACGTACGTAC", "CGTACGTACGTACGTACGTACGTACGTACG",
				"ACGTACGTACGTACGTACGTACGTACGTAC", "CGTACGTACGTACGTACGTACGTACGTACG", "ACGTACGTACGTACGTACGTACGTACGTAC",
				"CGTACGTACGTACGTACGTACGTACGTACG", "ACGTACGTACGTACGTACGTACGTACGTAC", "CGTACGTACGTACGTACGTACGTACGTACG",
				"ACGAACGTACGTACGTACGTACGTACGTAC", "CGTACGTACGTACGTACGTACGTACGTACG", "ACGTACGTACGTACGTACGTACGTACGTAC",
				"CGTACGTACGTACGTACGTACGTACGTACG", "ACGTACGTACGTACGTACGTACGTACGTAC", "CGTACGTACGTACGTACGTACGTACGTACG",
				"ACGTACGTACGTAGGTACGTACGTACGTAC", "CGTACGTACGTACGTACGTACGTACGTACG", "ACGTACGTACGTAGGTACGTACGTACGTAC",
				"CGTACGTACGTACGTACGTACGTACGTACG", "ACGTACGTACGTACGTACGTACGTACGTAC", "CGTACGTACGTACGTACGTACGTACGTACG",
				"ACGTACGTACGGACGTACGTACGTACGTAC", "CGTACGTACGTGCGTACGTACGTACGTACG", "ACGTACGTACGGACGTACGTACGTACGTAC",
				"CGTACGTACGTGCGTACGTACGTACGTACG" };
		
		boolean esMutante = mutante.isMutant(dna);
		assertEquals(true, esMutante);
		
		
		dna = new String[] { "ACGTACGTACGTA", "CGTACGTACGTAC", "ACGTACGTACGTA", "CGTACGTACGTAC", "ACGTACGTACGTA",
				"CGTACGTACGTAC", "ACGTACGTACGTA", "CGTACGTACGTAC", "ACGTACGTACGTA", "CGTACGTACGTAC", "ACGTACGTACGTA",
				"CGTACGTACGTAC", "AAAAACGTCAAAA" };

		
		esMutante = mutante.isMutant(dna);
		assertEquals(true, esMutante);
	}
	
	

}

package br.com.danilo.java.teste;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Teste4 {

	public static void main(String[] args) {
		
		String[] estados = {"SP", "RJ", "MG", "ES", "Outros"};
		double[] faturamento = {67836.43, 36678.66, 29229.88, 27165.48, 19894.53};
		double fatTotal = 0.0;
				
		for (int i=0; i<faturamento.length; i++) {
			fatTotal += faturamento[i];
		}
		
		for (int i=0; i<estados.length; i++) {
			double participacoes = faturamento[i]/fatTotal * 100;
			BigDecimal bd = new BigDecimal(participacoes).setScale(2, RoundingMode.HALF_EVEN);
			System.out.println("Participação de " + estados[i] + " é: " + bd + "% do total de Faturamento");
		}

	}

}

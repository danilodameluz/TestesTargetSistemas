package br.com.danilo.java.teste;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = scanner.next();
		int qtdeLetras = palavra.length();
		char[] letras = new char[qtdeLetras];
		ArrayList<Character> listaLetras =new ArrayList<Character>();
		
		for (int i=qtdeLetras; i>0; i--) {
			listaLetras.add( palavra.charAt(i-1) );
		}
		
		for (int i=0; i<listaLetras.size(); i++) {
			letras[i] = (char) listaLetras.get(i);
		}
		
		String novaPalavra = new String(letras);
		
		System.out.println(novaPalavra);

	}

}

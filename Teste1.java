package br.com.danilo.java.teste;

public class Teste1 {
	public static void main(String[] args) {
		int indice=13, soma=0, k=0;
		
		while(k<indice) {
			k++;
			soma += k;
		}
		System.out.println("Valor da variável soma é: " + soma);
	}

}

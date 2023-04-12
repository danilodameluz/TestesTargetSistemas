package br.com.danilo.java.teste;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> fibonacci = new ArrayList<Integer>();
		int numElementos = 45;
		for (int i=0; i<=numElementos; i++) {
			if(i==0 || i==1) {
				fibonacci.add(i);
			}else {
				int a = (int) fibonacci.get(i-2);
				int b = (int) fibonacci.get(i-1);
				int c = a + b;
				fibonacci.add(c);
			}
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o número que deseja verificar se pertence a esta sequência:");
		int numAProcura = scanner.nextInt();
		
		if(fibonacci.contains(numAProcura)) {
			System.out.println("Este número está contido na sequência Fibonacci!");
		}else{
			System.out.println("Este número não está contido na sequência Fibonacci!");
		};
		
		System.out.println(fibonacci);
		
	}

}

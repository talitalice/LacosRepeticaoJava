package PacoteJava;

import java.util.Scanner;

public class repeticao5DoWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero, soma = 0;
		
		do {
			System.out.println("Escreva um numero: ");
			numero = input.nextInt();
			soma = soma + numero;
			
			
		}while (numero != 0);
		
		
		System.out.println("Esse é o resultado da soma é: " + soma );
		
		
	}

}

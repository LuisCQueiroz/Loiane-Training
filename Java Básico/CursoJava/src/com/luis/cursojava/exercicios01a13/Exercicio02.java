package com.luis.cursojava.exercicios01a13;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/* Faça um programa que peça um número e então mostre
		 * a mensagem O número informado foi:
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe un número: ");
		int numero = scan.nextInt();
		System.out.println("O número digitado foi: " + numero);
		
	}

}

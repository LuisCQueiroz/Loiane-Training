package com.luis.cursojava.exercicios01a13;

import java.util.Scanner;

/*Faça um programa que peça 2 numeros inteiros e um real.
 * Calcule e mostre:
 * a) O produto do dobro do primeiro com a metade do segundo;
 * b) a soma do triplo do primeiro com o terceiro;
 * c) o terceiro elevado ao cubo.
  */

public class Exercicio11 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um número inteiro: ");
		int n1 = scan.nextInt();
		System.out.println("Informe outro número inteiro: ");
		int n2 = scan.nextInt();
		System.out.println("Informe um número real");
		//Cálculos
		double n3 = scan.nextDouble();
		double Produto =  ((2*n1) * (n2/2));
		double Soma = (3 * n1) + n3;
		double Cubo =  Math.pow(n3,3);
		//Resultados
		System.out.println("O produto é: " + Produto);
		System.out.println("A soma é: " +  Soma);
		System.out.println("O cubo é: " + Cubo);
		

		
		

	}

}

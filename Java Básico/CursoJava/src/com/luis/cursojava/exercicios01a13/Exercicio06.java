package com.luis.cursojava.exercicios01a13;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*Faça um programa que peça o raio de um círculo,
		 * calcule e mostre sua área
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o raio do círculo: ");
		double raio = scan.nextDouble();
		double pi = 3.14;
		double area = pi*(raio*raio);
		System.out.println("O raio do círculo é " + area);
	}

}

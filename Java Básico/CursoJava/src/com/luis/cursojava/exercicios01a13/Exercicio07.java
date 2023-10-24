package com.luis.cursojava.exercicios01a13;

/* Faça um programa que calcule a área de um quadrado, em seguida
 * mostre o dobro desta área para o usuário * 
 */

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a medida de um lado do quadrado: ");
		double lado = scan.nextDouble();
		double area = Math.pow(lado, 2);
		System.out.println("A área desse quadrado é: " + area);		
		double dobro = area * 2;
		System.out.println("O dobro da área é: " + dobro);		
	}

}

package com.luis.cursojava.exercicios01a13;

import java.util.Scanner;

/* Faça um programa que peça a temperatura em graus Celsius,
 * transforme e mostre a temperatura em graus Farenheit
 * C=(5*(F-32)/9)
 */

public class Exercicio10 {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
	System.out.println("Informe a temperatura em Celsius para converter em Farenheit");
	double Celsius = scan.nextDouble();
	double Farenheit = ((Celsius * 9)/5) + 32;
	System.out.println("O Valor corresponde a: " + Farenheit + " Graus Farenheit");
	

	}

}

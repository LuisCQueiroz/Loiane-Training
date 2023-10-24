package com.luis.cursojava.exercicios01a13;
/* Faça um programa que peça a temperatura em graus Farenheit,
 * transforme e mostre a temperatura em graus Celsius
 * C=(5*(F-32)/9)
 */

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Informe a temperatura em Farenheit para coverter em Celsius: ");
	double Farenheit = scan.nextDouble();
	double Celsius = (5*(Farenheit-32)/9);
	System.out.println("A temperatura convertida em Celsius é: " + Celsius);

	}

}

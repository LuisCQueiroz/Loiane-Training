package com.luis.cursojava.exercicios01a13;
/*Tendo como dados de entrada a altura de uma pessoa, construa 
 * um algoritmo que calcule seu peso ideal, utilizando a seguinte
 * fórmula (72.7*altura) - 58
 */

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe sua altura: ");
		double altura = scan.nextDouble();
		double pesoIdeal = (72.7*altura) - 58;
		System.out.println("O peso ideal baseado na altura informada é: " + pesoIdeal );

	}

}

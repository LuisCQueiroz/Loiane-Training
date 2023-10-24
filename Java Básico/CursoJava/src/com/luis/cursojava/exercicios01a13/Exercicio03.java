package com.luis.cursojava.exercicios01a13;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		double numero1 = scan.nextDouble();
		System.out.println("informe o segundo número: ");
		double numero2 = scan.nextDouble();
		double resultado = numero1 + numero2;
		System.out.println("A soma dos números é: " + resultado);
		System.out.println();
		System.out.println("Informe o terceiro e quarto número separado por espaço: ");
		double numero3 = scan.nextDouble();
		double numero4 = scan.nextDouble();
		double resultado2 = numero3 + numero4;
		System.out.println("A soma dos dois últimos números é: " + resultado2);

	}

}

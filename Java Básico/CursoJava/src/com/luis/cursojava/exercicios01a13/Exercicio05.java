package com.luis.cursojava.exercicios01a13;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/* faça um programa que converta metros em
		 * centrimetros
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=========================================");
		System.out.println("|   Convertendo metros em centimetros   |");
		System.out.println("=========================================");
		System.out.println();
		System.out.println("Informe o valor em metros para converter");
		double metro = scan.nextDouble();
		double centimetro = metro * 100;
		System.out.println(" O valor " + metro + " metro(s) equivale(m) a " + centimetro +" centimetros. ");
				 
		
	}

}

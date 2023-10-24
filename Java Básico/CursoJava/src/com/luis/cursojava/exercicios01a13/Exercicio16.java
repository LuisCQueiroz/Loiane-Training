package com.luis.cursojava.exercicios01a13;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros 
 * quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para 
 * cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam 
 * R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço 
 * total.
 */
public class Exercicio16 {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
	double Cobertura = 3;
	double lataCobertura = 6;
	double precoLata = 80;
	
	Locale localeBR = new Locale("pt", "BR");
	
	NumberFormat inteiro = NumberFormat.getInstance();
	NumberFormat dinheiro = NumberFormat.getCurrencyInstance();
	NumberFormat numberFormat = NumberFormat.getInstance(localeBR);
 
	
	System.out.println("Informe o tamanho em metros quadrados da àrea a ser pintada:");
	double area = scan.nextDouble();
	
	double areacoberta = Math.round(area / lataCobertura);
	double precoCobertura = areacoberta * precoLata;
	
	System.out.println("Vcê irá utilizar " + areacoberta + " latas. O preço para compra é " + dinheiro.format(precoCobertura));
	

	}

}

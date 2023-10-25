package com.luis.cursojava.exercicios01a13;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Locale localeBR = new Locale("pt", "BR");
		
		NumberFormat inteiro = NumberFormat.getInstance();
		NumberFormat dinheiro = NumberFormat.getCurrencyInstance();
		NumberFormat numberFormat = NumberFormat.getInstance(localeBR);

		double cobertura = 6;
		double lataCobertura = 18 * cobertura;
		double precoLata = 80;
		double galao = 3.6 * cobertura;
		double precoGalao = 25;
		
		System.out.println("Informe o tamanho em metros quadrados da àrea a ser pintada:");
		double area = scan.nextDouble();
		
		double areaPintar = (area + ((area * 10)/100));
		
		double areacoberta = Math.round(areaPintar / lataCobertura);
		
		if (areacoberta < 1) {
			areacoberta=1;
		}
		
		double precoCobertura = areacoberta * precoLata;
		
		System.out.println("Uma lata de 18 litros cobre: " + lataCobertura + " metros.");
		System.out.println("Você irá utilizar " + areacoberta + " latas de 18 litros. O preço para compra é " + dinheiro.format(precoCobertura));
		

	}

}

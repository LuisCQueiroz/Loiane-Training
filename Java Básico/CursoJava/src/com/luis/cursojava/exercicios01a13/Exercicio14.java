package com.luis.cursojava.exercicios01a13;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

/* João Papo de Pescador, homem de bem, comprou um microcomputador
 * para controlar o rendimento diário de seu trabalho. Toda vez que
 * traz um peso de peixes maior que o estabelecido pelo regulamento
 * de pesca do Estado de São Paulo (50 quilos) deve pagar uma multa de 
 * R$ 4,00 por quilo excedente. João precisa que você faça um programa 
 * que leia a variável peso (peso dos peixes) e verifique se há excesso.
 * Se houver, gravar na variavel excesso e na variavel multa o valor que
 * João deverá pagar. Caso contrario mostrar tais variáveis com o conteúdo 
 * zero.
 */
public class Exercicio14 {

	public static void main(String[] args) {

		Locale localeBR = new Locale("pt", "BR");
		Scanner scan = new Scanner(System.in);
		
		NumberFormat inteiro = NumberFormat.getInstance();
		NumberFormat dinheiro = NumberFormat.getCurrencyInstance();
		NumberFormat numberFormat = NumberFormat.getInstance(localeBR);
		
		
		System.out.println("Informe o peso dos peixes de sua pesca: ");
		double peso = scan.nextDouble();
		
		double excesso = (peso - 50);
		double multa = (4*excesso);
		
		if (excesso > 0) {
			System.out.println("Em sua pesca houve excesso de peso em: " + excesso + " kg.");
			System.out.println("Você terá que pagar multa de: " + dinheiro.format(multa) );
		}else {
			multa = 0;
			System.out.println("Em sua pesca não houve excesso de peso. Informado: " + peso + " kg.");
			System.out.println("Você não terá que pagar multa: " + dinheiro.format(multa) );
		}
	}

}

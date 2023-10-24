package com.luis.cursojava.exercicios01a13;



/*Faça um programa que pergunte quanto você ganha por hora
 * e o número de horas trabalhadas por mês. Calcule e mostre
 * o total do seu salário no referido mês.
 * 
 */

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;


public class Exercicio08 {

	public static void main(String[] args) {
		
		//Identifica a região para gerar a moeda
		Locale localeBR = new Locale("pt","BR");

		Scanner scan = new Scanner(System.in);
		
		//Opções de formatação de número
		NumberFormat inteiro = NumberFormat.getInstance();
		NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
		NumberFormat percentual = NumberFormat.getPercentInstance(localeBR);
		NumberFormat numberFormat = NumberFormat.getNumberInstance(localeBR);
		
		System.out.println("Informe o seu salário:");
		double salario = scan.nextDouble();
		
		System.out.println("Informe quantas horas trabalha por dia: ");
		double horas = scan.nextDouble();
		double valorHora = (salario/30)/horas;
		System.out.println("Você recebe: " + dinheiro.format(valorHora) + " por hora trabalhada.\n");
		System.out.println("Informe a quantidade de horas extras que trabalhou neste mês:");
		double horasTrabahadas = scan.nextDouble();
		double valorAReceber = salario+(valorHora*horasTrabahadas);
				
		System.out.println("\nNeste mês, o valor bruto a receber do salário mais extras é: "+ dinheiro.format(valorAReceber));
		
	
		

	}

}

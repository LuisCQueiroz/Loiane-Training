package com.luis.cursojava.exercicios01a13;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercício15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Locale localeBR = new Locale("pt", "BR");

		
		NumberFormat inteiro = NumberFormat.getInstance();
		NumberFormat dinheiro = NumberFormat.getCurrencyInstance();
		NumberFormat numberFormat = NumberFormat.getInstance(localeBR);
		
		System.out.println("Informe seu primeiro nome: ");
		String nome = scan.next();
		System.out.println("Informe o valor da hora trabalhada: ");
		double valorHora = scan.nextDouble();
		System.out.println("Informe quantas horas trabalhou: ");
		double hora = scan.nextDouble();
		
		//cálculos
		double salarioBruto =(valorHora*hora);
		double ir = ((salarioBruto*11)/100);
		double inss = ((salarioBruto*8)/100);
		double sindicato = ((salarioBruto*5)/100);
		double descontos = (ir+inss+sindicato);
		double salarioLiquido = (salarioBruto-descontos);
		
		//contracheque
		System.out.println("-------------------Contracheque-------------------------------");
		System.out.println("  Nome funcionário: " + nome);
		System.out.println();
		System.out.println("  Valor Hora: " + dinheiro.format(valorHora) + " | Horas Trabalhadas: " + hora);
		System.out.println("--------------------------------------------------------------");
		System.out.println("                             Créditos           Débitos");
		System.out.println("--------------------------------------------------------------");
		System.out.println(" Salário Bruto:              " + dinheiro.format(salarioBruto));
		System.out.println(" INSS:                                        " + dinheiro.format(inss));
		System.out.println(" Sindicato:                                   "+ dinheiro.format(sindicato));
		System.out.println(" IR:                                          " + dinheiro.format(ir));
		System.out.println("--------------------------------------------------------------");
		System.out.println(" Totais:                     " + dinheiro.format(salarioBruto)+"        " + dinheiro.format(descontos));
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("Salário Liquido:             " + dinheiro.format(salarioLiquido));
		

		 	}

}

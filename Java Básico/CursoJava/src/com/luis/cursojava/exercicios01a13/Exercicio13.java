package com.luis.cursojava.exercicios01a13;


import java.io.IOException;
import java.util.Scanner;

/*Tendo como dados de entrada a altura e o sexo de uma pessoa, construa 
 * um algoritmo que calcule seu peso ideal, utilizando as seguintes
 * fórmulas:
 * a) Homens = (72.7*altura) - 58
 * b) Mulheres = (62.1*altura) - 44.7
 * c) Peça o peso e informe se está dentro, acima ou abaixo do peso.
 *  */

public class Exercicio13 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
	    Scanner ler = new Scanner(System.in);
		
	    char sexo;
	    
	    System.out.printf("Informe o sexo (M/F):\n");
	    sexo = (char)System.in.read();
	    
		System.out.println("Informe sua altura: ");
		double altura = scan.nextDouble();
		
		System.out.println("Informe seu Peso");
		double peso = scan.nextDouble();
		
		System.out.println();
		
		if ((sexo == 'M') || (sexo == 'm')) {
			double pesoIdealHomem = (72.7*altura)-58;
		
			if (peso == pesoIdealHomem){
				System.out.println("Parabéns, você possui o peso ideal");
			}else if ((peso < pesoIdealHomem)){
				System.out.println("Você possui peso abaixo do ideal, procure um médico");
			}else {
				System.out.println("Alerta.Você possui peso acima do ideal, procure um médico");	
			}
		} else {
			double pesoIdealMulher =(62.1*altura) - 44.7;
			System.out.println("O Peso ideal Mulher é: " +pesoIdealMulher);
			if (peso == pesoIdealMulher){
				System.out.println("Parabéns, você possui o peso ideal");
			}else if ((peso < pesoIdealMulher)){
				System.out.println("Você possui peso abaixo do ideal, procure um médico");
			}else {
				System.out.println("Alerta.Você possui peso acima do ideal, procure um médico");	
			}
	}

}
}

package com.luis.cursojava.aula11;

public class VariaveisChar {

	public static void main(String[] args) {
		
		char o1 = 'o';
		char i1 = 'i';
		
		//Soma o valor asc do caracter
		System.out.println(o1+i1);
		//Para concatenar o texto
		System.out.println(""+o1+i1);
		System.out.println();
		
		//Mesmo resultado utilizando código ASCii
		char o = 111;
		char i = 105;
		char interrogacao = 63;
		
		//Soma o valor asc do caracter
		System.out.println(o+i+interrogacao);
		//Para concatenar o texto
		System.out.println(""+o+i+interrogacao);

	}

}

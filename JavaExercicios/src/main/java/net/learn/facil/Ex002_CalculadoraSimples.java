package net.learn.facil;

import java.util.Scanner;

public class Ex002_CalculadoraSimples {

	public static void main(String[] args) {
		 
		/*	*	 Ex. 002
		 * 
		 * * 	 DESCRIÇÃO: 
		 * *	 Ler dois números e exibir a soma, subtração, multiplicação e divisão.
		 * */
	
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("-------- ** Calculadora ** ---------");
		
		System.out.println("Digite um número: ");
		Float number1 = read.nextFloat();
		System.out.println("Digite outro número: ");
		Float number2 = read.nextFloat();
		
		Float sum = (number1 + number2);
		Float sub = (number1 - number2);
		Float multiplication   = (number1 * number2);
		Float division = (number1 / number2);
		

		System.out.println("Resultado da soma, divisão, multiplicacao e divisão dos números informados.");
		System.out.println("Soma: " + sum + "\n" + "Subtração: " + sub + "\n" 
		+ "Multiplicacao: " + multiplication + "\n" + "Divisão: " + division);
		
		String result = String.format(" Soma: %.2f%n Subtração: %.2f%n Multiplicação: %.2f%n Divisão: %.2f ", sum, sub, multiplication, division);
		System.out.println(result);
	}

}

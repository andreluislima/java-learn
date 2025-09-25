package net.learn.facil;

import java.util.Scanner;

public class Ex004_Tabuada {

	public static void main(String[] args) {
		/*	*	 Ex. 004
		 * *	 Descrição: 
		 * *	 Imprimir a tabuada de um número de 1 a 10.
		 * */
		
		Scanner read = new Scanner(System.in);
		System.out.println("--- # Tabuada # ---");
		
		System.out.println("Digite um número: ");
		Integer num = read.nextInt();
		
		for (int i = 1; i<=10; i++) {
			Integer calc = num * i;
			System.out.println(num + "x" + i + " = " + calc);
		}
	}

}

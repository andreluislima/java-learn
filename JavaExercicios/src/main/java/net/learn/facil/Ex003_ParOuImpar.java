package net.learn.facil;

import java.util.Scanner;

public class Ex003_ParOuImpar {

	public static void main(String[] args) {
		
		/*	*	 Ex. 003
		 * 
		 * *	 DESCRIÇÃO: 
		 * *	 Verifique se um número é par ou impar.
		 * */
		
		 Scanner read = new Scanner(System.in);
		 
		 System.out.print("Digite um número: ");
		 Float numero = read.nextFloat();
		 
		 if(numero % 2 == 0) {
			 System.out.println("O número digitado é Par.");
		 }else {
			 System.out.println("O número digitado é Impar.");
		 }
		 
		 
		 
	}

}

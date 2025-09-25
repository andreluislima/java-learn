package net.learn.facil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex005_Fatorial {

	public static void main(String[] args) {
		/*	*	 Ex. 005
		 * *	 Descrição: 
		 * *	 Calcular o fatorial de um número
		 * */
		
		//		O fatorial de um número natural é a multiplicação de um número por seus antecessores maiores que 0. 
		//		De forma geral, o fatorial de um número n é:
		//		4!=4⋅3⋅2⋅1=24
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("---# Calculo do Fatorial de um número #---");
		System.out.print("Digite um número: ");
		Integer num = read.nextInt();
		
		List<Integer> numeros = new ArrayList<>();

		for(int i=1; i<=num; i++) {
			Integer anterior = ((num +1)-i);
			System.out.printf(anterior + ", ");
			
			numeros.add(anterior);
			
		}
		
		Integer fatorial = num;

		for(int n : numeros) {
			fatorial = fatorial * n;	
		}
		
		System.out.println("Fatorial de: " + num + "= " + fatorial);
		
//		System.out.println("lista: " + numeros);
//		System.out.println("Item da lista: " + numeros.get(0));

 	}


}

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
		Integer[] lista;

//		>>> ### LIST ### <<<
		for(int i=1; i<=num; i++) {
			Integer anterior = ((num +1)-i);			
			numeros.add(anterior);
		}
		
		Integer  fatorial = 1;
		
		for(int i=0; i < numeros.size(); i++) {
			fatorial *= numeros.get(i);
			System.out.println("Numero: " + numeros.get(i));
		}
		
		System.out.println("Fatorial de: " + num + "= " + fatorial);
		


 	}


}

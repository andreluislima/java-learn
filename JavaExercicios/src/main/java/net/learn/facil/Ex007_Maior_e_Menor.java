package net.learn.facil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex007_Maior_e_Menor {

	public static void main(String[] args) {
		/*	*	 Ex. 008
		 * *	 Descrição: 
		 * *	 Ler 10 números e mostrar o maior e o menor
		 * */

		Scanner read = new Scanner(System.in);
		List<Integer>listNumeros = new ArrayList<>();
		Integer max = 1;
		Integer min = 1;
		
		for(int i = 1; i<=3; i++) {
			System.out.print("Adicione um número à lista: ");
			Integer num = read.nextInt();
			System.out.println("Contador: "  + i);
			
			listNumeros.add(num);
			System.out.println(listNumeros);
			
		}
		
		for(int n : listNumeros) {
			 
		}
		
		System.out.println("Fim da Lista. " + listNumeros.size() + "números adicionados");
		
	}

}

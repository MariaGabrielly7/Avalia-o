package avaliacao;

import java.util.Random;
import java.util.Scanner;

public class Questao6Lista2 {
	public static void main(String[] args) {
		int[] aleatorios = new int[100];
		Random gerador = new Random();
		
		System.out.println("Array com 100 números aleatórios:");
		for (int i = 0; i < aleatorios.length; i ++) {  
			aleatorios[i] = gerador.nextInt(100);  
			System.out.printf ("%s; ",aleatorios[i]);  
			}	
		
		System.out.println("\nOs números pares do array são:");
		for (int i = 0; i < aleatorios.length; i ++) {  
			if(aleatorios[i]%2 == 0) {
				System.out.printf ("%s; ",aleatorios[i]);  
				}
			}	
	}
}

package avaliacao;

import java.util.Random;
import java.util.Scanner;

public class Questao8Lista2 {
	public static void main(String[] args) {
		int[] aleatorios = new int[100];
		float soma = 0, media = 0.0f;
		Random gerador = new Random();
		
		System.out.println("Array com 100 números aleatórios:");
		for (int i = 0; i < aleatorios.length; i ++) {  
			aleatorios[i] = gerador.nextInt(100);  
			soma = soma + aleatorios[i];
			System.out.printf ("%s; ",aleatorios[i]);  
			}	
		
		media = (soma/aleatorios.length);
		System.out.printf("\nMédia dos 100 números do array: %.2f", media);
	}
}

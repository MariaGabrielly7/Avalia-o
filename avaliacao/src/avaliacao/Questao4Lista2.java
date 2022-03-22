package avaliacao;

import java.util.Random;
import java.util.Scanner;

public class Questao4Lista2 {
	public static void main(String[] args) {
		int[] aleatorios = new int[100];
		Random gerador = new Random();
		int cont = 0;
		
		System.out.println("Array com 100 números aleatórios:");
		for (int i = 0; i < aleatorios.length; i ++) {  
			aleatorios[i] = gerador.nextInt(100);  
			System.out.printf ("%s; ",aleatorios[i]);  
			}	
		
		System.out.println("\nOs números primos do array são:");
		for (int i = 0; i < aleatorios.length; i ++) {  
			if(aleatorios[i] == 2) {
				System.out.printf ("%s; ",aleatorios[i]);  
			}else if(aleatorios[i]%2 != 0){
				for (int n = 3; n < aleatorios[i]/2; n++) {
				       if (aleatorios[i]%n != 0) {
				    	   cont++;
				        }
				}
				if(cont == ((aleatorios[i]/2)-3)) {
					System.out.printf ("%s; ",aleatorios[i]);
				}
				}	
			}
	}
}
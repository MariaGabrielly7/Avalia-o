package avaliacao;

import java.util.Scanner;
import java.util.Random;

public class Questao3Lista2 {
	public static void main(String[] args) {
		int[] aleatorios = new int[100];
		Random gerador = new Random();
		
		System.out.println("Array com 100 n�meros aleat�rios:");
		for (int i = 0; i < aleatorios.length; i ++) {  
			aleatorios[i] = gerador.nextInt(100);  
			System.out.printf ("%s; ",aleatorios[i]);  
			}
		System.out.println("\nOs 100 n�meros em sequ�ncia inversa: ");
		for (int i = aleatorios.length-1; i >= 0; i --) {  
			System.out.printf ("%s; ",aleatorios[i]);  
			}
	}
}

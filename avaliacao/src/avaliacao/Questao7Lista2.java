package avaliacao;

import java.util.Random;
import java.util.Scanner;

public class Questao7Lista2 {
	public static void main(String[] args) {
		int[] aleatorios = new int[100];
		int maior = 0, menor = 100;
		Random gerador = new Random();
		
		System.out.println("Array com 100 n�meros aleat�rios:");
		for (int i = 0; i < aleatorios.length; i ++) {  
			aleatorios[i] = gerador.nextInt(100);  
			System.out.printf ("%s; ",aleatorios[i]); 
			if(aleatorios[i]>maior) {
				maior = aleatorios[i];
			}if(aleatorios[i]<menor) {
				menor = aleatorios[i];
			}
			}	
		
		System.out.printf("\nO maior n�mero do array � %s e o menor n�mero � %s ",maior,menor);	
	}
}
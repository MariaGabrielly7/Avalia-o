package avaliacao;

import java.util.Scanner;

public class Questao2Lista2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[10];
		
		for (int i = 0; i < 10; i ++) {  
			System.out.println("Informe um número inteiro:");
			numeros[i] = entrada.nextInt();  
			}
		System.out.println("Os números em sequência de entrada inversa é: ");
		for (int i = 9; i >= 0; i --) {  
			System.out.printf ("%s; ",numeros[i]);  
			}
	}
}

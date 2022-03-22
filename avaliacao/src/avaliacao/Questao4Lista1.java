package avaliacao;

import java.util.Scanner;

public class Questao4Lista1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Informe um número inteiro:");
		num1 = entrada.nextInt();
		System.out.println("Informe outro número inteiro:");
		num2 = entrada.nextInt();
		
		if(num1>num2) {
			System.out.println("O maior número entre os informados é: " + num1);
		}else if(num2>num1) {
			System.out.println("O maior número entre os informados é: " + num2);
		}else {
			System.out.println("Os números informados são iguais.");
		}
	}
}

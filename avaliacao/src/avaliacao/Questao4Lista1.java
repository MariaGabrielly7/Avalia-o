package avaliacao;

import java.util.Scanner;

public class Questao4Lista1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Informe um n�mero inteiro:");
		num1 = entrada.nextInt();
		System.out.println("Informe outro n�mero inteiro:");
		num2 = entrada.nextInt();
		
		if(num1>num2) {
			System.out.println("O maior n�mero entre os informados �: " + num1);
		}else if(num2>num1) {
			System.out.println("O maior n�mero entre os informados �: " + num2);
		}else {
			System.out.println("Os n�meros informados s�o iguais.");
		}
	}
}

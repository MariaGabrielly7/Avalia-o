package avaliacao;

import java.util.Scanner;

public class Questao5Lista1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Informe um n�mero inteiro:");
		num = entrada.nextInt();
		
		if(num%2 == 0) {
			System.out.println("O n�mero " + num + " � par.");
		}else {
			System.out.println("O n�mero " + num + " � �mpar.");
		}
	}
}

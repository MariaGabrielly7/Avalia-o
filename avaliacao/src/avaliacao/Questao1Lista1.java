package avaliacao;

import java.util.Scanner;

public class Questao1Lista1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num_inteiro = 0;
		long num_long = 0;
		float num_float = 0f;
		
		System.out.println("Informe um n�mero inteiro:");
		num_inteiro = entrada.nextInt();
		System.out.println("Informe um n�mero long:");
		num_long = entrada.nextLong();
		System.out.println("Informe um n�mero float:");
		num_float = entrada.nextFloat();
		
		System.out.printf("O n�mero inteiro informado foi %s, o n�mero long informado foi %s e o n�mero float informado foi %s", num_inteiro, num_long, num_float);
	}
}

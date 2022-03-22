package avaliacao;

import java.util.Scanner;

public class Questao3Lista1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float bmaior = 0f;
		float bmenor = 0f;
		float altura = 0f;
		float area = 0f;
		
		System.out.println("Informe a base maior do trapézio:");
		bmaior = entrada.nextFloat();
		System.out.println("Informe a base menor do trapézio:");
		bmenor = entrada.nextFloat();
		System.out.println("Informe a altura do trapézio:");
		altura = entrada.nextFloat();
		
		area = ((bmaior+bmenor)*altura)/2;
		System.out.println("A área do trapézio é igual a " + area + " cm^2.");
	}
}

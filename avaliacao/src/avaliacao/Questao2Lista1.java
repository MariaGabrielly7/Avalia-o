package avaliacao;

import java.util.Scanner;

public class Questao2Lista1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float peso = 0f;
		float altura = 0f;
		float imc = 0f;
		
		System.out.println("Informe o seu peso em quilos:");
		peso = entrada.nextFloat();
		System.out.println("Informe sua altura em metros:");
		altura = entrada.nextFloat();
		
		imc = peso/(altura*altura);
		System.out.printf("O valor do seu IMC é: %.2f", imc);
	}
}

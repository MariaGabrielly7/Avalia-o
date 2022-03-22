package avaliacao;

import java.util.Scanner;

public class Questao1Lista2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float nota1 = 0f, nota2 = 0f, nota3 = 0f, nota4 = 0f, nota5 = 0f, media = 0f;
		
		System.out.println("Informe a primeira nota:");
		nota1 = entrada.nextFloat();
		System.out.println("Informe a segunda nota:");
		nota2 = entrada.nextFloat();
		System.out.println("Informe a terceira nota:");
		nota3 = entrada.nextFloat();
		System.out.println("Informe a quarta nota:");
		nota4 = entrada.nextFloat();
		System.out.println("Informe a quinta nota:");
		nota5 = entrada.nextFloat();
		
		media = (nota1+nota2+nota3+nota4+nota5)/5;
		System.out.printf("A média das notas é: %.2f",media);
	}
}

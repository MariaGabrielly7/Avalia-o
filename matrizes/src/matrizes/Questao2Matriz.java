package matrizes;

public class Questao2Matriz {
	public static void main(String[] args) {
		int [][] matrizA = {{3,4,5},{5,6,1},{7,8,2}};
		int [][] matrizB = {{10,1,2},{3,5,0},{0,21,15}};
		
		System.out.println("Matriz A:");
		for(int i = 0; i < matrizA.length; i++) {
			for(int j = 0; j < matrizA[0].length; j++) {
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\nMatriz B:");
		for(int i = 0; i < matrizA.length; i++) {
			for(int j = 0; j < matrizB[0].length; j++) {
				System.out.print(matrizB[i][j] + " ");
			}
			System.out.println();
		}
		
		if(matrizA.length == matrizB.length) {
			System.out.println("\nAs matrizes são de tamanhos iguais. \nPortanto a subtração das matrizes é igual a:");
			for(int i = 0; i < matrizA.length; i++) {
				for(int j = 0; j < matrizA[0].length; j++) {
					System.out.print((matrizA[i][j] - matrizB[i][j]) + " ");
				}
				System.out.println();
			}
		}else {
			System.out.println("As matrizes são de tamanhos diferentes.");
		}
	}
}

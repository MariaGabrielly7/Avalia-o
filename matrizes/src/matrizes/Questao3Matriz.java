package matrizes;

public class Questao3Matriz {
	public static void main(String[] args) {
		int [][] matrizA = {{3,4,5},{5,6,1}};
		int [][] matrizB = {{10,1},{3,5},{0,21}};
		int [][] resultado = new int [2][2];
		
		System.out.println("Matriz A:");
		for(int i = 0; i < matrizA.length; i++) {
			for(int j = 0; j < matrizA[0].length; j++) {
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\nMatriz B:");
		for(int i = 0; i < matrizB.length; i++) {
			for(int k = 0; k < matrizB[0].length; k++) {
				System.out.print(matrizB[i][k] + " ");
			}
			System.out.println();
		}
		
		if(matrizB[0].length == matrizA.length) {
			System.out.println("\nO número de colunas da matriz A é igual ao número de linhas da matriz B. \nPortanto a multiplicação das matrizes é igual a:");
			for(int i = 0; i < resultado.length; i++) {
				for(int j = 0; j < matrizA.length; j++) {
					for(int k = 0; k < matrizB.length; k++) {
						resultado[i][j] = resultado[i][j] + (matrizA[i][k]*matrizB[k][j]);
					}
					System.out.print(resultado[i][j] + " ");
				}
				System.out.println();
			}
		}else {
			System.out.println("Não é possível obter a multiplicação das matrizes.");
		}
	}
}

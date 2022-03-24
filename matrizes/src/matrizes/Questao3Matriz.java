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
			System.out.println("\nO n�mero de colunas da matriz A � igual ao n�mero de linhas da matriz B. \nPortanto a multiplica��o das matrizes � igual a:");
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
			System.out.println("N�o � poss�vel obter a multiplica��o das matrizes.");
		}
	}
}

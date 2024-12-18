package countWords;

public class diagonalSum {

	public static void main(String[] args) {
		// 1. build our matrix
		// 2. populate with an example
		
		int row = 3;
		int column = 3; 
		
		// verify if is triangular: add validation later
		
		// example matrix
		int[][] matrixInput = new int[row][column];
		
		// iterate over the dimensions of the matrix 
		for( int i = 0; i < row; i++) {
			for( int j = 0; j < column; j++) {
				matrixInput[i][j] = (i + 1) * (j + 1);
				// i = 0; j = 0 ---> [1] [1] = mat[0,0] = 1
			}
		}
		
		for( int i = 0; i < row; i++) {
			for( int j = 0; j < column; j++) {
				System.out.print(matrixInput[i][j] + " ");
			}
			System.out.println();
		}
		
		int sum = 0;
		for( int i = 0, j = column - 1; i <= row - 1; i++, j--) {
				// primera vuelta --> i = 0, j = 2 
			// matrixInput[0][2] = {3} 
			// segunda vuelta ---> i = 1; j= 1 [1][1] = 4;
			// 3ra ---> =  i = 2; j = 0
			sum = sum + matrixInput[i][j];
			}
		if( sum % 2 == 0) {
			System.out.println("El determinante es par!");
		} else {
			System.out.println("El determinante es impar!");
		}

		}
	
	}
	


// primer elemento = r = 0, c = 2 
// 2do. r = 1, c = 1
// 3er. r = 2, c = 0   r --> 0 --> 2 /// c = n --> c = 0
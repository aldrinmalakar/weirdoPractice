import java.util.Scanner;

public class Array2DMatrix {

	/*
	 * Print the smallest number from a 3X3 Matrix
	 * 
	 * 56 36 59 
	 * 58 69 12 
	 * 47 36 25
	 * 
	 * This is just a 3x3 Array Row = 3, Column = 3
	 */

	public static void main(String[] args) {
		notMainMethod();
	}

	private static void notMainMethod() {
		int[][] matrix = new int[3][3];

		// Taking the user input
		Scanner userInput = new Scanner(System.in);
		System.out.println("PLease enter numbers");

		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.printf("Array Matrix [%d][%d]=", row, col);
				matrix[row][col] = userInput.nextInt();
			}
		}
		
		// Printing Array
		System.out.println("This is your array");
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print("\t" + matrix[row][col]);
			}
			System.out.println();
		}

		// Printing the smallest number out of the array
		
		int assumeMinimum = matrix[0][0];
		System.out.println("This is the smallest value: ");
				for (int row = 0; row < 3; row++) {
					for (int col = 0; col < 3; col++) {
						if (assumeMinimum > matrix[row][col]) {
							assumeMinimum = matrix[row][col];
						}
					}
				}
				System.out.println(assumeMinimum);
	}

}

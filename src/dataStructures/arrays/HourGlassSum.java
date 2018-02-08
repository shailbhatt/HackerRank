package dataStructures.arrays;

import java.util.Scanner;

/**
 * Context:
 * 
 * Given a 6X6 2D Array, A: 
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0 
 * 0 0 0 0 0 0 
 * 0 0 0 0 0 0 
 * 0 0 0 0 0 0
 * 
 * We define an hourglass in A to be a subset of values with indices falling in
 * this pattern in A's graphical representation: 
 * a b c 
 *   d 
 * e f g
 * 
 * There are 16 hourglasses in A, and an hourglass sum is the sum of an
 * hourglass' values.
 * 
 * OUTPUT: Print the largest (maximum) hourglass sum found in A.
 * 
 * @author SHAIL BHATT
 *
 */
public class HourGlassSum {
	static final int SIZE = 6;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] A = new int[SIZE][SIZE];
		for (int r = 0; r < SIZE; r++) {
			for (int c = 0; c < SIZE; c++) {
				A[r][c] = sc.nextInt();
			}
		}

		int result = Integer.MIN_VALUE;
		for (int i = 1; i <= SIZE - 2; i++) {
			for (int j = 1; j <= SIZE - 2; j++) {
				result = Math.max(result, A[i - 1][j - 1] + A[i - 1][j] + A[i - 1][j + 1] + A[i][j] + A[i + 1][j - 1]
						+ A[i + 1][j] + A[i + 1][j + 1]);
			}
		}
		System.out.println(result);

		sc.close();
	}
}

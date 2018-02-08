package dataStructures.arrays;

import java.util.Scanner;
//Input Format
/*The first line contains an integer, N (the number of integers in array, A ). 
The second line contains N space-separated integers describing A.*/


//Output Format: 
/*Print all N integers in A in reverse order as a single line of space-separated integers.*/
public class Arrays_DS {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}

		for (int i = n - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}

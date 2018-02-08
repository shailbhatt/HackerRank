package dataStructures.arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Create a list, seqList,N of empty sequences, where each sequence is indexed from 0 to N-1.
 * The elements within each of the N sequences also use 0-indexing. 
 * 
 * Create an integer,lastAnswer , and initialize it to 0.
 * 
 * The types of queries that can be performed
 * on your list of sequences (seqList) are described below:
 * 
 * Query: 1 x y 
 * 		Find the sequence,seq , at index ((x XOR lastAnswer)% N) in seqList. 
 * 		Append integer y to sequence seq. 
 * 
 * Query: 2 x y 
 * 		Find the sequence,seq , at index ((x XOR lastAnswer)% N) in seqList.
 * 		Find the value of element y%size in seq (where is the size of seq) and assign it to lastAnswer. 
 * 		Print the new value of lastAnswer on a new line 
 * 
 * Task 
 * Given N, Q, and Q queries, execute each query.
 * 
 * INPUT Format:
 * N Q
 * x y integer
 * ...
 * 
 * Output Format:
 * change of lastAnswer
 * 
 * @author SHAIL BHATT
 *
 */
public class DynamicArray {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int Q = scan.nextInt();

		ArrayList[] seqList = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			seqList[i] = new ArrayList<Integer>();
		}

		int lastAnswer = 0;

		for (int i = 0; i < Q; i++) {
			int t = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();

			ArrayList<Integer> seq = seqList[(x ^ lastAnswer) % N];

			switch (t) {
			case 1:
				seq.add(y);
				break;
			case 2:
				lastAnswer = seq.get(y % (seq.size()));
				System.out.println(lastAnswer);
				break;
			}
		}
	}
}

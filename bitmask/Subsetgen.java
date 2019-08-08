package kbits;

import java.util.ArrayList;
import java.util.Scanner;

public class Subsetgen {

	public static void main(String[] args) {
		int p; // size of collection
		ArrayList<Integer> collection = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		p = sc.nextInt();
		
		for (int i = 0; i < p; i++) {
			collection.add(sc.nextInt());
		}

		// there are 2^n possible subsets iterate over it
		for (int k = 1; k < Math.pow(2, p); k++) {			
			//try for each bit of each subset
			for (int index = 0; index < p; index++) {
				if (((k >> index) & 1) == 1) {
					// System.out.print(bars.get(index)+"+");
					System.out.print(collection.get(index)  + ",");
					
					//do things...
				}
			}
			System.out.println();
		}
	}
}

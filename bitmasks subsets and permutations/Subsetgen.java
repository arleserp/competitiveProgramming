/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;

/**
 *
 * @author Arles
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Subsetgen {

	public static void main(String[] args) throws IOException {
		int p; // size of collection
		ArrayList<Integer> collection = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		p = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < p; i++) {
			collection.add(Integer.parseInt(br.readLine()));
		}

		// there are 2^n possible subsets iterate over it
		for (int k = 0; k < (1 << p); k++) {			
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

/*
3
6
5
4

*/
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

public class Subsetgen {

    public static void main(String[] args) throws IOException {
        Long p; // size of collection
        ArrayList<Integer> collection = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        p = Long.parseLong(br.readLine());

        for (int i = 0; i < p; i++) {
            //collection.add(Integer.parseInt(br.readLine()));
            collection.add(i);
        }

        // there are 2^n possible subsets iterate over it
        for (long k = 0; k < (1L << p); k++) {
            //try for each bit of each subset+
            //System.out.println("k" + k);
            for (int i = 0; i < p; i++) {
                if (((k >> i) & 1) == 1) {
                    // System.out.print(bars.get(index)+"+");
                    System.out.print(collection.get(i) + ",");
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Arles
 */
public class SubsetArrayList {

    static ArrayList<String> subset = new ArrayList<>();
    static ArrayList<String> collection = new ArrayList<>();
    static int n = 3;

    private static void search(int k) {
        if (k == n + 1) {
            //process subset
            System.out.println(subset);
        } else {
            //agregar elemento k
            subset.add(collection.get(k - 1));
            search(k + 1);            
            // no agregarlo
            subset.remove(subset.size() - 1);            
            search(k + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            collection.add(br.readLine());
        }
        search(1);

    }
}

/*
4
P
T
D
C
*/
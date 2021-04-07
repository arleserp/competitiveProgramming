/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Arles
 */
public class SubsetBasic {

    
    static ArrayList<Integer> subset = new ArrayList<>();
    static int n = 5;

    private static void search(int k) {
        if (k == n + 1) {
            //process subset
            System.out.println(subset);
        } else {
            //incluye el elemento
            subset.add(k);
            search(k + 1);
            //no incluye el elemento
            subset.remove(subset.size() - 1);
            search(k + 1);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        search(1);
    }

}

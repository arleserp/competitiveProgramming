/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed2;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author Arles
 */
public class ED2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TreeSet<Integer> tree = new TreeSet<>();
        TreeSet<String> nombres = new TreeSet<>();

        tree.add(34);
        tree.add(45);
        tree.add(34);
        for (int i = 0; i < 10; i++) {
            tree.add(i);
        }
        System.out.println(tree);

        System.out.println("contiene 34: " + tree.contains(34));
        System.out.println("first: " + tree.first());

        nombres.add("Arles");
        nombres.add("Pedro");

        System.out.println(nombres);

        TreeSet<String> otros = new TreeSet<>();
        otros.add("Gerardo");
        otros.add("Jonatan");

        nombres.addAll(otros);
        System.out.println(nombres);
        ArrayList<String> masNombres = new ArrayList<>();
        masNombres.add("Harrison");

        nombres.addAll(masNombres);
        System.out.println(nombres);

        nombres = (TreeSet<String>) nombres.subSet("Gerardo", "Harrison");
        System.out.println("subset: " + nombres);

        nombres.retainAll(otros);
        System.out.println("nombres" + nombres);
        
        for (String nom : nombres) {
            System.out.println(nom);
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgraph;

import java.util.*;

/**
 *
 * @author Arles
 */
public class TreeSetExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            num.add(sc.nextInt());
        }
        System.out.println(num);
        TreeSet t = new TreeSet();
        t.addAll(num);
        System.out.println(t);
        System.out.println(t.size() != num.size());
    }
}

/*
10
8 2 2 3 3 3 3 3 3 8

5
1 2 3 4 5
*/
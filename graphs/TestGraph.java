/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Arles
 */
public class TestGraph {

    static int e; //vertices, arcos
    static HashMap<Integer, ArrayList<Integer>> ady = new HashMap<>(); //lista de Adyacencia
    static HashMap<Integer, Integer> distance = new HashMap<>();

    //Recibe el nodo inicial s
    static void bfs(int s) {
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        distance.put(s, 0);
        int actual, i, next;
        while (!q.isEmpty()) {
            actual = q.poll();
            for (i = 0; i < ady.get(actual).size(); i++) {
                next = ady.get(actual).get(i);
                if (!distance.containsKey(next)) {
                    distance.put(next, distance.get(actual) +1);                    
                    q.add(next);
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int origen, destino;
        Scanner sc = new Scanner(System.in);

        e = sc.nextInt();
        
        while (e > 0) {
            origen = sc.nextInt();
            destino = sc.nextInt();
            
            if(!ady.containsKey(origen)){
                ady.put(origen, new ArrayList<>());
            }
            if(!ady.containsKey(destino)){
                ady.put(destino, new ArrayList<>());
            }
                    
            ady.get(origen).add(destino);
            ady.get(destino).add(origen);
            e--;
        }
        
        System.out.println(ady);
        int node, ttl;
        
        while(true){
            node = sc.nextInt();
            ttl = sc.nextInt();
            if(node == 0 && ttl == 0){
                break;
            }
            System.out.println("Query: " + node + " - " + "ttl: " + ttl);
            init();
            bfs(node);
            //System.out.println("distance: " + distance);
            for(Integer k: distance.keySet()){
                if(distance.get(k) > ttl){
                    System.out.println("node " + k + " reachable from " + node + " with TTL: " + distance.get(k));
                }
            }
        }
    }

    private static void init() {
        distance.clear();
    }

}

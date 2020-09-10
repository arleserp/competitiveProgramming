/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatosjava;

import java.util.PriorityQueue;

/**
 *
 * @author Arles
 */
public class ColaPrioObj {

    static PriorityQueue<Pair> pq = new PriorityQueue<Pair>();

    private static void solve(){
        pq.add(new Pair(2,3));
        pq.add(new Pair(5,1));
        pq.add(new Pair(7,2));
        pq.add(new Pair(8,7));
        
        while(!pq.isEmpty()){
            System.out.println(pq.poll());            
        }    
    }
    
    public static void main(String[] args) {
        solve();
    }
}

class Pair implements Comparable<Pair> {
    int x;
    int y;
    
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Pair o) {
        return this.y - o.y;
    }

    @Override
    public String toString() {
        return "Pair{" + "x=" + x + ", y=" + y + '}';
    }
    
    
}

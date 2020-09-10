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
public class ColaPrioridad {
    static PriorityQueue<Integer> pq = new PriorityQueue<>();
    
    public static void solve(){
        pq.add(1000);
        pq.add(2000);
        pq.add(9);
        pq.add(0);
        pq.add(-1);
        
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
                
    }
    public static void main(String[] args) {
        solve();
    }
    
}

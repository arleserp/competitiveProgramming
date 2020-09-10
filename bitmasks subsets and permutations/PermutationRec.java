/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;

import java.util.ArrayList;

/**
 *
 * @author Arles
 */
public class PermutationRec {
    static int n;
    static boolean[] chosen;
    static ArrayList<Integer> permutation = new ArrayList<>();
    
    private static void search(){
        if(permutation.size() == n){
            //process permutation        
            //System.out.println(permutation);
        }else{
            for(int i=1; i <=n; i++){
                if(chosen[i]){
                    continue;                                    
                }
                chosen[i] = true;
                permutation.add(i);
                search();
                chosen[i] = false;
                permutation.remove(permutation.size()-1);
            }        
        }    
    }
    
    public static void main(String[] args) {
        n = 10;
        chosen = new boolean[n+1];
        search();
        
    }
}

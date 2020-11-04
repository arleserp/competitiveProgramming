/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp;

/**
 * Este código se puede y se va a mejorar!
 * No tiene memorización
 * @author Arles
 */
public class CoinChange0 {
    static int oo = 1<<20;
    static int[] coins =  {1, 3, 4, 7};
    
    static int coinChange(int x){
        if(x == 0){
            return 0;
        }
        if(x < 0){
            return oo;
        }
        int min = oo;
        for (int i = 0; i < coins.length; i++) {
            min = Math.min(coinChange(x-coins[i])+1, min);            
        }
        return min;
    }
    
    public static void main(String[] args) {
        System.out.println(coinChange(100));
        
    }
}

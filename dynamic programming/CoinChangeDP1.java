/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp;

import java.util.Arrays;

/**
 *
 * @author Arles
 */
public class CoinChangeDP1 {
 
    static int oo = 1<<9;
    static int[] coins =  {1, 3, 4, 7};
    static int[][] memo = new int[4001][2002]; //X va hasta 4000 i va hasta 2000
    
    static int coinCh(int x, int i){
        if(x < 0){
            return oo;
        }
        if(i < 0 && x == 0){
            return 0;
        }
        if(i < 0 && x != 0){
            return oo;
        }
        if(memo[x][i] != -1){
            return memo[x][i];
        }
        return memo[x][i] = Math.min(coinCh(x-coins[i], i) + 1, coinCh(x, i-1));
    }
    
    public static void main(String[] args) {
        for (int i = 0; i < memo.length; i++) {
            Arrays.fill(memo[i], -1);
        }
        
        
        int X = 4000;
        int n = coins.length;
        
        for (X = 1; X <= 4000; X++) {
            System.out.println(coinCh(X, n-1));    
        }
        
        
        /*for (int x = 0; x <= X ; x++) {
            for (int i = 0; i < n; i++) {
                System.out.print(memo[x][i] + " ");
            }
            System.out.println("");
        }*/
    }
}

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
public class CoinChangeDP1BottomUp {
 
    static int oo = 1<<9;
    static int[] coins =  {1, 3, 4, 7};
    static int[][] memo = new int[4001][2002]; //X va hasta 4000 i va hasta 2000
    
    static int coinCh(int X, int n){
        for (int i = 0; i < n; i++) {
            memo[0][i] = 0;
        }
        
        for (int x = 1; x <= X; x++) {
            for (int i = 0; i < coins.length; i++) {
                memo[x][i] = oo;
                if(x-coins[i] >= 0){ //escoger la moneda
                    memo[x][i] = Math.min(memo[x-coins[i]][i] + 1, memo[x][i]);
                }
                if(i-1 >= 0){ //no escoger la moneda
                    memo[x][i] = Math.min(memo[x][i-1], memo[x][i]);
                }
            }
        }
        return memo[X][n-1];
     }
    
    public static void main(String[] args) {
        for (int i = 0; i < memo.length; i++) {
            Arrays.fill(memo[i], -1);
        }
        int X = 4000;
        int n = coins.length;
        coinCh(X, n);
        
        for (X = 1; X <= 4000; X++) {
            System.out.println(memo[X][n-1]);
            //System.out.println(coinCh(X, n-1));    
        }
       /* 
        for (int x = 0; x <= X; x++) {
            for (int i = 0; i < coins.length; i++) {
                System.out.print(memo[x][i] + " ");
            }
            System.out.println("");
        }*/
    }
}

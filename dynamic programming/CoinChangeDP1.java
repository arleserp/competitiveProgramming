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
 
    static int oo = 1<<20;
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
        System.out.println(coinCh(125, coins.length-1));
    }
}

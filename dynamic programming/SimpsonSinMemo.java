/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp;

import java.math.BigInteger;

/**
 *
 * @author Arles
 */
public class SimpsonSinMemo {
    static long[][] dp = new long[1001][1001];   
    //BigInteger
    
    static void init(){
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
    }   
    
    static long C(int n, int k){
        if(dp[n][k] != -1){
            return dp[n][k];
        }
        if(k > n){
            return dp[n][k] = 0;
        }
        if(k == 0 || n == k){
            return dp[n][k] =  1;
        }
        return dp[n][k] =  C(n-1, k-1)+C(n-1, k);
    }
    
    public static void main(String[] args) {
        init();
        System.out.println(C(200,60));
    }
}

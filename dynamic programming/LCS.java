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
public class LCS {
    static String a;
    static String b;
    static int[][] dp = new int[2000][2000];
    
    public static int lcs(int i, int j){
        if(i == a.length()){
            return 0;
        }
        if(j == b.length()){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(a.charAt(i) == b.charAt(j)){
            return dp[i][j] = 1 + lcs(i+1, j+1);
        }
        return dp[i][j] = Math.max(lcs(i+1, j), lcs(i, j+1));    
    }
    
    public static void main(String[] args) {
        a = "anitalava";
        b = "atnivaac";
        
        for (int i = 0; i < 2000; i++) {
            Arrays.fill(dp[i], -1);
        }        
        System.out.println(lcs(0, 0));
    }
}


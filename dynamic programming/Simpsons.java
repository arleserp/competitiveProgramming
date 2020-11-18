/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp;

/**
 *
 * @author Arles
 */
public class Simpsons {
    public static long[][] dp = new long[51][51];
 
    public static long C(int n, int k){
        if(dp[n][k] != -1){
            return dp[n][k];
        }
        if(n == k || k == 0){
            return dp[n][k] = 1;
        }
        return dp[n][k] = C(n-1, k-1) + C(n-1, k);
    }
    
    public static void main(String[] args) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        /*
        for (int n = 0; n < 5; n++) {
            for (int k = 0; k < n; k++) {
                System.out.println(n + "," + k + "=" + C(n,k));
            }
            
        }*/
        C(50,50);
        
        System.out.println(C(4,2));
        System.out.println(C(49,2));
        System.out.println(C(50,50));
        
    }
    
}

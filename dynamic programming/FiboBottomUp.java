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
public class FiboBottomUp {

    static int MAX = 51;
    static long[] dp = new long[MAX];

    public static void init() {
        for (int i = 0; i < MAX; i++) {
            dp[i] = -1;
        }
        //Arrays.fill(dp, -1);
    }

    public static long fibo(int n) {        
        dp[0] = 0;
        dp[1] = 1;        
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        init();
        fibo(50);
        for (int i = 0; i <= 50; i++) {
            System.out.println(i + ":" + dp[i]);
        }

    }
}

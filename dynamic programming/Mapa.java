/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp;

import java.util.Scanner;

/**
 *
 * @author Arles
 */
public class Mapa {

    static int[][] M;
    static Scanner sc = new Scanner(System.in);
    static int oo = 1 << 9;
    static int n, m;
    static int[][] dp;

    public static int solve(int i, int j) {

        if (i < 0 || i >= n) {
            return oo;
        }
        if (j < 0 || j >= m) {
            return oo;
        }
        if (i == n - 1 && j == m - 1) {
            return M[i][j];
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        return dp[i][j] = Math.min(solve(i + 1, j) + M[i][j], solve(i, j + 1) + M[i][j]);
    }

    public static void main(String[] args) {
        n = 4;
        m = 4;
        M = new int[n][m];
        dp = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                M[i][j] = sc.nextInt();
                dp[i][j] = -1;
            }
        }
        System.out.println(solve(0, 0));
    }
}
/*
5 1 3 2
5 4 10 20
3 20 20 3
50 0 4 50

*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;

/**
 *
 * @author Arles
 */
import java.util.Scanner;

/**
 * Utility class to generate permutations from bitmasks
 *
 * @author arlese.rodriguezp
 *
 */
public class PermutationsDP {

    static int N; // number of bars
    static int[] values; // values of histogram
    static int[][] count = new int[15][1 << 15];
    static int[][] dp = new int[15][1 << 15]; // Store combination of bar in position i vs mask result of puting i in
    // pos

    // Try putting current in a determined mask
    static int solve(int curr, int mask) {
        System.out.println("curr:" + curr); // + ", mask:" +
        // Integer.toBinaryString(mask));

        if (mask == 0) { //all bits of mask in zero stop
            System.out.println();
            count[curr][mask] = 1;
            return values[curr];
        }
        if (dp[curr][mask] != -1) {
            return dp[curr][mask];
        }
        int ans = 0, temp;

        for (int i = 0; i < N; i++) {
            if ((mask & (1 << i)) != 0) {
                System.out.print("---> Try " + values[i] + ",");
                temp = solve(i, mask ^ (1 << i));  // here play with dp 

            }

        }
        System.out.println();
        return dp[curr][mask] = ans; //assing dp
    }

    public static void initMemo() {
        for (int i = 0; i < 15; i++) {
            for (int j = 0; (j < (1 << 15)); j++) {
                dp[i][j] = -1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        while (N != 0) {
            initMemo();

            //Create and read values
            values = new int[N];
            for (int i = 0; i < N; i++) {
                values[i] = sc.nextInt();
            }

            int maxPer = 0, fin = 0, temp = 0;

            //allmask starts with all in one values
            int allmask = (1 << N) - 1;
            //System.out.println("all mask: " + Integer.toBinaryString(allmask));

            //Assign each bar 
            for (int i = 0; i < N; i++) {
                //Put i in position 1 << i by lefting this value in zero
                System.out.println("put " + values[i] + " in position " + i);
                maxPer = solve(i, allmask ^ (1 << i)) + values[i] + 2;

            }

            N = sc.nextInt();
        }

    }
}

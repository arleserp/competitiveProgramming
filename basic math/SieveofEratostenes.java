/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicasbasiquitas;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Arles
 */
public class SieveofEratostenes {

    static int MAX = 1000000;
    static int SQRT = 1000;
    static ArrayList<Integer> primes = new ArrayList<>();
    static boolean marked[] = new boolean[MAX + 1];
    static ArrayList<Integer> factors = new ArrayList<>();

    public static void primeFactors(int n) {
        factors.clear();
        for (int i = 0, p = primes.get(i); p * p <= n; p = primes.get(++i)) {
            while (n % p == 0) {
                factors.add(p);
                n /= p;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
    }

    static void sieve() {
        marked[1] = true;
        int i = 2;
        for (; i <= SQRT; ++i) {
            if (!marked[i]) {
                primes.add(i);
                for (int j = i * i; j <= MAX; j += i) {
                    marked[j] = true;
                }
            }
        }
        for (; i <= MAX; ++i) {
            if (!marked[i]) {
                //System.out.println("no markadooo" + i);
                primes.add(i);
            }
        }
    }

    public static void main(String[] args) {
        sieve();
        //System.out.println(primes);
        primeFactors(24);
        System.out.println(factors);
    }
}

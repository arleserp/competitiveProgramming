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
public class Knapsack {

    static int N; //Numero de objetos 
    static int prices[]; //precios de cada producto
    static int weights[]; //pesos de cada producto
    static long memo[][]; //DEBE INICIALIZARSE EN -1 y/o null

    static long knapsack(int id, int w) {
        if (id == N || w == 0) {
            return 0;
        }
        if (memo[id][w] != -1) {
            return memo[id][w];
        }
        if (weights[id] > w) {
            return memo[id][w] = knapsack(id + 1, w);
        } else {
            return memo[id][w] = Math.max(knapsack(id + 1, w), prices[id] + knapsack(id + 1, w - weights[id]));
        }
    }

    static void init() {
        for (int i = 0; i < N; i++) {
            Arrays.fill(memo[i], -1);
        }
    }

    public static void main(String[] args) {
        int W = 15;
        N = 5;
        weights = new int[N];
        prices = new int[N];
        memo = new long[N+1][W+1];
        weights[0] = 12;
        weights[1] = 2;
        weights[2] = 1;
        weights[3] = 1;
        weights[4] = 4;
        prices[0] = 4;
        prices[1] = 2;
        prices[2] = 2;
        prices[3] = 1;
        prices[4] = 10;
        init();
        System.out.println(knapsack(0, W));

    }
}

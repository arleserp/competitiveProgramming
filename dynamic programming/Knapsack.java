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
public class Knapsack {

    static int N; //Numero de objetos 
    static int prices[]; //precios de cada producto
    static int weights[]; //pesos de cada producto
    static int memo[][]; //DEBE INICIALIZARSE EN -1 y/o null


    static int knapsack(int id, int w) {
        if (id == N || w == 0) {
            return 0;    
        }
        if (weights[id] > w) {
            return knapsack(id + 1, w);
        } else {
            return  Math.max(knapsack(id + 1, w), prices[id] + knapsack(id + 1, w - weights[id]));
        }
    }
    
    public static void main(String[] args) {
        int W = 15;
        N = 5;
        weights = new int[N];
        prices = new int[N];
        weights[0] = 12;
        weights[1] = 2;
        weights[2] = 1;
        weights[3] = 1;
        weights[4] = 4;
        prices[0] = 4;
        prices[1] = 2;
        prices[2] = 2;
        prices[3] = 1;
        prices[4] =10;
        System.out.println(knapsack(0,W));
        
        
    }
}

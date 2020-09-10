/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatosjava;

import java.util.Arrays;

/**
 *
 * @author Arles
 */
public class Arreglos {
    static int MAX = 1000;
    static int[] datos = new int[MAX];
    static double[] numeros = new double[MAX];
    static int[][] dp = new int[MAX][MAX];
    
    public static void main(String[] args) {
        Arrays.fill(datos, -1);
        Arrays.sort(dp);
    }
    
}

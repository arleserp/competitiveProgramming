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
public class PermutacionesMal {

    public static void main(String[] args) {
        int i = 0, j = 0, k = 0;
        
        for (i = 1; i <= 3; i++) {
            for (j = 1; j <= 3; j++) {
                for (k = 1; k <= 3; k++) {                    
                    if (i != j && j != k && i != k) {
                        System.out.println(i + "," + j + "," + k);
                    }
                }
            }
        }
    }
}

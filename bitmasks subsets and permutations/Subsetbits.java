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
public class Subsetbits {

    public static void main(String[] args) {
        int n = 3;
        for (int b = 0; b < (1 << n); b++) {
            System.out.println(b);
        }
    }
}

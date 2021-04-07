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
public class Bitmask1 {

    public static void main(String[] args) {
        int x = 5;
        for (int k = 31; k >= 0; k--) {
            if ((x & (1 << k)) != 0) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }

}

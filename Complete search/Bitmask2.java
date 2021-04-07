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
public class Bitmask2 {

    public static void main(String[] args) {
        int x = 0;
        x |= (1 << 1);
        x |= (1 << 3);
        x |= (1 << 4);
        x |= (1 << 8);
        for (int i = 0; i < 32; i++) {
            if ((x & (1 << i)) != 0) {
                System.out.println(i);
            }
        }
    }

}

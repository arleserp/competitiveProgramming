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
public class Subset3 {

    public static void main(String[] args) {
        long iNumeroPotencias = 40;

        for (long x = 0; x <= iNumeroPotencias; x++) {
            System.out.println("2 elevado a " + x + " igual a " + (1 << x));
        }
    }
}


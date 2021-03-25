/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicasbasiquitas;

/**
 *
 * @author Arles
 */
public class MatematicasBasiquitas {
    
    static int mcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        return mcd(q, p % q);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int q1 = 48 / 8; // q1 == 6        
        int r1 = 48 % 8; // r1 == 0 
        System.out.println(q1);
        System.out.println((r1+8)%8);
        System.out.println("3/4=" + 3/4);
        
        int q = -11 / 5;
        int r = -11 % 5;
        System.out.println(q);
        System.out.println((r+5)%5);

    }

}

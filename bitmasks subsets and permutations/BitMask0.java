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
public class BitMask0 {
    public static void main(String[] args) {
        int a = 22; //10110
        int b = 26; //11010        
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);        
        
        int c = 29;        
        System.out.println(~c);
        System.out.println(Integer.bitCount(c));
        
        System.out.println("----------");
        for (int i = 0; i < 31; i++) {
            System.out.println(1 << i);
        }
        System.out.println("----------");
        for (long i = 0; i < 63; i++) {
            long corr = 1L << i;
            System.out.println(Long.toBinaryString(corr) + " , " + (corr));
        }
        
        System.out.println("Set bit en 1");
        int B = 0;
        B = B | (1 << 3); //set bit
        System.out.println(B);
        System.out.println(Integer.toBinaryString(B));
        
        System.out.println("Unset bit");        
        B = B & ~(1 << 3); //set bit
        System.out.println(B);
        System.out.println(Integer.toBinaryString(B));
        
        System.out.println("validate bit in one");
        
        if((B & (1<<3)) != 0){
            System.out.println("El bit está prendido");
        }
        B = B | (1 << 3); //set bit
        if((B & (1<<3)) != 0){
            System.out.println("El bit está prendido");
        }
        System.out.println(Integer.toBinaryString(B));
        B =B ^ (1<<1); //swap bit
        System.out.println(Integer.toBinaryString(B));
        
        //B = (1<<n)-1
    }
}


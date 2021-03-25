/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicasbasiquitas;

import java.math.BigInteger;

/**
 *
 * @author Arles
 */
public class mcdlento {
    //2<=a,b<=1e18
    //O(n)
    //comp: 10^8 --- 1s
    //      10^8*10 = 10^9 ---> 10s
    //      10^10 -----> 100s
    //      10^8*10^10-->  10^10s  
    static long mcdlento(long a, long b) {
        long res = 1;
        for (long i = 2; i < Math.min(a, b); i++) { //O(min(a,b))
            if (a % i == 0 && b % i == 0) {
                res = i;
            }
        }
        return res;
    }

    
    //2<=a,b<=1e18
    //O(max(log(p),log(q))) 
    //10^8--->1s
    //36 <<<<<<<<<<<<<<< 1s
    static long mcd(long p, long q) {
        if (q == 0) {
            return p;
        }
        return mcd(q, p % q);
    }

    
    public static void main(String[] args) {
        //System.out.println(mcd(32, 36));
        long a = 982637483627383736l;
        long b = 538262936352427l;        
        
        //System.out.println(mcdlento(36, 32));
        System.out.println("mcd lento:" + mcdlento(a, b));
        //System.out.println("Euclides: " + mcd(a, b));
        //System.out.println(mcd(36, 32));
        //System.out.println(a/mcd(a,b)*b);
        
        /*BigInteger ba = new BigInteger(a+"");
        BigInteger bb = new BigInteger(b+"");
        System.out.println("mcm:" + ba.divide(ba.gcd(bb)).multiply(bb));
        //System.out.println(mcdlento(982637483627383736l, 538262936352427l));*/
    }
}

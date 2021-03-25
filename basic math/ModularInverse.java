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
public class ModularInverse {

    static int x, y;

    /// O(log(max(a, b)))
    static long extendedEuclid(int a, int b) {
        if (b == 0) {
            x = 1;
            y = 0;
            return a;
        }
        long d = extendedEuclid(b, a % b);
        int aux = x;
        x = y;
        y = aux - ((a / b) * y);
        return d;
    }

    /*El inverso multiplicativo modular de a % mod 
        es un entero b tal que (a*b) % mod = 1.
        Éste existe siempre y cuando a y mod sean coprimos (gcd(a, mod) = 1).    
        El inverso modular de a se utiliza para calcular
        (n/a) % mod como (n*b) % mod = (n%mod)*(b*mod). 
       Se puede calcular usando el algoritmo de Euclides extendido. 
     */
    public static long modInverse(int a, int mod) {
        long d = extendedEuclid(a, mod);
        if (d > 1) {
            return -1;
        }
        return (x % mod + mod) % mod;
    }

    //Realiza la operación (a ^ b) % mod.
    static long modpow(long a, long b, long mod) {
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            long temp = modpow(a, b / 2, mod);
            return (temp * temp) % mod;
        } else {
            long temp = modpow(a, b - 1, mod);
            return (temp * a) % mod;
        }
    }

    /* Si mod es un número primo, se puede calcular aplicando el pequeño teorema de Fermat. Agregar Modular Exponentiation.*/
    public static long modInversePrime(int a, int mod) {
        return modpow(a, mod - 2, mod);
    }

    /**
     * Calcular el inverso modular para todos los numeros menores a mod.
     */
    static int inv[];

    public static void modInverse(int mod) {
        inv = new int[mod];
        inv[1] = 1;
        for (int i = 2; i < mod; i++) {
            inv[i] = (mod - (mod / i) * inv[mod % i] % mod) % mod;
        }
    }

    
    public static void main(String[] args) {
        System.out.println(modInversePrime(283495683, 5));
        System.out.println(modInverse(4, 5));        
    }
}

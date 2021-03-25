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
public class EsPrimo {
    static boolean esPrimo(int n){
        for(int i=2; i*i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(esPrimo(998244353));
    }

}

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
public class CongruenciasCaesar {

    /*
        -b <= a%b <= b
    =>  0 <= a%b + b <= 2*b    
     */
    static int resto(int a, int b) {
        return (a % b + b) % b; //siempre el resto queda entre 0 y b
    }

    static char cesar(char plain, int key) {
        return (char) ((plain + key - 'a') % 26 + 'a');
    }

    static char cesarInv(char plain, int key) {
        char des = (char) ((plain - key - 'a') % 26 + 'a');
        if (des < 'a') {
            des = (char) ((plain - key - 'a' + 'z') + 1);
        }
        return des;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 30; i+=5) {
            System.out.println(resto(8 + 13 * i, 5));
        }
        
        String s = "holaamigos", cifrado, descifrado = "";
        cifrado = "";
        for (char c : s.toCharArray()) {
            cifrado += cesar(c, 3);
        }

        System.out.println(cifrado);
        for (char c : cifrado.toCharArray()) {
            descifrado += cesarInv(c, 3);
        }
        System.out.println(descifrado);
    }
}

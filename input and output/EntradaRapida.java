/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication63;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Arles
 */
public class EntradaRapida {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        int a = Integer.parseInt(br.readLine());
        double d = Double.parseDouble(br.readLine());
        String s = br.readLine();
        System.out.println("a " + a);
        System.out.println("d " + d);
        System.out.println("s " + s);
        System.out.printf("a: %d, d: %.2f nombre:%s", a, d, s);
        
        // + - * / += -= % 
    }
}

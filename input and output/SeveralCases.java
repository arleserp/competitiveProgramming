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
public class SeveralCases {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            int k = Integer.parseInt(br.readLine());
            if(k == 0){
                break;
            }
            int n, m;        
            String[] centro = br.readLine().split(" ");
            n = Integer.parseInt(centro[0]);
            m = Integer.parseInt(centro[1]);

            System.out.println("centro " + n + "," + m);

            for (int i = 0; i < k; i++) { //codigo corre k veces
                String[] punto = br.readLine().split(" ");
                int x = Integer.parseInt(punto[0]);
                int y = Integer.parseInt(punto[1]);
                System.out.println("punto " + x + "," + y);       
                //Aquí van los condicionales que resuelven el problema
            }
        }
        br.close();
    }
}

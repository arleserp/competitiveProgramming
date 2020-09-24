/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Arles
 */
public class BinarySearchRecursive {

    public static double F(double x){
        return x*x;    
    }
    
    public static double binary_search(double st, double end, double num) {
        double mid = (st + end) / 2;
        //if(Math.abs(st-end) < 1e-5 || Math.abs(F(mid)-num) < 1e-4){
        if(Math.abs(st-end) < 1e-5 || Math.abs(F(mid)-num) < 1e-4){
            return mid;
        }else if(F(mid) < num){
            return binary_search(mid, end, num);
        }else{
            return binary_search(st, mid, num);
        }
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double num = Double.parseDouble(br.readLine());
        System.out.println(binary_search(0, num, num));
    }

}

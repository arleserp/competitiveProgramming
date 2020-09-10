/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatosjava;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Arles
 */
public class TestArrayList {
    static ArrayList<Double> datos = new ArrayList<>();
    
    public static void solve(){
        datos.add(5.0);
        datos.add(6.0);
        datos.add(7.0);
        Collections.sort(datos, Collections.reverseOrder());
        
        System.out.println(datos);
        
               
    }
    
    public static void main(String[] args) {
        solve();
    }
}

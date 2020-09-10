/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed2;

import java.util.TreeMap;

//Declaración de un TreeMap
/**
 *
 * @author Arles
 */
public class TreeMapExample {

    public static void main(String[] args) {

        TreeMap<String, Double> notas = new TreeMap<>();
        notas.put("Gonzalo", 4.5);
        notas.put("Felipe", 3.2);
        notas.put("Arles", 5.0);

        //System.out.println(notas);
        

        for (String nombre : notas.keySet()) {
            System.out.println(notas.get(nombre));
        }

    }

}

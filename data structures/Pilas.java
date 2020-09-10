/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatosjava;

import java.util.Stack;

/**
 *
 * @author Arles
 */
public class Pilas {
    static Stack<Character> st = new Stack<>();
    
    public static void solve(){
        Character o = 'o'; 
        
        st.push(o);
        st.pop();
        System.out.println(st.empty());
    
    }
    
    public static void main(String[] args) {
        solve();
    }
    
}

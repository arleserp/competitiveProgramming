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
public class ExtendedEuclides {

    //El algoritmo de Euclides extendido retorna   el gcd(a, b)  y calcula los coeficientes enteros X y Y que satisfacen la ecuación: a*X + b*Y = gcd(a, b).
    static int x, y;
    /// O(log(max(a, b)))

    static int euclid(int a, int b) {
        if (b == 0) {
            x = 1;
            y = 0;
            return a;
        }
        int d = euclid(b, a % b);
        int aux = x;
        x = y;
        y = aux - ((a / b) * y);
        return d;
    }

    public static void main(String[] args) {
        euclid(5, 3);
        System.out.println(x + "," + y);
    }
}

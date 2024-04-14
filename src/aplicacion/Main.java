package aplicacion;

import operaciones.CalculadoraDistancias;

/**
 * @author Raul Quintano
 * 
 * 
 * 
 */
public class Main {

    public static void main(String[] args) {
        
        String s1 = "aabbc";
        String s2 = "abaa";
        int m = s1.length();
        int n = s2.length();

        /**
         * @param s1, primera cadena
         * @param s2, segunda cadena
         * @param m, longitud primera cadena
         * @param n, longitud segunda cadena
         */

      
        System.out.println("Las cadenas son: " + CalculadoraDistancias.CalculadoraDistancia(s1 , s2, m, n ));
    }
}
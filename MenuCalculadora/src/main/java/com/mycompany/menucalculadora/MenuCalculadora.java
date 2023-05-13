/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.menucalculadora;

/**
 *
 * @author aluno
 */
public class MenuCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora ();
        
 

        
        int re1 = calc.soma(2, 3);
        System.out.println("2 + 3 = " + re1);

        
        double re2 = calc.soma(2.5, 3.5);
        System.out.println("2.5 + 3.5 = " + re2);

       
        int re3 = calc.soma(2, 3, 4);
        System.out.println(" 2 + 3 + 4 = " + re3); 
    }
}



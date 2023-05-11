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
        
        int resultado1 = calc.somar (2,3);
        double resultado2 = calc.somar (2.5, 3.5);
        int resultado3 = calc.somar (2,3,4);
    }
}

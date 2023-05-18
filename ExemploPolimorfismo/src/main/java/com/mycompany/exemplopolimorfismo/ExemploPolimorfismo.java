/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplopolimorfismo;

/**
 *
 * @author aluno
 */
public class ExemploPolimorfismo {

    public static void main(String[] args) {
        Circulo forma = new Circulo();
        forma.desenhar(10);//IMPRIME "DESENHANDO CÍRCULO."
        
        
        
        Quadrado quadro = new Quadrado();
        quadro.desenhar(); // IMPRIME "DESENHANDO QUADRADO."
    }
}

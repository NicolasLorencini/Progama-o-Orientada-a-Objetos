/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe1;

/**
 *
 * @author aluno
 */
public class Exe1 {

    public static void main(String[] args) {
        Desenhavel circulo = new Circulo();
        Desenhavel retangulo = new Retangulo();
        Desenhavel triangulo = new Triângulo();
        
        circulo.desenhar();
        retangulo.desenhar();
        triangulo.desenhar();
    }
}

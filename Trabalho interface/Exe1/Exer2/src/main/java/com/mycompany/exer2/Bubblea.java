/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exer2;

/**
 *
 * @author aluno
 */
public class Bubblea {
     int[] numeros = { 33,56,87,96,32,1,2,5,6 };
     
     public void ordenar() {
        

        boolean ab = true;

        while (ab) {
            ab = false;

            for (int i = 0; i < numeros.length - 1; i++) {
                if (numeros[i] > numeros[i + 1]) {
                    int aux = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = aux;
                    ab = true;
                }
            }
        }
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
     }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.somanumeros;

import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class SomaNumeros {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Double num1, num2, num3;
        
       System.out.print("Selecione um número: ");
       num1 = ler.nextDouble();
       
       System.out.print("Selecione outro número: ");
       num2 = ler.nextDouble();
       
       num3 = num1 + num2;
       
       System.out.println("O número somado foi: " +num3 );
    }
}

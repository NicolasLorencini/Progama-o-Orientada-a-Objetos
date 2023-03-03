/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.areacirculo;

import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class Areacirculo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe o raio do circúlo: ");
        Double raio = ler.nextDouble();
        
        //int pi = (22/7);
        
        Double area = (22 * raio*raio)/7;
        
        //Double area = (raio * raio *pi);
        
        System.out.println("A área total do circúlo em cm é: " + area);
        System.out.println("A área total do circúlo em metros é: " + area/100);
    }
}

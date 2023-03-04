/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.forexercicio;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class Forexercicio {

    public static void main(String[] args) {
        int n, soma=0;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Quantos números deseja somar: ");
        
        n = s.nextInt();
        int a [] = new int [n];
        System.out.println("Informe quantos números deseja somar: ");
        System.out.println("Informe o " + n + " número: ");
        for (int i = 0; 1 < n; i++){
            System.out.println("Informe o " + (1+1) + " números: ");
            a[1]=s.nextInt();
        }
        for (int i = 0; i < n; i++){
            soma+= (a[1]);
        }
        System.out.println("O resultado da soma dos "+ n +" números é: "+soma);
    }
}

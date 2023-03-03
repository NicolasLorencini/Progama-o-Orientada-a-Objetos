/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio2;

import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class Exercicio2 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        
        System.out.println("Informe seu nome: ");
        String nome = ler.nextLine();
        
        System.out.println("Informe seu sexo: ");
        char sexo = ler.nextLine().charAt(0);
        
        System.out.println("Seu nome é "+ nome + " e seu sexo é " +sexo );
        
        sexo = Character.toUpperCase(sexo);
                
        
        switch (sexo) {
            case 'M':
                System.out.println("Mascuilno");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            case 'G':
                System.out.println("Gay");
                break;
            case 'L':
                System.out.println("Lésbica");
                break;
            default:
                System.out.println("Programador");
                break;
        }
        }
    }


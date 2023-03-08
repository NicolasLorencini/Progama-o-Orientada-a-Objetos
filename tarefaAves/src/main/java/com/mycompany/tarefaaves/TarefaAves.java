/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarefaaves;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TarefaAves {
    
    String cor;
    String corOlhos;
    String sexo;
    double peso;
    int idade;

    public static void main(String[] args) {
       
        Scanner ler = new Scanner(System.in);
   
        
        TarefaAves aurora = new TarefaAves();
        aurora.cor = "Azul";
        aurora.corOlhos = "Preto";
        aurora.sexo = "F";
        aurora.peso = 1.5;
        aurora.idade = 10;
        
        TarefaAves cris = new TarefaAves();
        cris.cor = "Preto";
        cris.corOlhos = "Azul";
        cris.sexo = "M";
        cris.peso = 110;
        cris.idade = 5;
        
        TarefaAves marcos = new TarefaAves();
        marcos.cor = "Verde";
        marcos.corOlhos = "Preto";
        marcos.sexo = "M";
        marcos.peso = 70;
        marcos.idade = 7;
        
        TarefaAves cristina = new TarefaAves();
        cristina.cor = "Vermelho";
        cristina.corOlhos = "Preto";
        cristina.sexo = "F";
        cristina.peso = 1.0;
        cristina.idade = 13;
        
        TarefaAves punpun = new TarefaAves();
        punpun.cor = "Laranja e preto";
        punpun.corOlhos = "Preto";
        punpun.sexo = "F";
        punpun.peso = 65;
        punpun.idade = 1;
        
    }
}

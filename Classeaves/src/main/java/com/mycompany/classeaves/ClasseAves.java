/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classeaves;

/**
 *
 * @author Administrator
 */

public class ClasseAves {
    
    public static void main(String[] args) {
       
       
         
         Separacao [] Separacao1 = new Separacao[5];
        
        
        Separacao aurora = new Separacao();
        aurora.cor = "Azul";
        aurora.corOlhos = "Preto";
        aurora.sexo = "F";
        aurora.peso = 1.5;
        aurora.idade = 10;
        aurora.tamanho = 90;
        
        Separacao cris = new Separacao();
        cris.cor = "Preto";
        cris.corOlhos = "Azul";
        cris.sexo = "M";
        cris.peso = 110;
        cris.idade = 5;
        cris.tamanho = 9;
        
        Separacao marcos = new Separacao();
        marcos.cor = "Verde";
        marcos.corOlhos = "Preto";
        marcos.sexo = "M";
        marcos.peso = 70;
        marcos.idade = 7;
        marcos.tamanho = 63;
        
        Separacao cristina = new Separacao();
        cristina.cor = "Vermelho";
        cristina.corOlhos = "Preto";
        cristina.sexo = "F";
        cristina.peso = 1.0;
        cristina.idade = 13;
        cristina.tamanho = 45;
        
        
        Separacao punpun = new Separacao();
        punpun.cor = "Laranja e preto";
        punpun.corOlhos = "Preto";
        punpun.sexo = "F";
        punpun.peso = 65;
        punpun.idade = 1;
        punpun.tamanho = 20;
 
        
        
        for (int i=0; i<5 ;i++) {
             System.out.println("--------------------------------------------");
             System.out.println("cor: " + Separacao1[i].getCor());
             System.out.println("Cor dos olhos: " + Separacao1[i].getCorOlhos());
             System.out.println("Sexo: " + Separacao1[i].getSexo());
             System.out.println("Peso: " + Separacao1[i].getPeso());
             System.out.println("Idade:  " + Separacao1[i].getIdade());
             System.out.println("Tamanho:  " + Separacao1[i].getTamanho());
         }
        
        
        
        
        //Aves cantando
        aurora.cantar();
        cris.cantar();
        marcos.cantar();
        cristina.cantar();
        punpun.cantar();
        
    }
            
            
}
    



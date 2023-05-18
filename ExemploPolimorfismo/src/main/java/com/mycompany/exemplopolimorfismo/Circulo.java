/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplopolimorfismo;

/**
 *
 * @author aluno
 */
public class Circulo extends Forma {
    
    @Override
    public void desenhar(){
        System.out.println("Desenahndo círculo. ");       
        
    }
    
  public void desenhar(int tamanho){
        System.out.println("O tamanho do círculo é:  "+ tamanho);       
        
    }
   
}

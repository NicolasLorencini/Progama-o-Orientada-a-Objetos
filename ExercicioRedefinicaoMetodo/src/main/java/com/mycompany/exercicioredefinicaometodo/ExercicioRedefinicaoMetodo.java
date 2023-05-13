/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicioredefinicaometodo;

/**
 *
 * @author Administrator
 */
public class ExercicioRedefinicaoMetodo {

    public static void main(String[] args) {
        
        Animal animal = new Animal();
        animal.fazerBarulho();
        
        Cachorro cachorro = new Cachorro();
        cachorro.fazerBarulho();
        
        Gato gato = new Gato();
        gato.fazerBarulho();

       
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplointerface;

/**
 *
 * @author aluno
 */
public class ExemploInterface {

    public static void main(String[] args) {
        
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();
        Veiculo animal = new Animal();
        
        carro.acelerar();
        moto.frear();
        animal.frear();
    }
}

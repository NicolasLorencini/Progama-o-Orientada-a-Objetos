/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciopolimorfismo;
import java.util.ArrayList;
/**
 *
 * @author aluno
 */
public class ExercicioPolimorfismo {

    public static void main(String[] args) {   

      Veiculo[] veiculos = new Veiculo [2];
      
      veiculos[0] = new Carro();
      veiculos[1] = new Aviao();
      
      for (Veiculo veiculo : veiculos){
          
          veiculo.mover();
      }
    }
}

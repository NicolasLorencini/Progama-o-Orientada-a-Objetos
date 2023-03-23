/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.println("Bem vindo ao Acesso ao estadio\n 1 - login/cadastro\n 2 - Setor Estádio \n 3 - Pagamento \n 4 - Jogo \n 5 - Escolher jogo \n 6 - informações");
       char caso = ler.charAt();
       
        
        switch (caso){
            
            case '1':  
              System.out.println("login/cadastro");
              break;
              
            case '2':
                System.out.println("Setor estadio");
                
              case '3':  
              System.out.println("Pagamento");
              break;
              
            case '4':
                System.out.println("Jogo")  ;  
                
              case '5':  
              System.out.println("Escolher jogo");
              break;
              
              case '6':  
              System.out.println("informações");
              break;
              
            
              
            
        }
    }
}

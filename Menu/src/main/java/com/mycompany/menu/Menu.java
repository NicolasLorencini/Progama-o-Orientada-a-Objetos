/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.menu;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Menu {

    public static void main(String[] args) {
      LoginCadastro piu = new LoginCadastro();
      
      
      
     Scanner ler = new Scanner (System.in);        
       
        
        
        while (true){
       System.out.println("Bem vindo ao Acesso ao estadio\n 1 - login/cadastro\n 2 - Setor Estádio \n 3 - Pagamento \n 4 - Jogo \n 5 - Escolher jogo \n 6 - informações");
                    
            char caso= ler.next().charAt(0);
          switch (caso){
            
            case '1':  
              System.out.println("Você esscolheu login/cadastro");
             // piu.registrar();             
              //piu.registrar();
              //piu.exibirRegistro();
              piu.Login();
              System.out.println("\nDeseja voltar?");
              
              break;
              
            case '2':
                System.out.println("Você escolheu Setor estadio");
                System.out.println("\nDeseja voltar?");
                
                break;
                
              case '3':  
              System.out.println("Você escolheu Pagamento");
              System.out.println("\nDeseja voltar?");
              
              break;
              
            case '4':
                System.out.println("Você esccolheu Jogo")  ;  
                System.out.println("\nDeseja voltar?");
               
                break;
                
              case '5':  
              System.out.println("Você acessou ao jogo");
              System.out.println("\nDeseja voltar?");
             
              break;
              
              case '6':  
              System.out.println("Você escolheu informações");
              System.out.println("\nDeseja voltar?");
           
              break;
              
              default:
                  System.out.println("Insira um valor válido");
                  break;
              }  
        }
       
            }
          
              
          }
   
         
              
     
       
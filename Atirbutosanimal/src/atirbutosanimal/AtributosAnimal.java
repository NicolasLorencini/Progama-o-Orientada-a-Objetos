/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atirbutosanimal;

/**
 *
 * @author aluno
 */

//Criar uma classe distinguindo 5 atributos para definir um animal. E depois criar uma outra classe para cadastrar 5 animais.

public class AtributosAnimal {
    
   public String cor;
   public String corOlhos;
   public String sexo;
   public double peso;

    /**
     *
     */
    public int idade;

    public static void main(String[] args) {
       
       
   
        
        AtributosAnimal aurora = new AtributosAnimal();
        aurora.cor = "Azul";
        aurora.corOlhos = "Preto";
        aurora.sexo = "F";
        aurora.peso = 1.5;
        aurora.idade = 10;
        
        AtributosAnimal cris = new AtributosAnimal();
        cris.cor = "Preto";
        cris.corOlhos = "Azul";
        cris.sexo = "M";
        cris.peso = 110;
        cris.idade = 5;
        
        AtributosAnimal marcos = new AtributosAnimal();
        marcos.cor = "Verde";
        marcos.corOlhos = "Preto";
        marcos.sexo = "M";
        marcos.peso = 70;
        marcos.idade = 7;
        
        AtributosAnimal cristina = new AtributosAnimal();
        cristina.cor = "Vermelho";
        cristina.corOlhos = "Preto";
        cristina.sexo = "F";
        cristina.peso = 1.0;
        cristina.idade = 13;
        
        AtributosAnimal punpun = new AtributosAnimal();
        punpun.cor = "Laranja e preto";
        punpun.corOlhos = "Preto";
        punpun.sexo = "F";
        punpun.peso = 65;
        punpun.idade = 1;
        
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atirbutosanimal;


/**
 *
 * @author Nicolas
 */

//Criar uma classe distinguindo 5 atributos para definir um animal. E depois criar uma outra classe para cadastrar 5 animais.

public class AtributosAnimal {
    

    public static void main(String[] args) {
       
      
        construtorAve ave = new construtorAve("aurora");
        System.out.println(ave.getNome());
        
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
        
        
        
        
        //Aves cantando
        aurora.cantar();
        cris.cantar();
        marcos.cantar();
        cristina.cantar();
        punpun.cantar();
        
        
        
        
       
    }
}


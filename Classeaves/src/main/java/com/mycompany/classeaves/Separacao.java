/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classeaves;

/**
 *
 * @author Administrator
 */
public class Separacao {
    public String cor;
    public String corOlhos;
    public String sexo;
    public double peso;
    public int idade;
    public int tamanho;
    
   

   public Separacao (String acor, String acorOlhos, String asexo, double apeso, int aidade, int atamanho){
            this.cor = acor;
            this.corOlhos = acorOlhos;
            this.sexo = asexo;
            this.peso = apeso;
            this.idade = aidade;
            this.tamanho = atamanho;
        
    

            public String getCor ()
            {
                return = cor;
            }
            
            public void setCor (String cor)
            {
                this.cor = cor;
            }
            
            
            
            public void setCorOlhos (String corOlhos)
            {
                this.corOlhos = corOlhos;
            }
            
           
            
            public void setSexo (String cor)
            {
                this.cor = cor;
            }
            
            public double getPeso ()
            {
                return = cor;
            }
            
            public void setPeso (double peso)
            {
                this.cor = cor;
            }
            
            public int getIdade ()
            {
                return = cor;
            }
            
            public void setIdade (int idade)
            {
                this.idade = idade;
            }
            
             public int getTamanho ()
            {
                return = tamanho;
            }
            
            public void setIdade (int tamanho)
            {
                this.tamanho = tamanho;
            }
    
    
    public void cantar() {
        if (tamanho < 20) {
            System.out.println("piii, piii");
        } else if (tamanho > 30) {
            System.out.println("pipipi pipipi");
        } else {
            System.out.println("piiiiiiii");
        }
    }
}
}


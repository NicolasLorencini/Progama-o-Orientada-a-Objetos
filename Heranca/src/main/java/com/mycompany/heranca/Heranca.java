/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.heranca;
import java.util.Date;
//EXERCICÍO CADASTRAR PROFESSOR E FUNCIONARIO
/**
 *
 * @author aluno
 */
public class Heranca {

    public static void main(String[] args) {
        Aluno i = new Aluno ("José Francisco", "123.456.789-00", new Date());
        System.out.println("Veja como os atributos foram preenchidos\n\nNome:  " + i.nome);
        System.out.println("CPF:  " + i.cpf);
        System.out.println("Veja como os atributos foram preenchidos\n\nNome:  " + i.nome);
        System.out.println("Data de nascimento:  " + i.dataNascimento.toString());
        
        
    }
}

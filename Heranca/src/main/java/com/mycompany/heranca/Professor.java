/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;
import java.util.Date;
/**
 *
 * @author aluno
 */
   public class Professor extends Pessoa{
    public Professor(String _nome, String _cpf, Date _data){
        super(_nome, _cpf, _data);
    }
    public double salario;
    public String disciplina;
}
   


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menu;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Administrator
 */
public class LoginCadastro {
    private String nomeUsuario;
    public String nomeCompleto;
    public String email;
    public int celularNumero;
    public int dataNascimento;
    public int cpf;
    public int codigoValidação;
    public int rg;
    public int cep;
    private int senha;
    private ArrayList<Registros>registros;

    public LoginCadastro() {
        registros = new ArrayList<Registros>();
    }
    

    public void registrar(){
     Scanner xis = new Scanner (System.in);
     Scanner ler = new Scanner (System.in);
     System.out.println("\n---------------CADASTRO----------------------");
       // System.out.println("Escreva o seu nome completo: ");
       // nomeCompleto = ler.nextLine();
     
        System.out.println("Escreva o nome de seu Usuário:");
        String user = ler.nextLine();
        setNomeUsuario(user);
        
        System.out.println("Crie uma senha: ");
        int password = ler.nextInt();
        setSenha(password);
        
        System.out.println("Adicione seu email: ");
        email = xis.nextLine();      
        
        //System.out.println("Adicione o número do seu celular: ");
       // celularNumero = ler.nextInt();
        
        //System.out.println("Escreva o seu CPF: ");
       // cpf = ler.nextInt();
        
       // System.out.println("Escreva o seu RG");
       // rg = ler.nextInt();
        
       // System.out.println("Escreva o seu CEP:");
      // cep = ler.nextInt();
        
       // System.out.println("Escreva a sua data de nascimento: ");
        //dataNascimento = ler.nextInt();
        
        user = getNomeUsuario();
        password = getSenha();        
        
        registros.add(new Registros(user,email,password  ));
        
        System.out.println("REGISTRADO COM SUCESSO!!!!");
    }
    
    public void exibirRegistro(){
           
        for (Registros registro: registros){    
            System.out.println("\nSeu Usuário: "+registro.getUsuario()+"\nSeu email: "+registro.getEmail()+"\nSua senha: "+ registro.getSenha());
            
        }
          
    }
    
    public void Login(){
        Scanner logar = new Scanner(System.in);
        
        System.out.println("\n---------------LOGIN----------------------");
        System.out.println("Informe seu nome de usário: ");
        String user = logar.nextLine();
        
        System.out.println("Informe seu Email:");
        String email = logar.nextLine();
        
        System.out.println("Informe sua senha: ");
        int password = logar.nextInt();
        
       if (registros.stream().anyMatch(registro -> registro.getUsuario().equals(user) && registro.getSenha() == password)) {
            System.out.println("Você logou");
        } else {
            System.out.println("Uma das informações está incorreta!!!!!!");
       }
    }
    
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
     private class Registros{
        private String usuario;
        private String email;
        private int senha;

        public Registros(String usuario, String email, int senha) {
            this.usuario = usuario;
            this.email = email;
            this.senha = senha;
            
            
            
        }

        public String getUsuario() {
            return usuario;
        }

        public void setUsuario(String usuario) {
            this.usuario = usuario;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getSenha() {
            return senha;
        }

        public void setSenha(int senha) {
            this.senha = senha;
        }
        
        
    }
     
  }
    
   
    



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atirbutosanimal;

/**
 *
 * @author Nicolas
 */
public class Separacao {

    public String cor;
    public String corOlhos;
    public String sexo;
    public double peso;
    public int idade;
    public int tamanho;

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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto1;

/**
 *
 * @author Aluno
 */
public class Projeto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // psvm
        Carro carro = new Carro("Toyota", "Corolla");
        
        carro.andar();
    }
    class Carro
            private String marca;
            private String nome;
            public Carro(String marca, String nome){
                this.marca = marca;
                this.nome = nome;
            }
            public void andar () {
                System.out.println("O carro " + marca + " " + "está andando"); //sout
                
            }
}

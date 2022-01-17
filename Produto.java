/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex01;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Produto {
    private String nome;
    private float preco;
    
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
     
           if(nome.length()<=2){
        Scanner ler = new Scanner (System.in);
            System.out.println("===========================================\n"
                    + "Esse nome e invalido\n"
                    + "Deve Conter mais de 2 Letras\n"
                    + " coloque outro nome");
            System.out.println("Digite outro nome\n"
                    + "===========================================");
           this.nome  = ler.next();
        }
        else{this.nome = nome;
        
           }
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        
           if(preco<=0){
        Scanner ler = new Scanner (System.in);
            System.out.println("===========================================\n"
                    + "Esse numero e invalido\n"
                    + "Produto nao pode Custar 0,00\n");
            System.out.println("Digite valor valido\n"
                    + "===========================================");
           this.preco  = ler.nextFloat();
        }
        else{this.preco = preco;
        
           }
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", preco=" + preco + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

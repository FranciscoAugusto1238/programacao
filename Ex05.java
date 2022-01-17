/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2trimestre01;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Ex05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
      int resultado=0;
        
        
        for(int i =1 ; i <= 20;  i++ ){
            System.out.println("Digite um numero "+i);
            int numero = ler.nextInt();
            
            if (numero > 30 && numero%2==1){
                   resultado= resultado+1;
           
               
           }

     
           
           
       } 
        System.out.println("Existem numeros impares =" +resultado);
  
    }
   
}

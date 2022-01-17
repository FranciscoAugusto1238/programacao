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
public class Ex01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numeroparada = 0;
        int numero;
        boolean jogando = true;
        int multiplicaçao = 1;

        System.out.println("====================================");

        while (jogando) {
            System.out.println("Digite um numero");
            numero = ler.nextInt();

            if (numero == numeroparada) {
                jogando = false;
         
               

            }else{      multiplicaçao = multiplicaçao * numero;

        }
       
    }
         System.out.println("A multiplicaçao desses numeros e " + multiplicaçao);
}
}
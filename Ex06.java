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
public class Ex06 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero = 0;
        int contador = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;
         float resu = 0;
           float resu2 = 0;
            float total =0;
        for (int i = 1; i <= 80; i++) {
            System.out.println("Digite um numero " + i);
            numero = ler.nextInt();

            if (numero <= 15) {
                contador = contador + 1;

            } else if (numero > 15 && numero <= 30) {
                contador2 = contador2+ 1;

            } else if (numero > 30 && numero <= 45) {
                contador3 = contador3 + 1;

            } else if (numero > 45 && numero <= 60) {
                contador4 = contador4 + 1;

            } else if (numero > 60) {
                contador5 = contador5 + 1;

            }
   total = contador+ contador2+contador3 + contador4 + contador5;
         resu =  (contador*total)/100;
            resu2 = (contador5*total)/100;
           
        }
   System.out.println("==============================================================");
        System.out.println("Existem na primeira faixa etaria  " + contador);
        System.out.println("Existem na segunda faixa etaria  " + contador2);
        System.out.println("Existem na terceira faixa etaria  " + contador3);
        System.out.println("Existem na quarta faixa etaria  " + contador4);
        System.out.println("Existem na quinta faixa etaria  " + contador5);
      

        System.out.println("==============================================================");
        System.out.println("a porcentagem de pessoas na primeira faixa etária com relação ao\n" +
"total de pessoas; "+resu*100);
        System.out.println("==============================================================");
        
          System.out.println("a porcentagem de pessoas na primeira faixa etária com relação ao\n" +
"total de pessoas; "+resu2*100);
       
    }
}

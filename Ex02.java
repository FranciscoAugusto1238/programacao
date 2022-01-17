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
public class Ex02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int somatorio = 1;
        System.out.println("Qual o valor limite");
        int n = ler.nextInt();
        System.out.println("Qual o valor inicial");
        int p = ler.nextInt();
        for (int i = p; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

                //somatorio
                somatorio = somatorio + n;

            }
        }
        System.out.println("=====================================");
        System.out.println("O somatorio e " + somatorio);
        System.out.println("=====================================");

    }
}

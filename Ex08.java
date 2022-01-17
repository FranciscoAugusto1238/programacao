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
public class Ex08 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num = 0;
        int soma = 0;
            int menornumero = Integer.MIN_VALUE;
               int maiornumero = Integer.MAX_VALUE;
        for (int i = 1; i <= 20; i++) {

            System.out.println("Entre com o primeiro numero " + i);
            num = ler.nextInt();
            soma = soma + num;

        }
        System.out.println("Qual opçao deseja\n"
                + "1.soma das idade\n"
                + "2. Media das idades\n"
                + "3. Maior idade\n"
                + "4. Menor idade\n"
                + "0. Parar o programa");

        int opçao = ler.nextInt();

        switch (opçao) {

            case 1:

                System.out.println("A soma e " + soma);
                break;
            case 2:
                System.out.println("A media e " + (float) soma / 20);
                break;
            case 3:
             

                if (num >maiornumero) {
                    maiornumero = num;
                }

                System.out.println("O menor numero digitado e : " + maiornumero);

                break;
            case 4:
               

                if (num < menornumero) {
                    menornumero = num;
                }

                System.out.println("O menor  numero digitado e : " + menornumero);

            case 0:
                break;
            default:
                System.out.println("Opçao invalida fim do programa");

        }
    }
}

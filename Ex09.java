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
public class Ex09 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Ola Senhor(a), seja bem vindo a nossa agencia\n");

        System.out.println("Digite o valor que deseja investir");
        float dinheiro = ler.nextFloat();
        System.out.println("Digite o codigo de investimento desejado\n"
                + "1. poupança\n"
                + "2. poupança plus\n"
                + "3. fundos de renda fixa\n");
        System.out.println("Digite o codigo do cliente");
        int opc = ler.nextInt();

        switch (opc) {

            case 1:
                float r1 = (dinheiro * 15) / 1000;
                System.out.println("Digite quantos meses o dinheiro vai ficar investido");
                int meses = ler.nextInt();
                float r2 = r1 * meses;
                System.out.println("O valor inestido em " + meses + " meses e de R$: " + r2);
break;
            case 2:

                float r3 = (dinheiro * 2) / 100;
                System.out.println("Digite quantos meses o dinheiro vai ficar investido");
                int meses2 = ler.nextInt();
                float r4 = r3 * meses2;
                System.out.println("O valor inestido em " + meses2 + " meses e de R$: " + r4);
break;
            case 3:
                float r5 = (dinheiro * 4) / 100;
                System.out.println("Digite quantos meses o dinheiro vai ficar investido");
                int meses3 = ler.nextInt();
                float r6 = r5 * meses3;
                System.out.println("O valor inestido em " + meses3 + " meses e de R$: " + r6);
break;
            case 0:
                System.out.println("Fim operaçao\n Obrigado, Volte sempre");
break;
        }

    }
}

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
public class Ex10 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float decimo3 = 0;
        float meses = 0;
        float novoSal = 0;
        float salFerias = 0;
        System.out.println("Digite seu salario atual");
        float salario = ler.nextFloat();
        System.out.println("===================================================");

        System.out.println("Digite a opçao desejada\n"
                + "1. Novo Salario\n"
                + "2. Ferias\n"
                + "3. Decimo Terceiro\n"
                + "4. Sair\n");
        System.out.println("===================================================");
        int opc = ler.nextInt();
        switch (opc) {

            case 1:
                if (salario <= 210) {
                    novoSal = salario * 15 / 100;
                    float r1 = salario + novoSal;
                    System.out.println("o novo salario sera de: " + r1);
                    System.out.println("===================================================");

                } else {
                    if (salario >= 210 && salario <= 600) {
                        novoSal = salario * 10 / 100;
                        float r2 = salario + novoSal;
                        System.out.println("o novo salario sera de: " + r2);
                        System.out.println("===================================================");

                    } else {
                        if (salario > 600) {
                            novoSal = salario * 5 / 100;

                            float r3 = salario + novoSal;
                            System.out.println("o novo salario sera de: " + r3);
                            System.out.println("===================================================");

                        }
                    }
                }

                break;

            case 2:

                salFerias = (salario / 1 / 3);
                float s1 = salFerias + salario;
                System.out.println("o valor das ferias é de: " + s1);
                System.out.println("===================================================");

                break;

            case 3:
                System.out.println("digite o numero de meses de trabalho de uma empresa");
                meses = ler.nextFloat();
                if (meses <= 12) {
                    decimo3 = (salario * meses) / 12;
                    System.out.println("o valor do decimo terceiro é de: " + decimo3);
                    System.out.println("===================================================");

                }

                break;

            case 4:
                break;

            default:
                System.out.println("Opçao Invalida\n"
                        + "Rode o Progama novamente");
                System.out.println("===================================================");

        }

    }
}

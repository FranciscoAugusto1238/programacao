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
public class Ex07 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valo do carro");
        float valor = ler.nextFloat();

        System.out.println("Digite a opçao qnt de parcelas\n"
                + "1. 6 parcelas = 3% juros\n"
                + "2. 12 parcelas = 6% juros\n"
                + "3. 18 parcelas = 9% juros\n"
                + "4. 24 parcelas = 12% juros\n"
                + "5. 30 parcelas = 15% juros\n"
                + "6. 36 parcelas = 18% juros\n"
                + "7. 42 parcelas = 21% juros\n"
                + "8. 48 parcelas = 24% juros\n"
                + "9. 54 parcelas = 27% juros\n"
                + "10. 60 parcelas = 30% juros\n"
                + "11. 0 parcelas = 20% desconto");
        int opc = ler.nextInt();

        switch (opc) {

            case 1:
                float r1 = (valor * 3) / 100;
                float r2 = r1 + valor;
                System.out.println("O novo valor so carro com os juros sera de: " + r2);
break;
            case 2:
                float r3 = (valor * 6) / 100;
                float r4 = r3 + valor;
                System.out.println("O novo valor so carro com os juros sera de: " + r4);
break;
            case 3:
                float r5 = (valor * 9) / 100;
                float r6 = r5 + valor;
                System.out.println("O novo valor so carro com os juros sera de: " + r6);
break;
            case 4:
                float r7 = (valor * 12) / 100;
                float r8 = r7 + valor;
                System.out.println("O novo valor so carro com os juros sera de: " + r8);
break;
            case 5:
                float r9 = (valor * 15) / 100;
                float r10 = r9 + valor;
                System.out.println("O novo valor so carro com os juros sera de: " + r10);
break;
            case 6:
                float r11 = (valor * 18) / 100;
                float r12 = r11 + valor;
                System.out.println("O novo valor so carro com os juros sera de: " + r12);
break;
            case 7:
                float r13 = (valor * 21) / 100;
                float r14 = r13 + valor;
                System.out.println("O novo valor so carro com os juros sera de: " + r14);
break;
            case 8:
                float r15 = (valor * 24) / 100;
                float r16 = r15 + valor;
                System.out.println("O novo valor so carro com os juros sera de: " + r16);
break;
            case 9:
                float r17 = (valor * 27) / 100;
                float r18 = r17 + valor;
                System.out.println("O novo valor so carro com os juros sera de: " + r18);
break;
            case 10:
                float r19 = (valor * 30) / 100;
                float r20 = r19 + valor;
                System.out.println("O novo valor so carro com os juros sera de: " + r20);
break;
            case 11:
                float r21 = (valor * 20) / 100;
                float r22 =  valor- r21;
                System.out.println("O novo valor so carro com os juros sera de: " + r22);
break;
            default :
                System.out.println("Opçao invalida");
break;
        }

    }
}

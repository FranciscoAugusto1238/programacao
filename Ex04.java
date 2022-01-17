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
public class Ex04 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        char curso = ' ';
        boolean pes;
        char motivo = ' ';
        int adm = 0;
        int pro = 0;
        int ans = 0;
        int contc = 0;
        char genero = ' ';
        int per = 0;
        int per5 = 0;
        int per6 = 0;
        int soma = 0;
        int fa = 0;
        int fo = 0;
        int fs = 0;
        int fcc = 0;
        int menor = 1000;
        char cur2 = ' ';
        String n2 = " ";
        int idade= 0;
        while (pes = true) {

            System.out.println("Informe o curso\n"
                    + "A= Administração\n"
                    + "B=  Processamento de Dados\n"
                    + "C= Análise de Sistemas\n"
                    + "D= Contabilidade e Comunicação\n"
                    + "F= Para terminar\n");
            curso = ler.next().charAt(fs);

            if ("FIM".equals(curso)) {
                pes = false;
                break;
            }

            System.out.println("Informe o nome:");
            String nome = ler.next();

            switch (curso) {

                case 'A':
                    adm = adm + 1;

                    break;

                case 'B':
                    pro = pro + 1;

                    break;

                case 'C':
                    ans = ans + 1;

                    break;

                case 'D':
                    contc = contc + 1;

                    break;
                case 'F':
                    if (genero == 'F' & "A".equals(curso)) {
                        fa = fa + 1;
                    }
                    if (genero == 'F' & "B".equals(curso)) {
                        fo = fo + 1;
                    }
                    if (genero == 'F' & "C".equals(curso)) {
                        fs = fs + 1;
                    }
                    if (genero == 'F' & "D".equals(curso)) {
                        fcc = fcc + 1;
                    }

                    if (motivo == 'R' & idade < menor) {
                        menor = idade;
                        cur2 = curso;
                        n2 = nome;
                    }

            

            int total;
            total = adm + pro + ans + contc;

            float per1;
            float per2;
            float per3;
            float per4;

            per1 = (adm * 100) / total;
            per2 = (pro * 100) / total;
            per3 = (ans * 100) / total;
            per4 = (contc * 100) / total;

            float media;
            media = soma / adm;

            System.out.println("================================================================================================================");
            System.out.println("A quantia de alunos com idade inferior a 20 anos que escolheram seu curso por aptidão corresponde a: " + per1);
            System.out.println("================================================================================================================");
            System.out.println("O percentual de alunos em Administração " + per1 + "%, em Processamento de Dados é de " + per2 + "%, em Análise de Sistemas é de " + per3 + "% e em Contabilidade e Comunicação é de " + per4 + "%");
            System.out.println("================================================================================================================");
            System.out.println("A idade media de alunos em Administração corresponde a: " + media);
            System.out.println("================================================================================================================\n\n");

            if (fa > fo & fa > fs & fa > fcc) {
                System.out.println("O curso mais frequentado pelo gênero feminino é Processamento de Dados");
            }
            if (fs > fo & fs > fa & fs > fcc) {
                System.out.println("O curso mais frequentado pelo gênero feminino é Análise de Sistemas");
            }
            if (fcc > fo & fcc > fs & fcc > fa) {
                System.out.println("O curso mais frequentado pelo gênero feminino é Contabilidade e Comunicação");
            }

            if ("A".equals(cur2)) {
                cur2 = 'a';
            }
            if ("B".equals(cur2)) {
                cur2 = 'p';
            }
            if ("C".equals(cur2)) {
                cur2 = 's';
            }
            if ("D".equals(cur2)) {
                cur2 = 'c';
            }
            System.out.println("================================================================================================================");
            System.out.println("O aluno mais novo a escolher seu curso pela remuneração chama-se " + n2 + " tem " + menor + " anos e escolheu como curso " + cur2);
            System.out.println("================================================================================================================");
            break;
            }
   

        System.out.println("Informe o motivo da escolha (digite R, A ou O: remuneração obtida pela profissão; aptidão; outros);");
        motivo = ler.next().charAt(0);

        System.out.println("Informe sua idade:");
        idade = ler.nextInt();

        System.out.println("Informe o genero (M para masculino e F para feminino):");
        genero = ler.next().charAt(0);

        if (idade < 20 & motivo == 'A') {
            per = per + 1;
        }
        //////////////////////////////////////////////
        if (idade < 20 & motivo == 'R') {
            per5 = per5 + 1;
        }
        /////////////////////////////////////////////
        if (idade < 20 & motivo == 'A') {
            per6 = per6 + 1;
        }

        ///////////////////////////////////////
        if ("A".equals(curso)) {
            soma = soma + idade;
        }
        }
    }
}


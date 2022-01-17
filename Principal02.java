/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal01;

import java.util.Scanner;

import Ex01.Produto;
import Ex01.Venda;

/**
 *
 * @author acer
 */
public class Principal02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Venda v1 = new Venda();

        int opc = 9999999;
        while (opc != 0) {

            menu();
            opc = ler.nextInt();

            if (opc == 0) {
                System.out.println("Programa encerrado.");
                break;
            }
            switch (opc) {

                case 1:
                    System.out.println("Qual o nome do produto");
                    String p = ler.next();
                    System.out.println("Digite o preço do produto");
                    float preco = ler.nextFloat();

                    Produto produto = new Produto();
                    produto.setNome(p);
                    produto.setPreco(preco);
                    v1.adicionarProduto(produto);
                    break;
                case 2:
                    System.out.println("Qual o produto ?");
                    String p2 = ler.next();
                    System.out.println("Qual o CPF do cliente ");
                    String cpf = ler.next();
                    System.out.println("Digite a data da venda ");
                    String venda = ler.next();

                    Produto aux = v1.retirarProduto(p2);
                    if (aux == null) {
                        System.out.println("Produto nao encontrado");
                    }

                    break;
                case 3:
                    System.out.println("total de vendas:");
                    System.out.println(v1.totaldaVenda()
                    );

                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        }
    }

    private static void menu() {
        System.out.println("=========Menu=========\n");
        System.out.println("1) Cadastrar produto");
        System.out.println("2) Retirar produro");
        System.out.println("3) Mostrar vendas");
        System.out.println("0) Finalizar o programa");
        System.out.println("Digite uma opção: \n\n"
                + "======================");
    }
}

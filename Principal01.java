/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal01;

import Ex0.Cadastro;
import Ex0.Cliente;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Principal01 {

    private static void menu() {
        System.out.println("======Menu======\n\n"
                + "1.Digite os dados do cliente\n"
                + "2. Apagar cliente\n"
                + "3. Imprimir todos os clientes\n\n"
                + "=================================\n");
    }

    public Cadastro cad;

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Cadastro g = new Cadastro();

        int opc = 999;
        while (opc != 0) {

            menu();
            opc = ler.nextInt();

            if (opc == 0) {
                System.out.println("Programa encerrado.");
                break;
            }
            switch (opc) {

                case 1:
                    System.out.println("Qual o nome do cliente ?");
                    String nome = ler.next();
                    System.out.println("Qual o CPf do cliente?");
                    String cpf = ler.next();
                    System.out.println("Qual a data de nascimento do cliente?");
                    String data = ler.next();
                    System.out.println("Qual e o nome da rua do cliente");
                    String rua = ler.next();

                    Cliente cliente = new Cliente();
                    cliente.setNome(nome);
                    cliente.setCpf(cpf);
                    cliente.setNascimento(data);
                    cliente.setRua(rua);
                    g.cadastrarCliente(cliente);

                    break;
                case 2:
                    System.out.println("Qualo nome do cliente que deseja excluir");
                    String apagar = ler.next();
                    g.apagarCliente(apagar);

                    break;
                case 3:
                    System.out.println("Clientes Cadastrados:");
                    System.out.println(g.clienteCadastrado());
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}

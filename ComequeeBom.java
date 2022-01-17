package comequeebom;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class ComequeeBom {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String usuario;
        String usuarioMestre = "francisco";
        int senha;
        int senhaMestre = 130403;

        String endereço[] = new String[10];
        String cidade[] = new String[10];
        int codigo[] = new int[10];

        String nomes[] = new String[10];
        String produto[] = new String[10];
        int codproduto[] = new int[10];

        int cont = 0;
        float resu = 0;
        float resu2 = 0;

        double valorproduto[] = new double[20];

        int refeiçaoproduto[] = new int[20];
        String refeiçaocliente[] = new String[20];
        int data[] = new int[20];
        float vendas = 0;
        float vendas2 = 0;
        int condi;

        System.out.println("=====================================================");
        System.out.println("Bem vindo ao sistema de controle de refeiçao");
        System.out.println("=====================================================");

        System.out.println("Usuario: ");
        usuario = ler.next();
        System.out.println("Senha: ");
        senha = ler.nextInt();

        if (usuario == usuarioMestre || senha == senhaMestre) {
            int opc1;

            do {
                System.out.println("======== Menu de opçoes ========\n"
                        + "1- Cadastrar Cliente\n"
                        + "2- Cadastrar Produto\n"
                        + "3- Lançamento de vendas\n"
                        + "4- Listrar dados do cliente\n"
                        + "5- Listar dados do produto\n"
                        + "6- Listar vendas cadastradas\n"
                        + "7- Emitir nota fiscal\n"
                        + "8-Limpar Banco de Dados\n"
                        + "9- Relatorio - Maior valor da refeiçao do cliente\n"
                        + "10- Relatorio - Menor valor da refeiçao do cliente\n"
                        + "11- Relatorio - Rotalizar as refeiçoes do cliente\n"
                        + "0- Para terminar o programa\n");
                System.out.println("=====================================================");
                System.out.println("Digite a opçao : ");

                opc1 = ler.nextInt();
                switch (opc1) {
                    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    case 1:

                        int opc2;
                        do {
                            System.out.println("======== Menu de opçoes ========\n"
                                    + "1- Inserir Cliente\n"
                                    + "2- Deletar Cliente\n"
                                    + "3- Substituir Cliente\n");
                            System.out.println("Digite 0 para voltar o menu anterior");
                            System.out.println("=====================================================");
                            opc2 = ler.nextInt();

                            switch (opc2) {

                                case 1:

                                    for (int i = 0; i < nomes.length; i++) {
                                        System.out.println("=====================================================");
                                        if (codigo[i] == 0) {
                                            System.out.println("======== Cadastro Cliente ========");
                                            System.out.println("Insira o nome do cliente");
                                            nomes[i] = ler.next();
                                            System.out.println("Digite seu endereço");
                                            endereço[i] = ler.next();
                                            System.out.println("Digite sua cidade");
                                            cidade[i] = ler.next();
                                            System.out.println("Informe o codigo do cliente");
                                            codigo[i] = ler.nextInt();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    for (int i = 0; i < nomes.length; i++) {
                                        System.out.println("=====================================================");
                                        System.out.println("Digite o nome do cliente que deseja excluir");
                                        String exclusao = ler.next();

                                        if (nomes[i].equalsIgnoreCase(exclusao)) {
                                            nomes[i] = " ";
                                            System.out.println("Usuario Excluido com sucesso!");
                                            System.out.println("=====================================================");
                                            break;
                                        }

                                    }
                                    break;

                                case 3:
                                    for (int i = 0; i < nomes.length; i++) {
                                        System.out.println("=====================================================");

                                        System.out.println("Digite o nome que deseja alterar ");
                                        String sub = ler.next();
                                        if (nomes[i].equalsIgnoreCase(sub)) {
                                            System.out.println("Entre com o novo nome");
                                            nomes[i] = ler.next();
                                        }
                                        System.out.println("Digite o nome que deseja alterar ");
                                        String subend = ler.next();
                                        if (endereço[i].equalsIgnoreCase(subend)) {
                                            System.out.println("Entre com o novo nome");
                                            endereço[i] = ler.next();
                                        }
                                        System.out.println("Digite o nome que deseja alterar ");
                                        String subcid = ler.next();
                                        if (cidade[i].equalsIgnoreCase(subcid)) {
                                            System.out.println("Entre com o novo nome");
                                            cidade[i] = ler.next();
                                        }

                                        System.out.println("Dados alterados com sucesso!");
                                        System.out.println("=====================================================");
                                        break;
                                    }

                            }

                        } while (opc2 != 0);
                        break;
                    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    case 2:

                        int opc3;
                        do {
                            System.out.println("======== Menu de opçoes ========\n"
                                    + "1- Inserir Produto\n"
                                    + "2- Deletar Produto\n"
                                    + "3- Substituir Produto\n");
                            System.out.println("Digite 0 para voltar o menu anterior");
                            System.out.println("=====================================================");
                            System.out.println("Digite a opçao desejada");
                            opc3 = ler.nextInt();
                            switch (opc3) {

                                case 1:
                                    for (int i = 0; i < codproduto.length; i++) {
                                        if (codproduto[i] == 0) {
                                            System.out.println("=====================================================");
                                            System.out.println("Insira o nome doProduto");
                                            produto[i] = ler.next();
                                            System.out.println("Insira o codigo do produto");
                                            codproduto[i] = ler.nextInt();
                                            System.out.println("Insira o valor do produto");
                                            valorproduto[i] = ler.nextFloat();

                                            System.out.println("=====================================================");
                                            break;
                                        }
                                    }
                                    break;

                                case 2:
                                    for (int i = 0; i < codproduto.length; i++) {
                                        System.out.println("=====================================================");

                                        System.out.println("Digite o produto que deseja excluir");
                                        String exclusao2 = ler.next();

                                        if (produto[i].equalsIgnoreCase(exclusao2)) {
                                            produto[i] = " ";
                                            codproduto[i] = ' ';
                                            valorproduto[i] = 0;
                                            System.out.println("Produto Excluido com sucesso!");
                                            System.out.println("=====================================================");
                                            break;
                                        }
                                    }
                                    break;
                                case 3:
                                    for (int i = 0; i < codproduto.length; i++) {
                                        System.out.println("=====================================================");

                                        System.out.println("Digite o produto que deseja alterar ");
                                        String sub2 = ler.next();
                                        if (produto[i].equalsIgnoreCase(sub2)) {
                                            System.out.println("Entre com o novo Produto");
                                            produto[i] = ler.next();
                                            System.out.println("Entre com o novo codigo");
                                            codproduto[i] = ler.nextInt();
                                            System.out.println("Dados alterados com sucesso!");
                                            System.out.println("=====================================================");
                                            break;
                                        }

                                    }

                            }
                        } while (opc3 != 0);
                        break;
                    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    case 3:
                        for (int i = 0; i < codproduto.length; i++) {

                            System.out.println("======== Vendas ========");
                            System.out.println("Digite o codigo do cliente");
                            condi = ler.nextInt();

                            if (condi == codigo[i]) {
                                System.out.println("Digite a refeiçao do cliente");
                                refeiçaocliente[i] = ler.next();

                                System.out.println("Digite a quantidade comprado");
                                refeiçaoproduto[i] = ler.nextInt();
                                System.out.println("Digite a data das compras ");
                                data[i] = ler.nextInt();
                                break;
                            }
                        }
                        break;
                    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    case 4:

                        System.out.println("=======================================");
                        System.out.println("Listagem dos clientes cadastrados");
                        System.out.println("=======================================");

                        System.out.println("Deseja realmente Imprimir o relatorio  ? (s/n) \n");
                        char oop = ler.next().charAt(0);
                        char oopt = 's';

                        if (oop == oopt) {
                            for (int i = 0; i < nomes.length; i++) {
                                System.out.println("Cliente  " + codigo[i] + " Nome: " + nomes[i] + " Endereço: " + endereço[i] + " Cidade: " + cidade[i]);

                            }
                        } else {
                            System.out.println("Obrigado Volte sempre");
                            System.exit(0);
                        }

                        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        break;
                    case 5:

                        System.out.println("=======================================");
                        System.out.println("Listagem de produtos cadastrados");
                        System.out.println("=======================================");

                        System.out.println("Deseja realmente Imprimir o relatorio  ? (s/n) \n");
                        char oopp = ler.next().charAt(0);
                        char ooppt = 's';

                        if (oopp == ooppt) {
                            for (int i = 0; i < codproduto.length; i++) {
                                System.out.println("Produto -  Codigo: " + codproduto[i] + " Descriçao: " + produto[i] + ": " + valorproduto[i]);

                            }
                        } else {
                            System.out.println("Obrigado Volte sempre");
                            System.exit(0);
                        }

                        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        break;
                    case 6:

                        System.out.println("======== Relatorio ========");

                        System.out.println("Deseja realmente Imprimir o relatorio  ? (s/n) \n");
                        char ooppp = ler.next().charAt(0);
                        char oooppt = 's';

                        if (ooppp == oooppt) {
                            for (int i = 0; i < codproduto.length; i++) {
                                System.out.println("Venda -  Codigo : " + codigo[i] + " Cliente: " + nomes[i] + "   Produto: " + refeiçaocliente[i] + " Qtde:  " + refeiçaoproduto[i] + " Data: " + data[i]);

                            }
                        } else {
                            System.out.println("Obrigado Volte sempre");
                            System.exit(0);
                        }

                        break;

                    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    case 7:

                        for (int i = 0; i < nomes.length; i++) {

                            System.out.println("Nota Fiscal " + i);
                            System.out.println("=================");
                            System.out.println("Nome: " + nomes[i]);
                            System.out.println("Endereço: " + endereço[i]);
                            System.out.println("Cidade: " + cidade[i]);
                            System.out.println("=================");
                            System.out.println("==== Refeiçoes ===");
                            System.out.println("=================");
                              for (int x= 0; x < codigo.length; x++) {
                            System.out.println("Produto: " + produto[i] + " Valor: " + valorproduto[i]);
                              }
                            System.out.println("=================");
                            /* for (int j = 0; j < nomes.length; j++) {
                                resu =(float) valorproduto[j] + resu;
                            }
                             */

                            if (refeiçaoproduto[i] > 1) {

                                resu = (float) valorproduto[i] * refeiçaoproduto[i];
                                System.out.println("Total: " + resu);
                                System.out.println("=================");
                            } else {
                                resu = (float) valorproduto[i] * 1;
                                System.out.println("Total: " + resu);
                                System.out.println("=================");

                            }
                        }

                        break;
                    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    case 8:

                        System.out.println("====================");
                        System.out.println("Deletar dados");
                        System.out.println("====================");
                        System.out.println("Deseja realmente Deletar todos os dados");
                        System.out.println("S = para sim ;     N = Para Nao ");
                        char aopc = ler.next().charAt(0);
                        char aopc2 = 'S';
                        if (aopc == aopc2) {
                            for (int i = 0; i < nomes.length; i++) {
                                nomes[i] = " ";
                                cidade[i] = " ";
                                endereço[i] = " ";
                                codigo[i] = 0;
                                codproduto[i] = 0;
                                System.out.println("Banco de dados deletado com sucesso");
                                System.out.println("===================");
                            }
                        } else {
                            System.out.println("Obrigado volte sempre");
                            System.out.println("===================");
                            System.exit(0);

                        }

                        break;

                    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    case 9:

                        System.out.println("======================");
                        System.out.println("Relatoro de maior refeiçao cadastrada do cliente");
                        System.out.println("======================");
                        System.out.println("Entre com o cliente");
                        String cli = ler.next();
                        float maiornumero = Integer.MIN_VALUE;
                        for (int i = 0; i < produto.length; i++) {

                            if (cli == nomes[i]) {
                                for (int j = 0; j < codproduto.length; j++) {
                                    if (valorproduto[i] > maiornumero) {
                                        vendas = (float) valorproduto[i];
                                    }
                                }
                                if (valorproduto[i] > maiornumero) {
                                    maiornumero = (float) valorproduto[i];
                                }
                    
                            }
                             System.out.println("O maior numero digitado e : " +(float) vendas);
                        }
                        break;
                    //////////////////////////////////////////////////////////////////////////////////////////////////////////////

                    case 10:

                        System.out.println("======================");
                        System.out.println("Relatoro de maior refeiçao cadastrada do cliente");
                        System.out.println("======================");
                        System.out.println("Entre com o cliente");
                        String clien = ler.next();
                        float menornumero = Integer.MAX_VALUE;
                        for (int i = 0; i < nomes.length; i++) {
                            if (clien == nomes[i]) {
                                for (int j = 0; i < codproduto.length; j++) {
                                    if (valorproduto[i] < menornumero) {
                                        vendas2 = (float) valorproduto[i];
                                    }
                                }
                                if (valorproduto[i] < menornumero) {
                                    menornumero = (float) valorproduto[i];
                                }
                            }
                            System.out.println("O maior numero digitado e : " +(float)vendas2);
                        }
                        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        break;

                    case 11:

                        System.out.println("====================");
                        System.out.println("Relatorio do total das refeiçoes cadastradas do cliente ");
                        System.out.println("====================");
                        System.out.println("Entre com o cliente");
                        String client = ler.next();
                        for (int i = 0; i < codproduto.length; i++) {
                            if (client == nomes[i]) {
                                for (int j = 0; i < refeiçaoproduto.length; j++) {
                                    cont = cont + 1;

                                }
                            }
                            System.out.println("O numeros de refeiçoes do cliente e " + refeiçaoproduto[i] + "\n"
                                    + "As refeiçoes sao " + produto[i]);
                        }
                        break;
                    //////////////////////////////////////////////////////////////////////////////////////////////////////////////

                }

            } while (opc1 != 0);

        } else {
            System.out.println("=====================================================");
            System.out.println("Usuario ou senha incorretas ");
            System.out.println("=====================================================");
            System.exit(0);
        }
    }
}

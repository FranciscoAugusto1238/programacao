/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex01;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Venda {

    private String cpf;
    private String data;
    private Produto[] produto;
    private int venda;

    public Venda() {
        produto = new Produto[10];

        int auxiliar = 0;

    }

    public void setProduto(Produto[] produto) {

        this.produto = produto;

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.length() <= 10) {
            Scanner ler = new Scanner(System.in);
            System.out.println("===========================================\n"
                    + "Numero de CPF invalido\n"
                    + "Deve conter 11 numeros");
            System.out.println("Digite novamente os numeros\n"
                    + "===========================================");
            this.cpf = ler.next();
        } else {
            this.cpf = cpf;
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {

        if (data.length() <= 7) {
            Scanner ler = new Scanner(System.in);
            System.out.println(""
                    + "===========================================\n"
                    + "Data esta incorreta");
            System.out.println("Deve conter dd/mes/Ano\n"
                    + "===========================================");
            this.data = ler.next();
        } else {

            this.data = data;
        }
    }

    public void adicionarProduto(Produto produto2) {
        for (int i = 0; i < produto.length; i++) {
            if (produto[i] == null) {
                produto[i] = produto2;
                break;
            }
        }

    }

    public Produto retirarProduto(String nome) {
        for (int i = 0; i < produto.length; i++) {

            if (produto[i] != null) {
                if (produto[i].getNome().equals(nome)) {
                    Produto aux = produto[i];
                    produto[i] = null;
                    venda = venda + 1;
                    return aux;
                }
            }
        }

        return null;
    }

    public String totaldaVenda() {
        String aux = " ";
        System.out.println(venda);

        /*   for (int i = 0; i < produto.length; i++) {
          
            if (produto[i] != null){
               aux +=produto[i].getNome()+"\n";
             
            }
        }
         */
        return aux;

    }

    @Override
    public String toString() {
        return "Venda{" + "cpf=" + cpf + ", data=" + data + ", produto=" + produto + '}';
    }

}

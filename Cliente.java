/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex0;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Cliente {

    private String nome;
    private String cpf;
    private String nascimento;
    private String rua;

    public void setNome(String nome) {
        if (nome.length() <= 2) {
            Scanner ler = new Scanner(System.in);
            System.out.println("===========================================\n"
                    + "Esse nome e invalido coloque outro nome");
            System.out.println("Digite outro nome\n"
                    + "===========================================");
            this.nome = ler.next();
        } else {
            this.nome = nome;
        }
    }

    public String getNome() {

        return this.nome.toUpperCase();

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

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        if (nascimento.length() <= 7) {
            Scanner ler = new Scanner(System.in);
            System.out.println(""
                    + "===========================================\n"
                    + "Data de nascimento incorreta");
            System.out.println("Deve conter dd/mes/Ano\n"
                    + "===========================================");
            this.nascimento = ler.next();
        } else {

            this.nascimento = nascimento;
        }
    }

    public String getRua() {
        return rua.toUpperCase();
    }

    public void setRua(String rua) {
        if (rua.length() <= 6) {
            Scanner ler = new Scanner(System.in);
            System.out.println("===========================================\n"
                    + "Nome da rua invalida");
            System.out.println("Deeve conter pelo ou menos 7 letras\n"
                    + "Ex: Rua Maria.....\n"
                    + "===========================================");
            this.rua = ler.next();
        } else {
            this.rua = rua;

        }
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cpf=" + cpf + ", nascimento=" + nascimento + ", rua=" + rua + '}';
    }

}

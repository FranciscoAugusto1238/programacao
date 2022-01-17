/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex0;

/**
 *
 * @author acer
 */
public class Cadastro {

    private Cliente cliente[];

    public Cadastro() {
        cliente = new Cliente[10];

    }

    public void setCliente(Cliente[] cliente) {

        this.cliente = cliente;

    }

    public Cliente apagarCliente(String nome) {

        for (int i = 0; i < cliente.length; i++) {
            if (cliente[i] != null) {
                if (cliente[i].getNome().equals(nome)) {

                }
                Cliente aux = cliente[i];
                cliente[i] = null;
                return aux;

            }
        }

        return null;

    }

    public String clienteCadastrado() {

        String aux = " ";

        for (int i = 0; i < cliente.length; i++) {

            if (cliente[i] != null) {
                aux += cliente[i].getNome() + "\n";

            }
        }

        return aux;
    }

    public void cadastrarCliente(Cliente cliente2) {
        for (int i = 0; i < cliente.length; i++) {

            if (cliente[i] == null) {
                cliente[i] = cliente2;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Cadastro{" + "cliente=" + cliente + '}';
    }

}

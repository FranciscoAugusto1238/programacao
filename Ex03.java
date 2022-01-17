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
public class Ex03 {

public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

System.out.println("Digite um número inteiro:");
int numero = ler.nextInt();
boolean dividindo = true;
int divisao = numero;

while (dividindo) { 

if (divisao > 0) { int resto = divisao % 2;
divisao = divisao/2;

    System.out.println("a divisão deu " + divisao);
System.out.println("O resto da divisão corresponde a: "+resto);

}else {
    dividindo = false; 
}
}
}
}
package exercicios;
/*
EX-06
Faça um programa em Java para ler o comprimento do lado de um cubo e imprimir o valor correspondente ao volume do mesmo.
*/

import java.util.Scanner;
public class exercicio06 {
    public void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        int lado;
        int volume;

        System.out.println("Digite o valor do lado do cubo: ");
        lado = entrada.nextInt();

        volume = lado * lado * lado;

        System.out.println("O valor do volume é: " + volume);
    }
}

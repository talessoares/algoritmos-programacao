package exercicios;
/*
EX-01  
Faça um programa que receba dois números inteiros (digitados pelo usuário) e mostre o maior e o menor número digitado.

Por exemplo:

N1 = 4

N2 = 6

Saída: Maior = 6 Menor = 4
*/

import java.util.Scanner;
public class exercicio01 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int n1, n2;

        System.out.println("Digite o primeiro número: ");
        n1 = entrada.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = entrada.nextInt();

        if (n1 > n2){
            System.out.println("O maior número é: " + n1);
            System.out.println("O menor número é: " + n2);
        } else {
            System.out.println("O maior número é: " + n2);
            System.out.println("O menor número é: " + n1);
        }

    }
}
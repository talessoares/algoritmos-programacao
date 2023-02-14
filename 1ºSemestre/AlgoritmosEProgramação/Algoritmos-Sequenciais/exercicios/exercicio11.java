package exercicios;
/*
EX-11
Escreva um programa em linguagem Java que leia os valores A, B e C e mostre o resultado da seguinte expressão: (A – C) * B
*/

import java.util.Scanner;
public class exercicio11 {
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        int a;
        int b;
        int c;
        int resultado;

        System.out.println("Digite o valor de A: ");
        a = entrada.nextInt();

        System.out.println("Digite o valor de B: ");
        b = entrada.nextInt();

        System.out.println("Digite o valor de C: ");
        c = entrada.nextInt();

        resultado = (a - c) * b;

        System.out.println("O resultado da expressão é: " + resultado);
    }
    
}

package exercicios;
/*
EX-10
Escreva um programa em linguagem Java que leia um número e exiba seu sucessor.
*/

import java.util.Scanner;
public class exercicio10 {
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        int numero;
        int sucessor;

        System.out.println("Digite um número: ");
        numero = entrada.nextInt();

        sucessor = numero + 1;

        System.out.println("O sucessor do número é: " + sucessor);
    }
    
}

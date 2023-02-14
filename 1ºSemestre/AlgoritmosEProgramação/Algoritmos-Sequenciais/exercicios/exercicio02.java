package exercicios;
/*
EX-02
Faça um programa em Java para ler dois números inteiros e imprimir a soma dos mesmos.
*/

import java.util.Scanner;
public class exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println("Digite o primeiro número: ");
        numero1 = entrada.nextInt();

        System.out.println("Digite o segundo número: ");
        numero2 = entrada.nextInt();

        System.out.println("A soma dos números é: " + (numero1 + numero2));
    }
}
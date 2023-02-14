package exercicios;
/*
EX-07
Faça um programa em Java para ler um valor em Reais e converter para Euros, imprimindo o resultado na tela. Considere o valor de 1 Real = 0,44 Euros.
*/

import java.util.Scanner;
public class exercicio07 {
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        double reais;
        double euros;

        System.out.println("Digite o valor em reais: ");
        reais = entrada.nextDouble();

        euros = reais * 0.44;

        System.out.println("O valor em euros é: " + euros);
    }
}
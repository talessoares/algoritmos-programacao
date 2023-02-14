package exercicios;
/*
EX-04
Faça um programa em Java para ler um número de segundos e imprimir o correspondente número de horas, minutos e segundos que ele representa.
*/

import java.util.Scanner;

public class exercicio04 {
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        int segundos;
        int horas;
        int minutos;

        System.out.println("Digite o número de segundos: ");
        segundos = entrada.nextInt();

        horas = segundos / 3600;
        minutos = segundos / 60;

        System.out.println("O número de horas é: " + horas);
        System.out.println("O número de minutos é: " + minutos);
        System.out.println("O número de segundos é: " + segundos);


    }
}
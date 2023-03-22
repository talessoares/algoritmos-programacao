/*
EX-01  
Desenvolva, em Linguagem Java, um programa que solicite um número de 1 a 7 ao usuário e informe o dia da semana correspondente, sendo domingo o número 1. Caso o número não corresponda a um dia da semana, deve ser exibida uma mensagem de erro.
*/

import java.util.Scanner;
public class exercicio01 {
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        int dia;

        System.out.println("Digite um número de 1 a 7: ");
        dia = entrada.nextInt();

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido");
        }
    }
}

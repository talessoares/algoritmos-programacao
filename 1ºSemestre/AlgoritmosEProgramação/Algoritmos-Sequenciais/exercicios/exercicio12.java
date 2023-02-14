package exercicios;
/*
EX-12
Escreva um programa em linguagem Java que leia um número inteiro que representa a idade de uma pessoa (em anos). Calcule numa variável real quantos dias esta pessoa já viveu e apresente na tela.
*/

import java.util.Scanner;
public class exercicio12 {
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        int idade;
        double dias;

        System.out.println("Digite a idade da pessoa: ");
        idade = entrada.nextInt();

        dias = idade * 365;

        System.out.println("A pessoa já viveu " + dias + " dias.");
    }
    
}

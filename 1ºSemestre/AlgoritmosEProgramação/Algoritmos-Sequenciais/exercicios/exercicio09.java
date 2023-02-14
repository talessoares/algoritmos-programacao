package exercicios;
/*
EX-09
Escreva um programa em linguagem Java que recebe a base e a altura de um retângulo e calcula e imprime a área.
*/

import java.util.Scanner;
public class exercicio09 {
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;

        System.out.println("Digite o valor da base: ");
        base = entrada.nextDouble();
        
        System.out.println("Digite o valor da altura: ");
        altura = entrada.nextDouble();

        area = base * altura;

        System.out.println("O valor da área é: " + area);
    }
    
}

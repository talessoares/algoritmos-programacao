package exercicios;
/*
EX-05
Faça um programa em Java para ler a base e a altura de um retângulo e imprimir o valor correspondente ao perímetro e a área deste. 
*/

import java.util.Scanner;
public class exercicio05 {
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        int base;
        int altura;
        int area;
        int perimetro;

        System.out.println("Digite o valor da base: ");
        base = entrada.nextInt();

        System.out.println("Digite o valor da altura: ");
        altura = entrada.nextInt();

        area = base * altura;
        perimetro = (base * altura) * 2;

        System.out.println("O valor da área é: " + area);
        System.out.println("O valor do perímetro é: " + perimetro);
    }
    
}

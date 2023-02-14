package exercicios;
/*
EX-03
Faça um programa em Java para ler três notas e imprima a média entre elas.
*/

import java.util.Scanner;
public class exercicio03 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double media;

        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();

        System.out.println("Digite a terceira nota: ");
        nota3 = entrada.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média das notas é: " + media);
    }
    
}

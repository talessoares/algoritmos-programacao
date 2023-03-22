/*
EX-02 
Desenvolva, em Linguagem Java, um programa que solicite ao usuárioum algarismo de 0 a 9 e escreva-o por extenso. Caso o número não corresponda a um dos algarismos, deve ser exibida uma mensagem de erro.
*/

import java.util.Scanner;
public class exercicio02 {
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número de 0 a 9: ");
        numero = entrada.nextInt();

        switch (numero){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Três");
                break;
            case 4:
                System.out.println("Quatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Sete");
                break;
            case 8:
                System.out.println("Oito");
                break;
            case 9:
                System.out.println("Nove");
                break;
            default:
                System.out.println("Número inválido");
        }
    }
    
}

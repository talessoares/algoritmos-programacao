/*
EX-03  
Desenvolva, em Linguagem Java, um programa que solicite um número de 1 a 4 ao usuário e informe a estação do ano correspondente, sendo verão o número 1, outono o número 2, inverno o número 3, e primavera o número 4. Caso o número não corresponda a uma estação, deve ser exibida uma mensagem de erro.
*/

import java.util.Scanner;
public class exercicio03 {
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        int estacao;

        System.out.println("Digite um número de 1 a 4: ");
        estacao = entrada.nextInt();

        switch (estacao){
            case 1:
                System.out.println("Verão");
                break;
            case 2:
                System.out.println("Outono");
                break;
            case 3:
                System.out.println("Inverno");
                break;
            case 4:
                System.out.println("Primavera");
                break;
            default:
                System.out.println("Número inválido");
        }
    }
}

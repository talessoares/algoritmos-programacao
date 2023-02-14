package exercicios;
/*
EX-13
Um empregado em uma determinada empresa ganha um bônus de 2 salários a cada 5 anos. Faça um pseudocódigo que leia a quantidade de anos que o funcionário trabalhou e diga quantas vezes ele ganhou o bônus.
*/

import java.util.Scanner;
public class exercicio13 {
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        int anos;
        int bonus;

        System.out.println("Digite a quantidade de anos que o funcionário trabalhou: ");
        anos = entrada.nextInt();

        bonus = anos / 5;

        System.out.println("O funcionário ganhou o bônus " + bonus + " vezes.");
    }
}

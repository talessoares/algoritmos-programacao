package exercicios;
/*
EX-02  
Faça um programa que leia três notas, calcule a média entre elas e verifique a situação do aluno na tabela abaixo. Ao final o programa deve apresentar ao usuário a seguinte mensagem: media = x : situação.

|  Média |  Situação |
|:------:|:---------:|
| >= 6.0 |  Aprovado |
|  < 6.0 | Reprovado |

Por exemplo:

N1 = 7.3

N2 = 4.9

N3 = 8

Saída: Media = 6.93 : Aprovado
*/

import java.util.Scanner;

public class exercicio02 {
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        double n1, n2, n3, media;

        System.out.println("Digite a primeira nota: ");
        n1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota: ");
        n2 = entrada.nextDouble();

        System.out.println("Digite a terceira nota: ");
        n3 = entrada.nextDouble();

        media = (n1 + n2 + n3) / 3;

        if (media >= 6.0){
            System.out.println("Média = " + media + " : Aprovado");
        } else {
            System.out.println("Média = " + media + " : Reprovado");
        }
    }
    
}

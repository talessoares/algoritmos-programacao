package exercicios;
/*
EX-03  
Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:

|  Idade  | Categoria |
|:-------:|:---------:|
| 10 - 14 |  Infantil |
| 15 - 17 |  Juvenil  |
| 18 - 25 |   Adulto  |
|  Outros |  Inválida |

Por exemplo:

Idade = 17

Saída: Categoria Juvenil
*/

import java.util.Scanner;

public class exercicio03 {
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        int idade;

        System.out.println("Digite a idade: ");
        idade = entrada.nextInt();

        if (idade >= 10 && idade <= 14){
            System.out.println("Categoria Infantil");
        } else if (idade >= 15 && idade <= 17){
            System.out.println("Categoria Juvenil");
        } else if (idade >= 18 && idade <= 25){
            System.out.println("Categoria Adulto");
        } else {
            System.out.println("Categoria Inválida");
        }
    }
    
}

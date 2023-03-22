package exercicios;
/*
EX-05
Faça um programa que leia a idade de uma pessoa e informe se ela pode ou não votar de acordo com a tabela abaixo.

|            Idade            |     Situação     |
|:---------------------------:|:----------------:|
| Abaixo de 16                | Não pode votar   |
| Entre 16 e 18 e acima de 70 | Voto facultativo |
| Entre 18 e 70               | Voto obrigatório |

Por exemplo:

Idade = 80

Saída: Voto facultativo

Idade = 15

Saída: Não pode votar
*/

import java.util.Scanner;
public class exercicio05 {
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        int idade;

        System.out.println("Digite a idade: ");
        idade = entrada.nextInt();

        if (idade < 16){
            System.out.println("Não pode votar");
        } else if (idade >= 16 && idade <= 18){
            System.out.println("Voto obrigatório");
        } else {
            System.out.println("Voto facultativo");
        }
    }
    
}

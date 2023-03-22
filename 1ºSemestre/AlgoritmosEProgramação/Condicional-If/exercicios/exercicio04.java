package exercicios;
/*
EX-04  
Faça um programa que receba a quantidade de pessoas que assistiram a uma partida de futebol e mostre as mensagens de acordo com a tabela:

|       Público      |      Situação     |
|:------------------:|:-----------------:|
|   Menor que 5000   |   Público Fraco   |
| Entre 5000 e 20000 |    Público Bom    |
|   Acima de 20000   | Público Excelente |

Por exemplo:

Publico = 8598

Saída: Publico Bom
*/

import java.util.Scanner;
public class exercicio04 {
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        int publico;

        System.out.println("Digite a quantidade de pessoas que assistiram a partida: ");
        publico = entrada.nextInt();

        if (publico < 5000){
            System.out.println("Público Fraco");
        } else if (publico >= 5000 && publico <= 20000){
            System.out.println("Público Bom");
        } else {
            System.out.println("Público Excelente");
        }
    }
    
}

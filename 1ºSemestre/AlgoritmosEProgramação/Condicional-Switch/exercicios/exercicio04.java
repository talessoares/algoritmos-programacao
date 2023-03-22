/*
EX-04  
Desenvolva, em Linguagem Java, um programa que solicite ao usuário o preço de um produto e o código relativo à forma de pagamento. De acordo com a tabela dada abaixo, deve ser aplicado o desconto especificado e o programa deve exibir o número de prestações e o valor de cada prestação a ser paga:

|    Forma de Pagamento   | Código | Desconto em cada parcela |
|:-----------------------:|:------:|-------------------------:|
| À vista (parcela única) |    1   |                      30% |
| Em duas vezes           |    2   |                      20% |
| Em três vezes           |    3   |                      10% |
| De 4 a 6 vezes          |    4   |             Sem desconto |

*/

import java.util.Scanner;
public class exercicio04 {
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        int formaPagamento;
        double preco, precoDesconto, parcela;

        System.out.println("Digite o preço do produto: ");
        preco = entrada.nextDouble();

        System.out.println("Digite em quantas parcelas deseja pagar: ");
        formaPagamento = entrada.nextInt();

        switch (formaPagamento){
            case 1:
                precoDesconto = preco * 0.7;
                System.out.println("À vista (parcela única) - 30% de desconto");
                System.out.println("Preço final: " + precoDesconto);
                break;
            case 2:
                precoDesconto = preco * 0.8;
                parcela = precoDesconto / 2;
                System.out.println("Em duas vezes - 20% de desconto");
                System.out.println("Preço final: " + precoDesconto);
                System.out.println("Parcelas: 2");
                System.out.println("Valor de cada parcela: " + parcela);
                break;
            case 3:
                precoDesconto = preco * 0.9;
                parcela = precoDesconto / 3;
                System.out.println("Em três vezes - 10% de desconto");
                System.out.println("Preço final: " + precoDesconto);
                System.out.println("Parcelas: 3");
                System.out.println("Valor de cada parcela: " + parcela);
                break;
            case 4:
                parcela = preco / 4;
                System.out.println("De 4 a 6 vezes - Sem desconto");
                System.out.println("Preço final: " + preco);
                System.out.println("Parcelas: 4");
                System.out.println("Valor de cada parcela: " + parcela);
                break;
            default:
                System.out.println("Forma de pagamento inválida");
        }
    }
}

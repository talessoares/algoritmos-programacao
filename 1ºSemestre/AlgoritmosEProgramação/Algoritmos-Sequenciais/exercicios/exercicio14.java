package exercicios;
/*
EX-14
João quer saber quantos litros de álcool precisa colocar em seu carro e quanto vai gastar para fazer uma viagem até a casa de sua mãe. 
Faça um pseudocódigo que calcule o quanto João vai gastar em dinheiro e quantos litros de álcool serão usados para chegar até a casa de sua mãe. 
Para isso, considere as seguintes informações:

-A distância da casa de João até sua mãe: 1500km;

-O carro de João consome 9 litros de álcool por quilômetro rodado;

-O preço do álcool é R$ 5,00 o litro.
*/

public class exercicio14 {
    public void main (String args[]){
        int distancia;
        int consumo;
        int preco;
        int litros;
        int gasto;

        distancia = 1500;
        consumo = 9;
        preco = 5;

        litros = distancia * consumo;
        gasto = litros * preco;

        System.out.println("O João vai gastar " + gasto + " reais e vai usar " + litros + " litros de álcool.");
    }
    
}

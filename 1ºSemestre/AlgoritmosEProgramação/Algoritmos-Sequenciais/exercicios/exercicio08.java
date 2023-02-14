package exercicios;
/*
EX-08
Faça um programa em Java para ler um número que representa a temperatura em Celsius e converta para Fahrenheit, imprimindo o resultado na tela. Lembrando que 0ºC = 32ºF e que cada 1ºC equivale a 1,8ºF. Por exemplo, 30ºC equivale à 86ºF.
*/

import java.util.Scanner;
public class exercicio08 {
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        double celsius;
        double fahrenheit;

        System.out.println("Digite o valor em celsius: ");
        celsius = entrada.nextDouble();

        fahrenheit = (celsius * 1.8) + 32;

        System.out.println("O valor em fahrenheit é: " + fahrenheit);

    }
}

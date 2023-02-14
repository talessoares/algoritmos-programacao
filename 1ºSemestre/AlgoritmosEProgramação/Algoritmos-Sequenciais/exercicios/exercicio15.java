package exercicios;
/*
EX-15
Escrever um programa em linguagem Java que leia o peso de uma vaca, só a parte inteira, calcular e imprimir:

a) O peso da vaga em gramas.

b) Novo peso, em gramas, se a vaca engordar 50%
*/

import java.util.Scanner;
public class exercicio15 {
    public void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        double peso;
        double pesoGramas;
        double novoPeso;

        System.out.println("Digite o peso da vaca: ");
        peso = entrada.nextDouble();

        pesoGramas = peso * 1000;
        novoPeso = pesoGramas * 1.5;

        System.out.println("O peso da vaca em gramas é: " + pesoGramas);
        System.out.println("O novo peso (+50%) da vaca em gramas é: " + novoPeso);
    }
    
}

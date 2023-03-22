package exercicios;
/*
EX-06  
Faça um programa que leia o peso (kg) e a altura (m) de uma pessoa. A partir dessas informações, calcule o índice de massa corporal (IMC = peso / altura²)), verifique a situação de acordo com a tabela abaixo e escreva a frase: IMC = x : situação.

|        IMC        |          Situação         |
|:-----------------:|:-------------------------:|
| Abaixo de 18.5    | Abaixo do peso ideal      |
| Entre 18.5 e 24.9 | Peso ideal                |
| Entre 25.0 e 29.9 | Acima do peso (sobrepeso) |
| 30.0 e acima      | Obesidade                 |

Por exemplo:

Peso = 80
Altura = 1.80

Saída: IMC = 24.69 : Peso ideal
*/

import java.util.Scanner;
public class exercicio06 {
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        double peso, altura, imc;

        System.out.println("Digite o peso: ");
        peso = entrada.nextDouble();

        System.out.println("Digite a altura: ");
        altura = entrada.nextDouble();

        imc = peso / (altura * altura);

        if (imc < 18.5){
            System.out.println("IMC = " + imc + " : Abaixo do peso ideal");
        } else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("IMC = " + imc + " : Peso ideal");
        } else if (imc >= 25.0 && imc <= 29.9){
            System.out.println("IMC = " + imc + " : Acima do peso (sobrepeso)");
        } else {
            System.out.println("IMC = " + imc + " : Obesidade");
        }
    }
    
}

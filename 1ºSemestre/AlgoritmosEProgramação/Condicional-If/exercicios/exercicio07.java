package exercicios;
/*
EX-07
Faça um programa que leia a hora (entre 0 e 23) e os minutos (0 e 59) e informe o total de segundos. Se a hora informada for menor que 0 ou maior que 23, então informe a mensagem “Hora incorreta”. Se os minutos informados for menor que 0 ou maior que 59, então informe a mensagem “Minutos incorretos”. Se a hora e os minutos estiverem incorretos então informe as duas mensagens.

Por exemplo:

Hora = 5
Minutos = 30

Saída: 19800 segundos

Hora = 24
Minutos = 61

Saída: Hora incorreta
Minutos incorretos
*/

import java.util.Scanner;
public class exercicio07 {
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        int hora, minutos, segundos;

        System.out.println("Digite a hora: ");
        hora = entrada.nextInt();

        System.out.println("Digite os minutos: ");
        minutos = entrada.nextInt();

        if(hora < 0 || hora > 23) {
	        System.out.println("Hora incorreta");
	        if(minutos < 0 || minutos > 59) {
	            System.out.print("Minutos incorretos");
	        }
	    } else if(minutos < 0 || minutos > 59) {
	        System.out.print("Minutos incorretos");
	    } else {
	        System.out.print(((hora * 3600) + (minutos * 60)) + " segundos");
	    }    
    
    }
    
}

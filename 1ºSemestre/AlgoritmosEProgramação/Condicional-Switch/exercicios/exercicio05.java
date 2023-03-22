/*
EX-05  
Desenvolva, em Linguagem Java, um programa que apresente um menu ao usuário com as opções apresentadas na tabela abaixo e solicite ao usuário qual a opção desejada. Para cada opção, o programa deverá exibir a ação que foi escolhida.

| Opção | Ação      |
|:-----:|-----------|
| a     | Cadastrar |
| b     | Editar    |
| c     | Consultar |
| d     | Remover   |
| e     | Sair      |
*/

import java.util.Scanner;
public class exercicio05 {
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);
        char opcao;

        System.out.println("Digite a opção desejada: ");
        opcao = entrada.next().charAt(0);

        switch (opcao){
            case 'a':
                System.out.println("Cadastrar");
                break;
            case 'b':
                System.out.println("Editar");
                break;
            case 'c':
                System.out.println("Consultar");
                break;
            case 'd':
                System.out.println("Remover");
                break;
            case 'e':
                System.out.println("Sair");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}

package estruraselecao;

//Faça um programa em Linguagem Java, que leia a idade de uma pessoa
// e escrever a mensagem ‘Você é maior de idade’ se ele tiver 18 anos ou mais

import java.util.Scanner;

public class Maioridade {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite sua idade: ");
            int idade = entrada.nextInt();

            if (idade >= 18) {
                System.out.println("Você é maior de idade");
            }
        }

    }
}

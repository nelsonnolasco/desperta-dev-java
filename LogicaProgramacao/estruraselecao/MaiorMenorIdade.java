package estruraselecao;

// Faça um programa em Linguagem Java, que leia a idade de uma pessoa
// e escrever a mensagem ‘Você é maior de idade’ se ele tiver 18 anos ou mais,
// ou ‘Você é menor de idade’ caso contrário.

import java.util.Scanner;

public class MaiorMenorIdade {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite sua idade: ");
            int idade = entrada.nextInt();

            if (idade >= 18) {
                System.out.println("Você é maior de idade");
            } else {
                System.out.println("Você é menor de idade");
            }
        }

    }
}

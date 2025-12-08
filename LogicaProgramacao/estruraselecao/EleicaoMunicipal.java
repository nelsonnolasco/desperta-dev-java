package estruraselecao;

// Faça um programa em Linguagem Java, para ler o ano de nascimento de uma pessoa
// e escrever uma mensagem que diga se ele poderá ou não votar na eleição municipal de 2022.
// (Não é necessário considerar o mês em que nasceu).

import java.util.Scanner;

public class EleicaoMunicipal {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite o ano de nascimento: ");
            int anoNascimento = entrada.nextInt();

            if (anoNascimento <= 2006) {
                System.out.println("Você pode votar na eleição municipal de 2022.");
            } else {
                System.out.println("Você não pode votar na eleição municipal de 2022.");
            }
        }

    }
}

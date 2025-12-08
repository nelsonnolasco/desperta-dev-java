package estruraselecao;

// Faça um programa em Linguagem Java, para ler dois números
// e imprimir qual é o maior. Desconsidere empates.

import java.util.Scanner;

public class MaiorDeDoisNumeros {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número: ");
            int numero1 = input.nextInt();

            System.out.println("Digite o segundo número: ");
            int numero2 = input.nextInt();

            if (numero1 > numero2) {
                System.out.println("O maior número é: " + numero1);
            } else if (numero1 < numero2) {
                System.out.println("O maior número é: " + numero2);
            } else {
                System.out.println("Houve um empate!");
            }
        }

    }
}

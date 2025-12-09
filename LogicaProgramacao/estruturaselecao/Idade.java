package estruturaselecao;

// Faça um programa em Linguagem Java, para ler a idade
// de uma pessoa e exibir uma mensagem dizendo se ela está
// compreendida entre 18 e 65 anos.

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite sua idade: ");
            int idade = entrada.nextInt();

            if (idade >= 18 && idade <= 65) {
                System.out.println("Idade compreendida entre 18 e 65 anos");
            } else {
                System.out.println("Idade fora do intervalo entre 18 e 65 anos");
            }
        }

    }
}

package estruturarepeticao;

/*
Faça um programa em Linguagem Java, que receba vários números, calcule e mostre:
• a soma dos números digitados;
• a quantidade de números digitados;
• a média dos números digitados
• o maior número digitado;
• o menor número digitado;
Finalize a entrada de dados com a digitação do número -999
 */

import java.util.Scanner;

public class VariosNumeros {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int numero;
            int quantidade = 0;
            int soma = 0;
            int maior = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;

            System.out.println("Digite vários números. Para finalizar, digite -999.");

            while (true) {
                System.out.print("Digite um número: ");
                numero = sc.nextInt();

                if (numero == -999) {
                    break; // encerra o loop
                }

                soma += numero;
                quantidade++;

                if (numero > maior) {
                    maior = numero;
                }

                if (numero < menor) {
                    menor = numero;
                }
            }

            System.out.println("\n=== RESULTADOS ===");

            if (quantidade == 0) {
                System.out.println("Nenhum número válido foi digitado.");
            } else {
                double media = (double) soma / quantidade;

                System.out.println("Soma dos números: " + soma);
                System.out.println("Quantidade de números digitados: " + quantidade);
                System.out.printf("Média dos números digitados: %.2f%n", media);
                System.out.println("Maior número digitado: " + maior);
                System.out.println("Menor número digitado: " + menor);
            }
        }
    }
}


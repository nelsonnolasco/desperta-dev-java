package estruraselecao;
// Faça um programa em Linguagem Java, para ler a temperatura
// de uma pessoa e exibir a mensagem “ESTÁ COM FEBRE” ou
// “NÃO ESTÁ COM FEBRE”. Considere o valor da base como 37,5

import java.util.Scanner;

public class Febre {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite a temperatura em Celsius: ");
            double temperatura = entrada.nextDouble();

            if (temperatura >= 37.5) {
                System.out.println("ESTÁ COM FEBRE");
            } else {
                System.out.println("NÃO ESTÁ COM FEBRE");
            }

        }
    }
}

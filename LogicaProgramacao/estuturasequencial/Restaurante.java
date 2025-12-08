package estuturasequencial;

import java.util.Scanner;

//O restaurante a quilo Bem-Bão cobra R$ 12,00 por quilo de refeição.
// Faça um programa em Linguagem Java, que leia o peso do prato montado
// pelo cliente (em quilos) e imprima o valor a pagar. Assume que a balança
// já desconte o peso do prato.
public class Restaurante {
    public static void main(String[] args) {

        final double PRECO_QUILO = 12.00;

        try (Scanner entrada = new Scanner(System.in)) {

            System.out.print("Digite o peso do prato (em quilos): ");
            double pesoPrato = entrada.nextDouble();

            double valorAPagar = pesoPrato * PRECO_QUILO;

            System.out.printf("Valor a pagar: R$ %.2f%n", valorAPagar);
        }
    }
}

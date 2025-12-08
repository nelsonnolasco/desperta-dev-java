package estuturasequencial;

// Faça um programa em Linguagem Java, para ler o salário de um funcionário
// e aumentá-lo em 15%. Após o aumento, desconte 8% de impostos.
// Imprima o salário inicial, o salário com o aumento e o salário final.

import java.util.Scanner;

import java.util.Scanner;

public class SalarioAumentoImposto {
    public static void main(String[] args) {

        final double AUMENTO = 0.15; // 15%
        final double IMPOSTO = 0.08; // 8%

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite o valor do seu salário: ");
            double salarioInicial = input.nextDouble();

            double salarioComAumento = salarioInicial + (salarioInicial * AUMENTO);
            double salarioFinal = salarioComAumento - (salarioComAumento * IMPOSTO);

            System.out.printf("Salário inicial: R$ %.2f%n", salarioInicial);
            System.out.printf("Salário com aumento (15%%): R$ %.2f%n", salarioComAumento);
            System.out.printf("Salário final após desconto de 8%% de imposto: R$ %.2f%n", salarioFinal);
        }
    }
}

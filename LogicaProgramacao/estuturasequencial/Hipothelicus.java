package estuturasequencial;
// A empresa Hipothelicus paga R$ 10,00 por hora normal trabalhada, e R$ 15,00 por hora extra.
// Faça um programa em Linguagem Java, para calcular e imprimir o salário bruto e o salário líquido
// do funcionário. Considere que o salário líquido do funcionário é igual ao salário bruto descontado
// 10 % de impostos.

import java.util.Scanner;

public class Hipothelicus {
    public static void main(String[] args) {
        final double HORA_NORMAL = 10.00;
        final double HORA_EXTRA = 15.00;
        final double IMPOSTO = 0.10;

        try (Scanner input = new Scanner(System.in)){
            System.out.println("Digite o número de horas normais trabalhadas: ");
            int horasNormais = input.nextInt();

            System.out.println("Digite o número de horas extras trabalhadas: ");
            int horasExtras = input.nextInt();

            double salarioBruto = (horasNormais * HORA_NORMAL) + (horasExtras * HORA_EXTRA);
            double salarioLiquido = salarioBruto * (1 - IMPOSTO);

            System.out.printf("Salário bruto:  R$ %.2f%n", salarioBruto);
            System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);

        }
    }

}

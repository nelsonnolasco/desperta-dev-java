package estuturasequencial;

import java.util.Scanner;

// Pedrinho tem um cofrinho com muitas moedas, e deseja saber quantos reais ele conseguiu poupar.
// Faça um programa em Linguagem Java, para ler a quantidade de cada tipo de moeda e imprimir o
// valor total economizado, em reais.
// Considere que existem moedas de 1, 5, 10, 25 e 50 centavos, e ainda moedas de 1 real.
// Não havendo moeda de um tipo a quantidade respectiva é zero.

public class CofrinhoPedrinho {
    public static void main(String[] args) {

        // Valores das moedas em centavos
        final int MOEDA_1_CENT   = 1;
        final int MOEDA_5_CENT   = 5;
        final int MOEDA_10_CENT  = 10;
        final int MOEDA_25_CENT  = 25;
        final int MOEDA_50_CENT  = 50;
        final int MOEDA_1_REAL   = 100; // 1 real = 100 centavos

        try (Scanner entrada = new Scanner(System.in)) {

            System.out.print("Digite a quantidade de moedas de 1 real: ");
            int qtdMoedas1Real = entrada.nextInt();

            System.out.print("Digite a quantidade de moedas de 50 centavos: ");
            int qtdMoedas50 = entrada.nextInt();

            System.out.print("Digite a quantidade de moedas de 25 centavos: ");
            int qtdMoedas25 = entrada.nextInt();

            System.out.print("Digite a quantidade de moedas de 10 centavos: ");
            int qtdMoedas10 = entrada.nextInt();

            System.out.print("Digite a quantidade de moedas de 5 centavos: ");
            int qtdMoedas5 = entrada.nextInt();

            System.out.print("Digite a quantidade de moedas de 1 centavo: ");
            int qtdMoedas1 = entrada.nextInt();

            // Subtotais em centavos
            int total1RealCent   = qtdMoedas1Real * MOEDA_1_REAL;
            int total50Cent      = qtdMoedas50    * MOEDA_50_CENT;
            int total25Cent      = qtdMoedas25    * MOEDA_25_CENT;
            int total10Cent      = qtdMoedas10    * MOEDA_10_CENT;
            int total5Cent       = qtdMoedas5     * MOEDA_5_CENT;
            int total1Cent       = qtdMoedas1     * MOEDA_1_CENT;

            // Total geral em centavos
            int totalCentavos = total1RealCent + total50Cent + total25Cent
                    + total10Cent + total5Cent + total1Cent;

            // Conversão para reais (double)
            double total1RealReais = total1RealCent / 100.0;
            double total50Reais    = total50Cent    / 100.0;
            double total25Reais    = total25Cent    / 100.0;
            double total10Reais    = total10Cent    / 100.0;
            double total5Reais     = total5Cent     / 100.0;
            double total1Reais     = total1Cent     / 100.0;

            double totalReais = totalCentavos / 100.0;

            System.out.println();
            System.out.println("Resumo do cofrinho do Pedrinho:");
            System.out.println("------------------------------------");
            System.out.printf("Moedas de 1 real:      %5d -> R$ %7.2f%n", qtdMoedas1Real, total1RealReais);
            System.out.printf("Moedas de 50 centavos: %5d -> R$ %7.2f%n", qtdMoedas50,    total50Reais);
            System.out.printf("Moedas de 25 centavos: %5d -> R$ %7.2f%n", qtdMoedas25,    total25Reais);
            System.out.printf("Moedas de 10 centavos: %5d -> R$ %7.2f%n", qtdMoedas10,    total10Reais);
            System.out.printf("Moedas de 5 centavos:  %5d -> R$ %7.2f%n", qtdMoedas5,     total5Reais);
            System.out.printf("Moedas de 1 centavo:   %5d -> R$ %7.2f%n", qtdMoedas1,     total1Reais);
            System.out.println("------------------------------------");
            System.out.printf("TOTAL:                          R$ %7.2f%n", totalReais);
        }
    }
}

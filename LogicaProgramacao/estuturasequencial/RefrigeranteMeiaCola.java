package estuturasequencial;

import java.util.Scanner;

// A fábrica de refrigerantes Meia-Cola vende seu produto em três formatos:
// lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros.
// Faça um programa em Linguagem Java para calcular quantos litros de
// refrigerante foram comprados ao todo, mostrando também quanto vem de
// cada tipo de embalagem.

public class RefrigeranteMeiaCola {
    public static void main(String[] args) {

        final int LATA_350_ML     = 350;
        final int GARRAFA_600_ML  = 600;
        final int GARRAFA_2000_ML = 2000;

        try (Scanner entrada = new Scanner(System.in)) {

            System.out.print("Digite a quantidade de latas de 350 ml: ");
            int qtdLatas350 = entrada.nextInt();

            System.out.print("Digite a quantidade de garrafas de 600 ml: ");
            int qtdGarrafas600 = entrada.nextInt();

            System.out.print("Digite a quantidade de garrafas de 2 litros: ");
            int qtdGarrafas2000 = entrada.nextInt();

            // Quantidades em ml
            int totalLataMl     = qtdLatas350     * LATA_350_ML;
            int totalGarrafa600Ml  = qtdGarrafas600  * GARRAFA_600_ML;
            int totalGarrafa2000Ml = qtdGarrafas2000 * GARRAFA_2000_ML;

            int totalMl = totalLataMl + totalGarrafa600Ml + totalGarrafa2000Ml;

            // Conversão para litros (com casas decimais)
            double totalLataLitros     = totalLataMl / 1000.0;
            double totalGarrafa600Litros  = totalGarrafa600Ml / 1000.0;
            double totalGarrafa2000Litros = totalGarrafa2000Ml / 1000.0;
            double totalLitros = totalMl / 1000.0;

            System.out.println();
            System.out.printf("Litros vindos de latas 350 ml:      %.3f L%n", totalLataLitros);
            System.out.printf("Litros vindos de garrafas 600 ml:   %.3f L%n", totalGarrafa600Litros);
            System.out.printf("Litros vindos de garrafas 2 litros: %.3f L%n", totalGarrafa2000Litros);
            System.out.printf("TOTAL de litros comprados:          %.3f L%n", totalLitros);
        }
    }
}

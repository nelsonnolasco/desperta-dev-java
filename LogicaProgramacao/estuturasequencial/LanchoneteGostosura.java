package estuturasequencial;

import java.util.Scanner;

// A lanchonete Gostosura vende apenas um tipo de sanduíche,
// cujo recheio inclui duas fatias de queijo, uma fatia de presunto
// e uma rodela de hambúrguer. Sabendo que cada fatia de queijo ou presunto
// pesa 50 gramas, e que uma rodela de hambúrguer pesa 100 gramas,
// faça um programa em Linguagem Java, em que o dono forneça a quantidade de
// sanduíches a fazer, e o computador forneça as quantidades (em quilos)
// de queijo, presunto e carne necessários para compra.
public class LanchoneteGostosura {
    public static void main(String[] args) {

        final int GRAMA_FATIA_QUEIJO = 50;
        final int GRAMA_FATIA_PRESUNTO = 50;
        final int GRAMA_HAMBURGUER = 100;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Qual a quantidade de sanduíche a fazer: ");
            int quantidadeSanduiches = scanner.nextInt();

            // Quantidades em gramas
            int totalQueijoGramas = quantidadeSanduiches * 2 * GRAMA_FATIA_QUEIJO;
            int totalPresuntoGramas = quantidadeSanduiches * GRAMA_FATIA_PRESUNTO;
            int totalCarneGramas = quantidadeSanduiches * GRAMA_HAMBURGUER;

            // Converte para quilos
            double totalQueijoKg = totalQueijoGramas / 1000.0;
            double totalPresuntoKg = totalPresuntoGramas / 1000.0;
            double totalCarneKg = totalCarneGramas / 1000.0;

            System.out.println();
            System.out.printf("Quantidade de queijo necessária:   %.3f kg%n", totalQueijoKg);
            System.out.printf("Quantidade de presunto necessária: %.3f kg%n", totalPresuntoKg);
            System.out.printf("Quantidade de carne necessária:    %.3f kg%n", totalCarneKg);



        }
    }
}

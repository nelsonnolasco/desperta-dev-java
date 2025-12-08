package estuturasequencial;
// Faça um programa em Linguagem Java,
// para calcular quantas ferraduras são necessárias para equipar todos os cavalos comprados para um haras.

import java.util.Scanner;

public class FerradurasParaCavalos {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Quantos cavalos foram comprados para o haras? ");
            int cavalos = input.nextInt();

            int ferraduras = cavalos * 4;

            System.out.println("Será necessário comprar " + ferraduras + " ferraduras para equipar o haras.");

        }
    }
}

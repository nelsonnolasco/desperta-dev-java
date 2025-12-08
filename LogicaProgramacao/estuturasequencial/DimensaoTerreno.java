package estuturasequencial;
// A imobiliária Imóbilis vende apenas terrenos retangulares.
// Faça um programa em Linguagem Java, para ler as dimensões e depois exibir a área do terreno.

import java.util.Scanner;

public class DimensaoTerreno {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)){
            System.out.println ("Digite o valor da base do terreno: ");
            double base = entrada.nextDouble();

            System.out.println ("Digite a altura do terreno: ");
            double altura = entrada.nextDouble();

            double area = (base * altura);

            System.out.println("A área do terreno é de: " + area + " metros quadrados");

        }
    }
}

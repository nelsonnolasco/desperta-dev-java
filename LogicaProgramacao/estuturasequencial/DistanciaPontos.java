package estuturasequencial;

// Faça um programa em Linguagem Java, para calcular
// a distância entre dois pontos do plano cartesiano.
// Cada ponto é um par ordenado (x, y).

import java.util.Scanner;

public class DistanciaPontos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Leitura do primeiro ponto
        System.out.print("Digite o valor de x1: ");
        double x1 = entrada.nextDouble();

        System.out.print("Digite o valor de y1: ");
        double y1 = entrada.nextDouble();

        // Leitura do segundo ponto
        System.out.print("Digite o valor de x2: ");
        double x2 = entrada.nextDouble();

        System.out.print("Digite o valor de y2: ");
        double y2 = entrada.nextDouble();

        // Cálculo da distância
        double dx = x2 - x1;
        double dy = y2 - y1;

        double distancia = Math.sqrt(dx * dx + dy * dy);

        // Saída formatada
        System.out.printf("A distancia entre os dois pontos é: %.4f%n", distancia);

        entrada.close();
    }
}

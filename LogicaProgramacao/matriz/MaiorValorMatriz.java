package matriz;

import java.util.Scanner;

public class MaiorValorMatriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        System.out.println("Digite os valores da matriz 4x4:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }

        int maior = matriz[0][0];
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        System.out.println("Maior valor da matriz: " + maior);
        System.out.println("Localização: linha " + linha + ", coluna " + coluna);

        entrada.close();
    }
}


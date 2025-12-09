package estruturarepeticao;
/*
Foi feita uma pesquisa para determinar o índice de mortalidade infantil em certo período.
Faça um programa em Linguagem Java, que:
• leia o número de crianças nascidas no período;
• identifique o sexo (M ou F) e tempo de vida em meses da criança nascida, de cada criança.
O programa em Linguagem Java, deve calcular e mostrar:
a) a porcentagem de crianças do sexo femininos mortos no período;
b) a porcentagem de crianças do sexo masculino mortas no período;
c) a porcentagem de crianças que viveram 24 meses ou menos no período.
 */

import java.sql.SQLOutput;
import java.util.Scanner;

import java.util.Scanner;

public class MortalidadeInfantil {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Digite o número de crianças nascidas no período: ");
            int totalCriancas = sc.nextInt();

            int mortosFeminino = 0;
            int mortosMasculino = 0;
            int mortosAte24Meses = 0;

            for (int i = 1; i <= totalCriancas; i++) {
                System.out.println("\n--- Criança " + i + " ---");

                // validação de entrada do sexo
                char sexo;
                while (true) {
                    System.out.print("Sexo (M/F): ");
                    sexo = sc.next().toUpperCase().charAt(0);

                    if (sexo == 'M' || sexo == 'F') {
                        break; // entrada válida, sai do while
                    } else {
                        System.out.println("Entrada inválida! Digite apenas M ou F.");
                    }
                }

                System.out.print("Tempo de vida (em meses): ");
                int meses = sc.nextInt();

                // Consideramos que toda criança registrada teve morte,
                // conforme o enunciado estatístico.
                if (sexo == 'F') {
                    mortosFeminino++;
                } else {
                    mortosMasculino++;
                }

                if (meses <= 24) {
                    mortosAte24Meses++;
                }
            }

            // Cálculo das porcentagens
            double percFem = (mortosFeminino * 100.0) / totalCriancas;
            double percMasc = (mortosMasculino * 100.0) / totalCriancas;
            double percAte24 = (mortosAte24Meses * 100.0) / totalCriancas;

            System.out.println("\n=== RESULTADOS ===");
            System.out.printf("a) Percentual de mortes do sexo feminino: %.2f%%\n", percFem);
            System.out.printf("b) Percentual de mortes do sexo masculino: %.2f%%\n", percMasc);
            System.out.printf("c) Percentual de crianças que viveram 24 meses ou menos: %.2f%%\n", percAte24);

        }
    }
}


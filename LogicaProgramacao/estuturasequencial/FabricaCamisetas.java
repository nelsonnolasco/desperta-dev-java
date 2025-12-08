package estuturasequencial;

import java.util.Scanner;

// Uma fábrica de camisetas produz os tamanhos, pequeno, médio e grande,
// cada uma vendida respetivamente por 10, 12 e 15 reais.
// Faça um programa em Linguagem Java, em que o usuário forneça a quantidade
// de camisetas pequenas, médias e grandes referentes a uma venda, e o computador
// informe quanto será o valor arrecadado.
public class FabricaCamisetas {
    static void main(String[] args) {

        final int camisetaPequena = 10;
        final int camisetaMedia = 12;
        final int camisetaGrande = 15;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de camisetas pequenas vendidas: ");
        int numeroCamisetasPequenas = sc.nextInt();

        System.out.println("Digite o numero de camisetas media vendidas: ");
        int numeroCamisetasMedias = sc.nextInt();

        System.out.println("Digite o numero de camisetas grande: ");
        int numeroCamisetasGrandes = sc.nextInt();

        int vrArrecadado = (camisetaPequena * numeroCamisetasPequenas) + (camisetaMedia * numeroCamisetasMedias)
                           + (camisetaGrande * numeroCamisetasGrandes);
        System.out.println("O valor total arrecadado na venda foi de: " + vrArrecadado);


    }
}

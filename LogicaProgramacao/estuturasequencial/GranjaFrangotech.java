package estuturasequencial;
//A Granja Frangotech possui um controle automatizado de cada frango da sua produção.
// No pé direito do frango há um anel com um chip de identificação;
// no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir.
// Sabendo que o anel com chip custa R$4,00 e o anel de alimento custa R$3,50.
// Faça um programa em Linguagem Java, para calcular o gasto total da granja para marcar
// todos os seus frangos.

import java.util.Scanner;

public class GranjaFrangotech {
    public static void main(String[] args) {
        final double CUSTO_CHIP = 4.00;
        final double CUSTO_ANEL_ALIMENTO = 3.50;

        try (Scanner input = new Scanner(System.in)){
            System.out.println("Digite a quantidade de frangos: ");
            int quantidadeFrangos = input.nextInt();

            double custoTotal = (quantidadeFrangos * CUSTO_CHIP) + (quantidadeFrangos * 2 * CUSTO_ANEL_ALIMENTO);
            System.out.printf("Custo total: R$ %.2f%n", custoTotal);
        }
    }
}

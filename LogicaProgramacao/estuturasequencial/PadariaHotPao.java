package estuturasequencial;

// A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a cada dia.
// Cada pãozinho custa R$0,12 e a broa custa R$1,50. Ao final do dia, o dono quer saber quanto arrecadou
// com a venda dos pães e broas(juntos), e quanto deve guardar em uma poupança (10% do arrecadado).
// Você foi contratado para fazer os cálculos para o dono. Com base nestes fatos, faça um programa em
// Linguagem Java, para ler as quantidades de pães e de broas, e depois calcular e mostrar os dados solicitados.

import java.util.Scanner;

public class PadariaHotPao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número de pães vendidos no dia: ");
        int paes = input.nextInt();

        System.out.println("Digite o número de broas vendidas no dia: ");
        int broas = input.nextInt();

        double valorTotalPaes = paes * 0.12;
        double valorTotalBroas = broas * 1.50;

        double lucro = valorTotalPaes + valorTotalBroas;
        double poupanca = lucro * 0.10;

        System.out.println("O número de pães vendidos no dia foi de " + paes + " pães, num total de R$" + valorTotalPaes);
        System.out.println("O número de broas vendidas no dia foi de " + broas + " broas, num total de R$" + valorTotalBroas);
        System.out.println("A Padaria Hotpão teve o seguinte LUCRO = R$" + lucro);
        System.out.println("O valor poupado pela Padaria Hotpão foi de R$" + poupanca);

        input.close();
    }
}

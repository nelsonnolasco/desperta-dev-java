package estuturasequencial;

import java.util.Scanner;

public class ConversaoDolar {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o valor em reais a ser convertido em dólares: ");
            double valorReal = sc.nextDouble();
            System.out.println("Digite o valor atual do dólar: ");
            double dolar = sc.nextDouble();
            double conversaoDolar = valorReal / dolar;
            System.out.println("O valor de R$ " + valorReal + " convertido em dólar, corresponde a U$: " + conversaoDolar + " .");
        }
    }
}

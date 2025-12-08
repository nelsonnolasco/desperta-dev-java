package estuturasequencial;

import java.util.Scanner;

public class NumeroReal{
    public static void main (String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Digite um número real: ");
            double numero = entrada.nextDouble();

            System.out.println("Você digitou o número: " + numero);
        }
    }

}
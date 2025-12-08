package estuturasequencial;

import java.util.Scanner;

public class Inteiro {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Digite um número inteiro: ");
            int numero = entrada.nextInt();

            System.out.println("Você digitou o número: " + numero);
        }
    }
}
    
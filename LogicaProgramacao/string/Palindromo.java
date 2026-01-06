package string;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String texto = entrada.nextLine();

        boolean palindromo = true;
        int inicio = 0;
        int fim = texto.length() - 1;

        while (inicio < fim) {
            if (texto.charAt(inicio) != texto.charAt(fim)) {
                palindromo = false;
                break;
            }
            inicio++;
            fim--;
        }

        if (palindromo) {
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        entrada.close();
    }
}


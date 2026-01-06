package string;

import java.util.Scanner;

public class QuatroPrimeirasLetras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = entrada.nextLine();

        if (texto.length() >= 4) {
            System.out.println("Primeiras quatro letras: " + texto.substring(0, 4));
        } else {
            System.out.println("A string deve ter pelo menos 4 caracteres.");
        }

        entrada.close();
    }
}

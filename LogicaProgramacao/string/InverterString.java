package string;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = entrada.nextLine();

        for (int i = texto.length() - 1; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }

        entrada.close();
    }
}


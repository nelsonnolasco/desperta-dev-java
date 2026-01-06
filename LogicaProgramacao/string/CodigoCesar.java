package string;

import java.util.Scanner;

public class CodigoCesar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = entrada.nextLine();

        String novaString = "";

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c >= 'a' && c <= 'z') {
                c = (char) (c + 3);
                if (c > 'z') {
                    c = (char) (c - 26);
                }
            } else if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 3);
                if (c > 'Z') {
                    c = (char) (c - 26);
                }
            }

            novaString += c;
        }

        System.out.println("Nova String: " + novaString);

        entrada.close();
    }
}


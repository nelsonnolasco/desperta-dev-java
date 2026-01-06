package string;

import java.util.Scanner;

public class SubstituiVogais {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = entrada.nextLine();

        System.out.print("Digite um caractere para substituir as vogais: ");
        char substituto = entrada.next().charAt(0);

        int qtdVogais = 0;
        StringBuilder novaString = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' ||
                    c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' ||
                    c == 'O' || c == 'U') {

                qtdVogais++;
                novaString.append(substituto);
            } else {
                novaString.append(c);
            }
        }

        System.out.println("Nova string: " + novaString);
        System.out.println("Quantidade de vogais: " + qtdVogais);

        entrada.close();
    }
}


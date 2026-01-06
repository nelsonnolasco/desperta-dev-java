package string;

import java.util.Scanner;

public class ContaCaracteres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = entrada.nextLine();

        int contador = 0;

        for (char c : texto.toCharArray()) {
            contador++;
        }

        System.out.println("Quantidade de caracteres: " + contador);

        entrada.close();
    }
}


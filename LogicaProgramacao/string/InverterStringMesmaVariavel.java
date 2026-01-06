package string;

import java.util.Scanner;

public class InverterStringMesmaVariavel {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = entrada.nextLine();

        String invertida = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i);
        }

        // a string invertida passa a ocupar a mesma variável
        texto = invertida;

        System.out.println("String invertida: " + texto);

        entrada.close();
    }
}


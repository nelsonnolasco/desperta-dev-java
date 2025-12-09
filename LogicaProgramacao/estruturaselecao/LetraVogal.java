package estruturaselecao;

import java.util.Scanner;

// Faça um programa em Linguagem Java, para ler uma letra
// e imprimir a mensagem “É UMA VOGAL” se condizente.
// Assume que as letras são sempre maiúsculas.
public class LetraVogal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma letra (A–Z): ");
        String letra = sc.nextLine().trim().toUpperCase();

        // Assume entrada válida e em maiúsculo
        if (letra.equals("A") || letra.equals("E") || letra.equals("I") ||
                letra.equals("O") || letra.equals("U")) {

            System.out.println("É UMA VOGAL");
        } else {
            System.out.println("NÃO É UMA VOGAL, TRATA-SE DE UM CONSOANTE");
        }

        sc.close();
    }
}

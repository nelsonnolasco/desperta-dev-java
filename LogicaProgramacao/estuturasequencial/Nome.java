package estuturasequencial;//Faça um programa em Linguagem Java, para ler um nome e mostrar ele na tela

import java.util.Scanner;

public class Nome {

    public static void main (String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            String nome = entrada.nextLine();

            System.out.println("Seu nome é: " + nome);
        }
    }
}
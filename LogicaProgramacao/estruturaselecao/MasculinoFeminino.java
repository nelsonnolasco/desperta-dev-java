package estruturaselecao;

// Faça um programa em Linguagem Java, para ler o sexo de uma pessoa (“M” ou “F”)
// e exibir a mensagem (“MASCULINO” ou "FEMININO"). Assuma somente entrada válida.

import java.util.Scanner;

public class MasculinoFeminino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o sexo (M ou F): ");

        String sexo = sc.nextLine().trim().toUpperCase(); // trim() serve para remover espaços em branco no início e no fim da String. e toUpperCase() serve para converter a String para maiúsculas
        if (sexo.equals("M")) {

            System.out.println("MASCULINO");
        } else if (sexo.equals("F")) {
            System.out.println("FEMININO");
        } else {
            System.out.println("Entrada inválida! Digite apenas M ou F.");
        }

        sc.close();
    }
}
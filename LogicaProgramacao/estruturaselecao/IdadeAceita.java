package estruturaselecao;

// Faça um programa em Linguagem Java, para ler o nome, sexo (M ou F)
// e a idade de uma pessoa. Se a pessoa for do sexo feminino e tiver
// menos que 25 anos, imprimir o nome da pessoa e a mensagem “ACEITA”.
// Caso Contrário, imprimir o nome da pessoa e a mensagem “NÃO ACEITA”.
// (Considerar f ou F).

import java.util.Scanner;

public class IdadeAceita {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite seu nome ");
            String nome = entrada.nextLine();

            System.out.println("Digite seu sexo (M ou F)");
            String sexo = entrada.nextLine().trim().toUpperCase();

            System.out.println("Digite sua idade");
            int idade = entrada.nextInt();

            if (sexo.equals("F") && idade < 25) {
                System.out.println(nome + " ACEITA");
            } else {
                System.out.println(nome + " NÃO ACEITA");
            }
        }

    }

}

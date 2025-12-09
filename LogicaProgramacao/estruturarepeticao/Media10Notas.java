package estruturarepeticao;

// Faça um programa em Linguagem Java,
// para escrever e calcular a média aritmética de 10 notas.

import java.util.Scanner;

// Sem while
/*
public class Media10Notas {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            double soma = 0.0;

            for (int i = 1; i <= 10; i++) {
                System.out.print("Digite a nota " + i + ": ");
                double nota = sc.nextDouble();
                soma += nota;
            }

            double media = soma / 10;

            System.out.println("A média das 10 notas é: " + media);
        }
    }
}
*/

// Com while

public class Media10Notas {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            double soma = 0.0;
            int contador = 1;

            while (contador <= 10) {
                System.out.print("Digite a nota " + contador + ": ");
                double nota = sc.nextDouble();
                soma += nota;
                contador++;
            }

            double media = soma / 10;
            System.out.println("A média das 10 notas é: " + media);
        }
    }
}

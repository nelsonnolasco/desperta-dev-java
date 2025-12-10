package estruturaselecao;

import java.util.Scanner;

/*
Faça um programa em Linguagem Java, para ler dois números
e imprimir o maior número (Suponha números diferentes).
 */
public class MaiorNumero {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {

            System.out.println("Digite dois números: ");
            double numero1 = entrada.nextDouble();
            double numero2 = entrada.nextDouble();

            if (numero1 == numero2) {
                System.out.println("Os números são iguais.");

            } else if (numero1 > numero2) {
                System.out.println("O número maior é: " + numero1);
            } else {
                System.out.println("O número maior é: " + numero2);
            }
        }
    }
}


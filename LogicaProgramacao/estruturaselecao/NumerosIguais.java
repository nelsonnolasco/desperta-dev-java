package estruturaselecao;

/*
Faça um programa em Linguagem Java, para ler dois números
e imprimir uma mensagem dizendo se são iguais ou diferentes.
 */

import java.util.Scanner;

public class NumerosIguais {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite dois números: ");
            double numero1 = entrada.nextDouble();
            double numero2 = entrada.nextDouble();

            if (numero1 == numero2) {
                System.out.println("Os números são iguais.");
            } else {
                System.out.println("Os números são diferentes.");
            }
        }
    }
}

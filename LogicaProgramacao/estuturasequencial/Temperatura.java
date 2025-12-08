package estuturasequencial;
// Alguns países medem a temperatura em graus Celsius e outros em fahrenheit.
// Faça um programa em Linguagem Java, para ler uma temperatura em Celsius e imprimir em fahrenheit.
// (Pesquise como fazer esse tipo de conversão).


import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite a temperatura em Celsius: ");
            double celsius = entrada.nextDouble();
            double fahrenheit = (celsius * 1.8) + 32;
            System.out.println("A temperatura em fahrenheit é: " + fahrenheit);

        }


    }

}

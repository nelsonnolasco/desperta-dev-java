package estuturasequencial;
// Faça um programa em Linguagem Java, para ler um número inteiro e escreva o seu cubo.

/*
import java.util.Scanner;

public class CuboDeUmNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um número a ser elevado ao cubo");
        double numero1 = sc.nextDouble();

        double cubo;
        cubo = numero1 * numero1 * numero1;

        System.out.println ("O cubo do número digitado é: " + cubo);
    }
}
*/


 // outra forma de se fazer o cubo de um número usando Math:

import java.util.Scanner;

public class CuboDeUmNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um número a ser elevado ao cubo");
        double numero1 = sc.nextDouble();

        double cubo = Math.pow (numero1, 3); // base, expoente

        System.out.println ("O cubo do número digitado é: " + cubo);

        sc.close();
    }
}
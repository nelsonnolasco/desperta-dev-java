package estuturasequencial;

import java.util.Scanner;

public class DoisNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double numero1 = entrada.nextDouble();

        System.out.println ("Digite o segundo número: ");
        double numero2 = entrada.nextDouble();

        double soma = numero1 + numero2;
        System.out.println ("A somatória dos dois números é: "+ soma);

        entrada.close();



    }
}

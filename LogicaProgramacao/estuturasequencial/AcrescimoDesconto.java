package estuturasequencial;
// Faça um programa em Linguagem Java,
// para ler dois valores reais e exibir o primeiro com acréscimo de 30%, e o segundo com desconto de 25%.
import java.util.Scanner;

public class AcrescimoDesconto {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println ("Digite o valor a ter acréscimo de 30%: ");
            double valor1 = sc.nextDouble();

            System.out.println("Digite o valor a ter desconto de 25%: ");
            double valor2 = sc.nextDouble();

            double acrescimo = valor1 + (valor1 * .30);
            double desconto = valor2 - (valor2 * .25);
            System.out.println("O valor de " + valor1 + " acrescido de 30% passa a ser de: " +  acrescimo + " e o valor de " + valor2 + " com o desconto de 25% é passa a ser de: " + desconto);
        }

    }
}

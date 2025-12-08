package estuturasequencial;

import java.sql.SQLOutput;
import java.util.Scanner;

// Faça um programa em Linguagem Java, para ler o salário de um funcionário e imprimi-lo com aumento de 15%.
public class AumentoSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de seu salário para calcularmos o aumento de 15%: ");
        double salario = sc.nextDouble();

        double salarioAtualizado = salario + (salario * 0.15);

        System.out.println("O valor de seu salário atualizado passar ser de: " +salarioAtualizado);

        sc.close();

    }
}

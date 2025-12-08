package estuturasequencial;

import java.util.Scanner;

public class DiasVida {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int idade = input.nextInt();

        int dias = idade * 365;

        System.out.println("O seu número de dias vividos é de: " + dias);
    }
}

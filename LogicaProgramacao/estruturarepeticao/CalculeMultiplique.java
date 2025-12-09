package estruturarepeticao;

// Faça um programa em Linguagem Java,
// para calcular e escrever a multiplicação dos números de 1 a 25.
/*
public class CalculeMultiplique {
    public static void main(String[] args) {
        for (int i = 1; i <= 25; i++) {
            System.out.println(i * i);
        }
    }
} */

public class CalculeMultiplique {
    public static void main(String[] args) {

        long resultado = 1;

        for (int i = 1; i <= 25; i++) {
            resultado *= i;
        }

        System.out.println("O resultado da multiplicação de 1 a 25 é: " + resultado);
    }
}


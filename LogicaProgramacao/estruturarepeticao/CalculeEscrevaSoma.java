package estruturarepeticao;

// Faça um programa em Linguagem Java,
// para calcular e escrever a soma dos números de 0 a 20.

public class CalculeEscrevaSoma {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 0; i <= 20; i++) {
            soma += i;
        }
        System.out.println(soma);
    }

}

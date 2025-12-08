package estuturasequencial;

//Faça um programa em Linguagem Java, para ler três notas de um aluno numa
// disciplina e imprimir a sua média ponderada
// (as notas têm pesos 1, 2 e 3 respetivamente).
import java.util.Scanner;

public class NotasMediaPonderada {
    static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite a primeira nota: ");
            double nota1 = input.nextDouble();
            System.out.println("Digite a segunda nota: ");
            double nota2 = input.nextDouble();
            System.out.println("Digite a terceira nota: ");
            double nota3 = input.nextDouble();

            double mediaPonderada = ((nota1*1) + (nota2*2) + (nota3*3))/6;

            System.out.println("Media Ponderada: " + mediaPonderada);
        }
    }
}

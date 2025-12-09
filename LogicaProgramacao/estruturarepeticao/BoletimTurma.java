package estruturarepeticao;

/*
Estrutura de repetição

Faça um programa em Linguagem Java, que receba duas notas de seis alunos. Calcule e mostre:
a) a média aritmética das duas notas de cada aluno;
b) a mensagem que está na tabela a seguir:

MÉDIA ARITMÉTICA          MENSAGEM
Até 3                     Reprovado
Entre 3 e 6               Prova final
De 7 para cima            Aprovado

c) o total de alunos aprovados;
d) o total de alunos de exame;
e) o total de alunos reprovados;
f) a média da turma.
 */

import java.util.Scanner;

public class BoletimTurma {
    public static void main(String[] args) {

        final int QUANTIDADE_ALUNOS = 6;

        int totalAprovados = 0;
        int totalExame = 0;
        int totalReprovados = 0;
        double somaMediasTurma = 0.0;

        try (Scanner sc = new Scanner(System.in)) {

            for (int i = 1; i <= QUANTIDADE_ALUNOS; i++) {
                System.out.println("\n--- Aluno " + i + " ---");

                System.out.print("Digite a primeira nota: ");
                double nota1 = sc.nextDouble();

                System.out.print("Digite a segunda nota: ");
                double nota2 = sc.nextDouble();

                double media = (nota1 + nota2) / 2.0;
                somaMediasTurma += media;

                System.out.printf("Média do aluno %d: %.2f%n", i, media);

                // Classificação conforme a média
                if (media <= 3.0) {
                    System.out.println("MENSAGEM: Reprovado");
                    totalReprovados++;
                } else if (media < 7.0) { // aqui já sabemos que media > 3
                    System.out.println("MENSAGEM: Prova final");
                    totalExame++;
                } else {
                    System.out.println("MENSAGEM: Aprovado");
                    totalAprovados++;
                }
            }
        }

        double mediaTurma = somaMediasTurma / QUANTIDADE_ALUNOS;

        System.out.println("\n=== RESUMO DA TURMA ===");
        System.out.println("Total de alunos aprovados: " + totalAprovados);
        System.out.println("Total de alunos de exame: " + totalExame);
        System.out.println("Total de alunos reprovados: " + totalReprovados);
        System.out.printf("Média da turma: %.2f%n", mediaTurma);
    }
}


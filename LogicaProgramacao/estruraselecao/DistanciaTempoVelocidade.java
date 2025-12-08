package estruraselecao;

//Faça um programa em Linguagem Java, para ler a distância (km)
// e o tempo de viagem (horas) de um automóvel, e dizer se a
// velocidade média for superior ao limite (110 km/h) ou não.

import java.util.Scanner;

public class DistanciaTempoVelocidade {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite a distância percorrida em km: ");
            double distancia = entrada.nextDouble();

            System.out.println("Digite o tempo de viagem em horas: ");
            double tempo = entrada.nextDouble();

            double velocidade = distancia / tempo;

            if (velocidade > 110) {
                System.out.println("Velocidade acima do limite de 110 km/h!");
            } else
                System.out.println("Velocidade dentro do limite de 110 km/h!");

        }
    }
}

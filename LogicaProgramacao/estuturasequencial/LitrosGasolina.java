package estuturasequencial;
// Um motorista deseja colocar no seu tanque X reais de gasolina.
// Escreva um programa em Linguagem Java, para ler o preço do litro da gasolina
// e o valor do pagamento e exibir quantos litros ele conseguiu colocar no tanque.
import java.util.Scanner;

public class LitrosGasolina {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do Litro da Gasolina: ");
        double litro = input.nextDouble();
        System.out.println("Digite o valor total pago: ");
        double totalPago = input.nextDouble();

        double litrosNoTanque = totalPago / litro;

        System.out.printf("Foram colocados %.2f litros de gasolina no tanque.%n", litrosNoTanque);

        input.close();

    }
}

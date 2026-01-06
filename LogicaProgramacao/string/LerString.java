package string;
import java.util.Scanner;

public class LerString {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = entrada.nextLine();

        System.out.println("Você digitou: " + texto);

        entrada.close();
    }
}


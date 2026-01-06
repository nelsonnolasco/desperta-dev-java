package string;

import java.util.Scanner;

public class ContemString {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira string: ");
        String s1 = entrada.nextLine();

        System.out.print("Digite a segunda string: ");
        String s2 = entrada.nextLine();

        if (s1.contains(s2)) {
            System.out.println("A segunda string está contida na primeira.");
        } else {
            System.out.println("A segunda string NÃO está contida na primeira.");
        }

        entrada.close();
    }
}

